/* --------------------------------------------------------------------------------------------------------------------
 * SiteDirectory.java
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
 * A Data Transfer Object representation of the {@link "SiteDirectory"} class.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class SiteDirectory extends TopContainer implements Cloneable, NamedThing, ShortNamedThing, TimeStampedThing {
    /**
     * Initializes a new instance of the {@link "SiteDirectory"} class.
     */
    public SiteDirectory()
    {
        this.annotation = new ArrayList<UUID>();
        this.domain = new ArrayList<UUID>();
        this.domainGroup = new ArrayList<UUID>();
        this.logEntry = new ArrayList<UUID>();
        this.model = new ArrayList<UUID>();
        this.naturalLanguage = new ArrayList<UUID>();
        this.organization = new ArrayList<UUID>();
        this.participantRole = new ArrayList<UUID>();
        this.person = new ArrayList<UUID>();
        this.personRole = new ArrayList<UUID>();
        this.siteReferenceDataLibrary = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "SiteDirectory"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public SiteDirectory(UUID iid, int rev) {
        super(iid, rev);
        this.annotation = new ArrayList<UUID>();
        this.domain = new ArrayList<UUID>();
        this.domainGroup = new ArrayList<UUID>();
        this.logEntry = new ArrayList<UUID>();
        this.model = new ArrayList<UUID>();
        this.naturalLanguage = new ArrayList<UUID>();
        this.organization = new ArrayList<UUID>();
        this.participantRole = new ArrayList<UUID>();
        this.person = new ArrayList<UUID>();
        this.personRole = new ArrayList<UUID>();
        this.siteReferenceDataLibrary = new ArrayList<UUID>();
    }

    /**
     * The unique identifiers of the contained annotation instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> annotation;

    /**
     * The createdOn.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private LocalDateTime createdOn;

    /**
     * The unique identifier of the referenced defaultParticipantRole.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID defaultParticipantRole;

    /**
     * The unique identifier of the referenced defaultPersonRole.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID defaultPersonRole;

    /**
     * The unique identifiers of the contained domain instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> domain;

    /**
     * The unique identifiers of the contained domainGroup instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> domainGroup;

    /**
     * The unique identifiers of the contained logEntry instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> logEntry;

    /**
     * The unique identifiers of the contained model instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> model;

    /**
     * The name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String name;

    /**
     * The unique identifiers of the contained naturalLanguage instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> naturalLanguage;

    /**
     * The unique identifiers of the contained organization instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> organization;

    /**
     * The unique identifiers of the contained participantRole instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> participantRole;

    /**
     * The unique identifiers of the contained person instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> person;

    /**
     * The unique identifiers of the contained personRole instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> personRole;

    /**
     * The shortName.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String shortName;

    /**
     * The unique identifiers of the contained siteReferenceDataLibrary instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> siteReferenceDataLibrary;

    /**
     * Gets the route for the current {@link SiteDirectory}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link SiteDirectory}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getAnnotation());
        containers.add(this.getDomain());
        containers.add(this.getDomainGroup());
        containers.add(this.getLogEntry());
        containers.add(this.getModel());
        containers.add(this.getNaturalLanguage());
        containers.add(this.getOrganization());
        containers.add(this.getParticipantRole());
        containers.add(this.getPerson());
        containers.add(this.getPersonRole());
        containers.add(this.getSiteReferenceDataLibrary());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.SiteDirectory} from a {@link SiteDirectory}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.SiteDirectory}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.sitedirectorydata.SiteDirectory(this.getIid(), cache, uri);
    }
}
