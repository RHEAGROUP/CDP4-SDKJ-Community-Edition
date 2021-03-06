package cdp4jsonserializer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.Version;
import cdp4common.commondata.ClassKind;
import cdp4common.dto.FileRevision;
import cdp4common.dto.Thing;
import cdp4common.types.OrderedItem;
import cdp4common.types.ValueArray;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Cdp4JsonSerializerImplTest {

  private Cdp4JsonSerializerImpl serializer;

  @BeforeEach
  void setup() {
    this.serializer = new Cdp4JsonSerializerImpl();
    this.serializer.initialize(new Version("1.1.0"));
  }

  @Test
  void serializesPropertiesAccordingToVersion() throws IOException {
    String expectedJson = "{\"classKind\":\"File\",\"excludedDomain\":[],\"excludedPerson\":[],\"iid\":\"b3e2edac-3fea-4b7a-964f-c129b6dd63b2\",\"modifiedOn\":\"2019-08-02T14:11:56.58Z\",\"revisionNumber\":0,\"category\":[],\"fileRevision\":[\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\"],\"lockedBy\":null,\"owner\":\"0e92edde-fdff-41db-9b1d-f2e484f12535\"}";
    UUID engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    UUID iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    UUID domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    UUID fileIid = UUID.fromString("b3e2edac-3fea-4b7a-964f-c129b6dd63b2");
    UUID fileRevisionIid = UUID.fromString("e8de903b-9c38-416a-83f4-90b6cf7b7a41");
    UUID domainOfExpertiseIid = UUID.fromString("0e92edde-fdff-41db-9b1d-f2e484f12535");

    cdp4common.dto.File file = new cdp4common.dto.File(fileIid, 0);
    file.setOwner(domainOfExpertiseIid);
    file.getFileRevision().add(fileRevisionIid);
    file.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    file.addContainer(ClassKind.Iteration, iterationIid);
    file.addContainer(ClassKind.EngineeringModel, engineeringModelIid);
    file.setModifiedOn(OffsetDateTime.of(2019, 8, 2, 14, 11, 56, 580_000_000, ZoneOffset.UTC));

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(file, outputStream);

    assertTrue(areEqualBySumOfBytes(expectedJson, outputStream.toString()));
  }

  @Test
  void serializesPropertiesExcludingWithHigherVersion() throws IOException {
    String expectedJson = "{\"classKind\":\"File\",\"iid\":\"b3e2edac-3fea-4b7a-964f-c129b6dd63b2\",\"revisionNumber\":0,\"category\":[],\"fileRevision\":[\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\"],\"lockedBy\":null,\"owner\":\"0e92edde-fdff-41db-9b1d-f2e484f12535\"}";

    this.serializer.initialize(new Version("1.0.0"));

    UUID engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    UUID iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    UUID domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    UUID fileIid = UUID.fromString("b3e2edac-3fea-4b7a-964f-c129b6dd63b2");
    UUID fileRevisionIid = UUID.fromString("e8de903b-9c38-416a-83f4-90b6cf7b7a41");
    UUID domainOfExpertiseIid = UUID.fromString("0e92edde-fdff-41db-9b1d-f2e484f12535");

    cdp4common.dto.File file = new cdp4common.dto.File(fileIid, 0);
    file.setOwner(domainOfExpertiseIid);
    file.getFileRevision().add(fileRevisionIid);
    file.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    file.addContainer(ClassKind.Iteration, iterationIid);
    file.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(file, outputStream);

    assertTrue(areEqualBySumOfBytes(expectedJson, outputStream.toString()));
  }

  @Test
  void areEqualBySumOfBytesReturnsTrueTest() {
    String s1 = "asdfgqwert";
    String s2 = "qwertgfdsa";

    assertTrue(areEqualBySumOfBytes(s1, s2));
  }

  @Test
  void areEqualBySumOfBytesReturnsFalseTest() {
    String s1 = "asdfgqwert";
    String s2 = "qwertgfdst";

    assertFalse(areEqualBySumOfBytes(s1, s2));
  }

  @Test
  void orderedItemWithNullMIsSerializedTest() throws IOException {
    String expected = "{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}";

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(new OrderedItem(1, "b16894e4-acb5-4e81-a118-16c00eb86d8f"),
        outputStream);

    assertEquals(expected, outputStream.toString());
  }

  @Test
  void orderedItemWithSetMIsSerializedTest() throws IOException {
    String expected = "{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\",\"m\":2}";

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    OrderedItem item = new OrderedItem(1, "b16894e4-acb5-4e81-a118-16c00eb86d8f");
    item.moveItem(1, 2);
    this.serializer.serializeToStream(item, outputStream);

    assertEquals(expected, outputStream.toString());
  }

  @Test
  void orderedItemWithNullMIsDeserializedTest() throws IOException {
    String source = "{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
    OrderedItem item = this.serializer.deserialize(new TypeReference<OrderedItem>() {
    }, inputStream);

    assertEquals(1, item.getK());
    assertEquals("b16894e4-acb5-4e81-a118-16c00eb86d8f", item.getV());
    assertNull(item.getM());
  }

  @Test
  void orderedItemWithSetMIsDeserializedTest() throws IOException {
    String source = "{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\",\"m\":2}";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
    OrderedItem item = this.serializer.deserialize(new TypeReference<OrderedItem>() {
    }, inputStream);

    assertEquals(1, item.getK());
    assertEquals("b16894e4-acb5-4e81-a118-16c00eb86d8f", item.getV());
    assertEquals(2, item.getM());
  }

  @Test
  void orderedItemListIsSerializedTest() throws IOException {
    String expected = "{\"classKind\":\"FileRevision\",\"containingFolder\":null,\"contentHash\":\"F73747371CFD9473C19A0A7F99BCAB008474C4CA\",\"createdOn\":null,\"creator\":\"284334dd-e8e5-42d6-bc8a-715c507a7f02\",\"excludedDomain\":[],\"excludedPerson\":[],\"fileType\":[{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}],\"iid\":\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\",\"modifiedOn\":null,\"name\":\"testfile\",\"revisionNumber\":0}";

    UUID fileTypeIid = UUID.fromString("b16894e4-acb5-4e81-a118-16c00eb86d8f");
    UUID participantIid = UUID.fromString("284334dd-e8e5-42d6-bc8a-715c507a7f02");
    UUID engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    UUID iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    UUID domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    UUID fileIid = UUID.fromString("b3e2edac-3fea-4b7a-964f-c129b6dd63b2");
    UUID fileRevisionIid = UUID.fromString("e8de903b-9c38-416a-83f4-90b6cf7b7a41");

    cdp4common.dto.FileRevision fileRevision = new cdp4common.dto.FileRevision(fileRevisionIid, 0);
    fileRevision.setName("testfile");
    fileRevision.setContentHash("F73747371CFD9473C19A0A7F99BCAB008474C4CA");
    fileRevision.getFileType().add(new OrderedItem(1, fileTypeIid));
    fileRevision.setCreator(participantIid);
    fileRevision.addContainer(ClassKind.File, fileIid);
    fileRevision.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    fileRevision.addContainer(ClassKind.Iteration, iterationIid);
    fileRevision.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(fileRevision, outputStream);

    assertTrue(areEqualBySumOfBytes(expected, outputStream.toString()));
  }

  @Test
  void orderedItemListIsDeserializedTest() throws IOException {
    String source = "[{\"classKind\":\"FileRevision\",\"containingFolder\":null,\"contentHash\":\"F73747371CFD9473C19A0A7F99BCAB008474C4CA\",\"createdOn\":null,\"creator\":\"284334dd-e8e5-42d6-bc8a-715c507a7f02\",\"excludedDomain\":[],\"excludedPerson\":[],\"fileType\":[{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}],\"iid\":\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\",\"modifiedOn\":\"2019-08-02T14:11:56.580Z\",\"name\":\"testfile\",\"revisionNumber\":0}]";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
    List<Thing> fileRevisionList = this.serializer.deserialize(inputStream);

    assertEquals(1, fileRevisionList.size());

    Thing fileRevision = fileRevisionList.get(0);
    assertEquals(1, ((FileRevision) fileRevision).getFileType().size());
    assertEquals(OffsetDateTime.of(2019, 8, 2, 14, 11, 56, 580_000_000, ZoneOffset.UTC),
        ((FileRevision) fileRevision).getModifiedOn());

    OrderedItem fileType = ((FileRevision) fileRevision).getFileType().get(0);
    assertEquals(1, fileType.getK());
    assertEquals("b16894e4-acb5-4e81-a118-16c00eb86d8f", fileType.getV());
    assertNull(fileType.getM());
  }

  @Test
  void valueArrayIsSerializedTest() throws IOException {
    String expected = "\"[\\\"one\\\",\\\"two\\\",\\\"three\\\"]\"";

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    List<String> list = new ArrayList<>();
    list.add(0, "one");
    list.add(1, "two");
    list.add(2, "three");

    this.serializer.serializeToStream(new ValueArray<>(list, String.class), outputStream);

    assertEquals(expected, outputStream.toString());
  }

  @ParameterizedTest
  @MethodSource("getTestStrings")
  void verifyThatValueArrayIsSerializedAndDeserialized(String input) throws IOException {
    ValueArray<String> valueArray = new ValueArray<>(Collections.singletonList(input), String.class);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(valueArray, outputStream);
    String json = outputStream.toString();

    ByteArrayInputStream inputStream = new ByteArrayInputStream(json.getBytes());
    ValueArray<String> result = this.serializer.deserialize(new TypeReference<ValueArray>() {
    }, inputStream);

    assertThat(valueArray).containsExactlyInAnyOrderElementsOf(result);

    outputStream.reset();
    this.serializer.serializeToStream(result, outputStream);
    String resultJson = outputStream.toString();

    assertEquals(json, resultJson);
  }

  @Test
  void thingSerializedWithSortedPropertiesTest() throws IOException {
    String expected = "{\"classKind\":\"FileRevision\",\"containingFolder\":null,\"contentHash\":\"F73747371CFD9473C19A0A7F99BCAB008474C4CA\",\"createdOn\":null,\"creator\":\"284334dd-e8e5-42d6-bc8a-715c507a7f02\",\"excludedDomain\":[],\"excludedPerson\":[\"b16894e4-acb5-4e81-a118-16c00eb86d8f\",\"b18894e4-acb5-4e81-a118-16c00eb86d8f\",\"b19894e4-acb5-4e81-a118-16c00eb86d8f\"],\"fileType\":[{\"k\":4,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"},{\"k\":8,\"v\":\"b19894e4-acb5-4e81-a118-16c00eb86d8f\"},{\"k\":12,\"v\":\"b18894e4-acb5-4e81-a118-16c00eb86d8f\"}],\"iid\":\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\",\"modifiedOn\":null,\"name\":\"testfile\",\"revisionNumber\":0}";

    UUID fileTypeIid1 = UUID.fromString("b19894e4-acb5-4e81-a118-16c00eb86d8f");
    UUID fileTypeIid2 = UUID.fromString("b18894e4-acb5-4e81-a118-16c00eb86d8f");
    UUID fileTypeIid3 = UUID.fromString("b16894e4-acb5-4e81-a118-16c00eb86d8f");
    UUID excludedPerson1 = UUID.fromString("b18894e4-acb5-4e81-a118-16c00eb86d8f");
    UUID excludedPerson2 = UUID.fromString("b19894e4-acb5-4e81-a118-16c00eb86d8f");
    UUID excludedPerson3 = UUID.fromString("b16894e4-acb5-4e81-a118-16c00eb86d8f");
    UUID participantIid = UUID.fromString("284334dd-e8e5-42d6-bc8a-715c507a7f02");
    UUID fileRevisionIid = UUID.fromString("e8de903b-9c38-416a-83f4-90b6cf7b7a41");

    cdp4common.dto.FileRevision fileRevision = new cdp4common.dto.FileRevision(fileRevisionIid, 0);
    fileRevision.setName("testfile");
    fileRevision.setContentHash("F73747371CFD9473C19A0A7F99BCAB008474C4CA");
    fileRevision.getFileType().addAll(Arrays
        .asList(new OrderedItem(8, fileTypeIid1), new OrderedItem(12, fileTypeIid2),
            new OrderedItem(4, fileTypeIid3)));
    fileRevision.setCreator(participantIid);
    fileRevision.setExcludedPerson(Arrays.asList(excludedPerson1, excludedPerson2, excludedPerson3));

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    this.serializer.serializeToStream(fileRevision, outputStream);

    assertEquals(expected, outputStream.toString());
  }

  boolean areEqualBySumOfBytes(String s1, String s2) {
    long s1SumOfBytes = 0;
    long s2SumOfBytes = 0;

    for (byte b : s1.getBytes()) {
      s1SumOfBytes += b;
    }

    for (byte b : s2.getBytes()) {
      s2SumOfBytes += b;
    }

    return s1SumOfBytes == s2SumOfBytes;
  }

  private static String getJsonString() {
    return String.join("\n",
        "{\"widget\": {",
        "\"debug\": \"on\",",
        "\"window\": {",
        "\"title\": \"Sample Konfabulator Widget\",",
        "\"name\": \"main_window\",",
        "\"width\": 500,",
        "\"height\": 500",
        "},",
        "\"image\": {",
        "\"src\": \"Images/Sun.png\",",
        "\"name\": \"sun1\",",
        "\"hOffset\": 250,",
        "\"vOffset\": 250,",
        "\"alignment\": \"center\"",
        "},",
        "\"text\": {",
        "\"data\": \"Click Here\",",
        "\"size\": 36,",
        "\"style\": \"bold\",",
        "\"name\": \"text1\",",
        "\"hOffset\": 250,",
        "\"vOffset\": 100,",
        "\"alignment\": \"center\",",
        "\"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"",
        "}",
        "}",
        "}");
  }

  private static String getXmlString() {

    return String.join("\n",
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>",
        "<bookstore>",
        "<book category=\"cooking\">",
        "<title lang=\"en\">Everyday food</title>",
        "<author>Some great cook</author>",
        "<year>2005</year>",
        "<price>30.00</price>",
        "<data><![CDATA[Within this Character Data block I can",
        "use double dashes as much as I want (along with <, &, ', and \")",
        "*and* %MyParamEntity; will be expanded to the text",
        "\"Has been expanded\" ... however, I can't use",
        "the CEND sequence.If I need to use CEND I must escape one of the",
        "brackets or the greater-than sign using concatenated CDATA sections.",
        "\"]]></data>",
        "</book>",
        "<book category=\"children\">",
        "<title lang=\"en\">Harry the child</title>",
        "<author>Some child author</author>",
        "<year>2005</year>",
        "<price>29.99</price>",
        "</book>",
        "<book category=\"web\">",
        "<title lang=\"en\">Learning XML</title>",
        "<author>Some XML expert</author>",
        "<year>2003</year>",
        "<price>39.95</price>",
        "</book>",
        "</bookstore>");
  }

  private static String[] getTestStrings() {
    String[] strings = {
        "value with trailing spaces  ",
        "value with trailing space ",
        " value with leading spaces",
        "  value with leading space",
        "\t\t\tvalue with leading and trailing tabs \t",
        "\nvalue with leading and trailing linebreaks \r",
        "=2*(2+2)",
        "=2*\n(2+2)",
        "=2*\r(2+2)",
        "=2*\r\n(2+2)",
        "=2*\n\r(2+2)",
        "= 2 * \n ( 2 + 2 )",
        "=2*\b(2+2)",
        "=2*\f(2+2)",
        "=2*\t(2+2)",
        "Ar54WbBu + yhw - R:G!d)C!X_H % Vy ? V",
        "qm+L/{hp,qU[F\nnSyFymmZ\n+F(G/pP8@",
        "JSfJzH!U5:*wcnzT+{a5-L&+Xaq[g4",
        "EfRKJ[*A%uiM9MJ_h-z?9X(KYJQ/xL",
        "B_Dw+Tw.7g,.36]7(j8(k3/hxX,K_y",
        "qKt_C}@).D!ik.4W48ESR}w*VGvaub",
        "33CDr2NPZ[fJQ]p?aXT2L{giUUm}g#",
        "mpb-!ump7S{D)]Z9B@S([FXMRSq/9S",
        "D,VeZQRnV/}?}*qxMeX}N7*%R]!Tf/",
        "L$X7@P,JhcYM,-e4Z5,!ft.UbC[Y{n",
        "QWuAr.P$RUCf(NiV{7}tcwnia:.Fnp",
        "L%%t?cdpa?g#-PE4w6=[yU72Cgxz:f",
        ",GCeVX=$6R,(JJW[mLd4uF@{,Yr%NL",
        "i?5,/.G%D,M3im?8:,+ju}(CMh_E77",
        "}8Bn)rtS4BGTWThmT,=nu,q{[H?):9",
        "ScVmbHjSB[HS$8A*C{awPvvp{%@5Xr",
        "wy6bDVDuim}YLhB24=[y6!4vpM2pTw",
        "f:][.LfcN#(gH=Dq$6Lcp7TWQP7LH!",
        "!&.v8L44$ep69u+W-_5jq?DV@fi($H",
        "?_uB5Z(U$B6,cVPMPJv%q}d[+2PAMZ",
        "[_*q5d$U{qE7}r_7$fdf$h5yBFpPG+",
        getJsonString(),
        getXmlString()
    };

    return strings;
  }
}
