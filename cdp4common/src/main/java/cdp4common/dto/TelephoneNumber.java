/* --------------------------------------------------------------------------------------------------------------------
 * TelephoneNumber.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated DTO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "TelephoneNumber"} class.
 */
@Container(clazz = Person.class, propertyName = "telephoneNumber")
@ToString
@EqualsAndHashCode(callSuper = true)
public class TelephoneNumber extends Thing implements Cloneable {
    /**
     * Initializes a new instance of the {@link "TelephoneNumber"} class.
     */
    public TelephoneNumber()
    {
        this.vcardType = new ArrayList<VcardTelephoneNumberKind>();
    }

    /**
     * Initializes a new instance of the {@link "TelephoneNumber"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public TelephoneNumber(UUID iid, int rev) {
        super(iid, rev);
        this.vcardType = new ArrayList<VcardTelephoneNumberKind>();
    }

    /**
     * The value.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String value;

    /**
     * The list of VcardTelephoneNumberKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<VcardTelephoneNumberKind> vcardType;

    /**
     * Gets the route for the current {@link TelephoneNumber}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.TelephoneNumber} from a {@link TelephoneNumber}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.TelephoneNumber}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.sitedirectorydata.TelephoneNumber(this.getIid(), cache, uri);
    }
}
