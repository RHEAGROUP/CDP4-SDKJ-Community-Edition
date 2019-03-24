/* --------------------------------------------------------------------------------------------------------------------
 * OrExpression.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "OrExpression"} class.
 */
@Container(clazz = ParametricConstraint.class, propertyName = "expression")
@ToString
@EqualsAndHashCode(callSuper = true)
public class OrExpression extends BooleanExpression implements Cloneable {
    /**
     * Initializes a new instance of the {@link "OrExpression"} class.
     */
    public OrExpression() {
        this.term = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "OrExpression"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public OrExpression(UUID iid, int rev) {
        super(iid, rev);
        this.term = new ArrayList<UUID>();
    }

    /**
     * The list of unique identifiers of the referenced term instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> term;

    /**
     * Gets the route for the current {@link OrExpression}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.OrExpression} from a {@link OrExpression}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.OrExpression}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.OrExpression(this.getIid(), cache, uri);
    }
}
