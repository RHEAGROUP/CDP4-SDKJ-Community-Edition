/* --------------------------------------------------------------------------------------------------------------------
 * RequirementsSpecification.java
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
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "RequirementsSpecification"} class.
 */
@Container(clazz = Iteration.class, propertyName = "requirementsSpecification")
@ToString
@EqualsAndHashCode(callSuper = true)
public class RequirementsSpecification extends RequirementsContainer implements Cloneable, DeprecatableThing {
    /**
     * Initializes a new instance of the {@link "RequirementsSpecification"} class.
     */
    public RequirementsSpecification()
    {
        this.requirement = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "RequirementsSpecification"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public RequirementsSpecification(UUID iid, int rev) {
        super(iid, rev);
        this.requirement = new ArrayList<UUID>();
    }

    /**
     * Value indicating whether isDeprecated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * The unique identifiers of the contained requirement instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> requirement;

    /**
     * Gets the route for the current {@link RequirementsSpecification}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link RequirementsSpecification}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getRequirement());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.RequirementsSpecification} from a {@link RequirementsSpecification}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.RequirementsSpecification}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.engineeringmodeldata.RequirementsSpecification(this.getIid(), cache, uri);
    }
}
