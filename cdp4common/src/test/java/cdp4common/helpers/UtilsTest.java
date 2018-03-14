package cdp4common.helpers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    void getConstantNotationFromUpperCamelTest(){
        Assertions.assertEquals("CONSTANT_NOTATION_TEST", Utils.getConstantNotationFromUpperCamel("ConstantNotationTest"));
    }

    @Test
    void getUpperCamelNotationFromConstantTest(){
        Assertions.assertEquals("ConstantNotationTest", Utils.getUpperCamelNotationFromConstant("CONSTANT_NOTATION_TEST"));
    }

    @Test
    void formatComponentShortNameTest(){
        Assertions.assertEquals("", Utils.formatComponentShortName(null));
        Assertions.assertEquals("4fgr_k0", Utils.formatComponentShortName("4fgr$%k0"));
        Assertions.assertEquals("4fgr_k0", Utils.formatComponentShortName("=-!4fgr$%k0="));
    }
}
