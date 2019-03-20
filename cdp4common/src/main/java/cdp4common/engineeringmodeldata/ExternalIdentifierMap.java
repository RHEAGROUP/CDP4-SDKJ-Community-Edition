/* --------------------------------------------------------------------------------------------------------------------
 * ExternalIdentifierMap.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a mapping that relates E-TM-10-25 instance UUIDs to identifiers of corresponding items in an external tool / model
 * Note: The purpose of such a correspondence mapping is to provide the data to reduce as much as possible the loss of information when performing round trip import / export data transfer between an E-TM-10-25 compliant model and a model in the format of an external tool.
 */
@Container(clazz = Iteration.class, propertyName = "externalIdentifierMap")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ExternalIdentifierMap extends Thing implements Cloneable, NamedThing, OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the {@link ExternalIdentifierMap} class.
     */
    public ExternalIdentifierMap() {
        this.correspondence = new ContainerList<IdCorrespondence>(this);
    }

    /**
     * Initializes a new instance of the {@link ExternalIdentifierMap} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ExternalIdentifierMap(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.correspondence = new ContainerList<IdCorrespondence>(this);
    }

    /**
     * List of contained IdCorrespondence.
     * set of internal Uuid to external identifier correspondence mappings
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<IdCorrespondence> correspondence;

    /**
     * Property externalFormat.
     * optional reference to a ReferenceSource that specifies the format of the external model
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ReferenceSource externalFormat;

    /**
     * Property externalModelName.
     * name of the external model
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String externalModelName;

    /**
     * Property externalToolName.
     * name of the external tool
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String externalToolName;

    /**
     * Property externalToolVersion.
     * optional representation of the version of the external tool
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String externalToolVersion;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String name;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DomainOfExpertise owner;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ExternalIdentifierMap}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link ExternalIdentifierMap}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.correspondence);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ExternalIdentifierMap} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ExternalIdentifierMap}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ExternalIdentifierMap clone;
        try {
            clone = (ExternalIdentifierMap)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ExternalIdentifierMap cannot be cloned.");
        }

        clone.setCorrespondence(cloneContainedThings ? new ContainerList<IdCorrespondence>(clone) : new ContainerList<IdCorrespondence>(this.getCorrespondence(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
            clone.getCorrespondence().addAll(this.getCorrespondence().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ExternalIdentifierMap} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ExternalIdentifierMap}.
     */
    @Override
    public ExternalIdentifierMap clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ExternalIdentifierMap)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ExternalIdentifierMap}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getExternalModelName())) {
            errorList.add("The property externalModelName is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getExternalToolName())) {
            errorList.add("The property externalToolName is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getName())) {
            errorList.add("The property name is null or empty.");
        }

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel(DomainOfExpertise.class));
            this.sentinelResetMap.put("owner", new ActionImpl(() -> this.setOwner(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ExternalIdentifierMap} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ExternalIdentifierMap dto = (cdp4common.dto.ExternalIdentifierMap)dtoThing;

        PojoThingFactory.resolveList(this.getCorrespondence(), dto.getCorrespondence(), dto.getIterationContainerId(), this.getCache(), IdCorrespondence.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setExternalFormat((dto.getExternalFormat() != null) ? PojoThingFactory.get(this.getCache(), dto.getExternalFormat(), dto.getIterationContainerId(), ReferenceSource.class) : null);
        this.setExternalModelName(dto.getExternalModelName());
        this.setExternalToolName(dto.getExternalToolName());
        this.setExternalToolVersion(dto.getExternalToolVersion());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ExternalIdentifierMap}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ExternalIdentifierMap dto = new cdp4common.dto.ExternalIdentifierMap(this.getIid(), this.getRevisionNumber());

        dto.getCorrespondence().addAll(this.getCorrespondence().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setExternalFormat(this.getExternalFormat() != null ? (UUID)this.getExternalFormat().getIid() : null);
        dto.setExternalModelName(this.getExternalModelName());
        dto.setExternalToolName(this.getExternalToolName());
        dto.setExternalToolVersion(this.getExternalToolVersion());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
