/* --------------------------------------------------------------------------------------------------------------------
 * TimeOfDayParameterType.java
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
 * A Data Transfer Object representation of the {@link "TimeOfDayParameterType"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode(callSuper = true)
public class TimeOfDayParameterType extends ScalarParameterType implements Cloneable {
    /**
     * Initializes a new instance of the {@link "TimeOfDayParameterType"} class.
     */
    public TimeOfDayParameterType()
    {
    }

    /**
     * Initializes a new instance of the {@link "TimeOfDayParameterType"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public TimeOfDayParameterType(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * Gets the route for the current {@link TimeOfDayParameterType}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.TimeOfDayParameterType} from a {@link TimeOfDayParameterType}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.TimeOfDayParameterType}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.sitedirectorydata.TimeOfDayParameterType(this.getIid(), cache, uri);
    }
}
