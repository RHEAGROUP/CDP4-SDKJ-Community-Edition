/* --------------------------------------------------------------------------------------------------------------------
 * Requirement.java
 * Copyright (c) 2018 RHEA System S.A.
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a requirement in a RequirementsSpecification
 * Note 1: The identifier of the requirement is specified in the <i>shortName</i>. The title or summary description of the requirement is specified in the <i>name</i>.
 * Note 2: The textual body of the requirement is specified in the <i>content</i> of the associated Definition.
 */
@Container(clazz = RequirementsSpecification.class, propertyName = "requirement")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Requirement extends SimpleParameterizableThing implements Cloneable, CategorizableThing, DeprecatableThing {
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
     * Initializes a new instance of the {@link Requirement} class.
     */
    public Requirement() {
        this.category = new ArrayList<Category>();
        this.parametricConstraint = new OrderedItemList<ParametricConstraint>(this, true);
    }

    /**
     * Initializes a new instance of the {@link Requirement} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Requirement(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.category = new ArrayList<Category>();
        this.parametricConstraint = new OrderedItemList<ParametricConstraint>(this, true);
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> category;

    /**
     * Property group.
     * optional reference to a RequirementsGroup of which this Requirement is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private RequirementsGroup group;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * List of ordered contained ParametricConstraint.
     * optional parametric constraint that provides a specification of a quantifiable requirement in the form of a boolean expression
     * Note: In addition to a textual specification of a requirement, such a constraint enables a precise mathematical formulation of the requirement in the form of a boolean expression that can in principle be evaluated by machine. It may form the basis for an automated comparison with Parameters of the same ParameterType(s) as used in the ParametricConstraint of ElementDefinitions that characterise the achieved or realizable capabilities and performances of a designed solution.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<ParametricConstraint> parametricConstraint;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link Requirement}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets an {@link List<List>} that references the composite properties of the current {@link Requirement}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<List>(super.getContainerLists());
        containers.add(this.parametricConstraint);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link Requirement} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Requirement}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        Requirement clone;
        try {
            clone = (Requirement)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow Requirement cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setParameterValue(cloneContainedThings ? new ContainerList<SimpleParameterValue>(clone) : new ContainerList<SimpleParameterValue>(this.getParameterValue(), clone, false));
        clone.setParametricConstraint(cloneContainedThings ? new OrderedItemList<ParametricConstraint>(clone, true) : new OrderedItemList<ParametricConstraint>(this.getParametricConstraint(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getParameterValue().addAll(this.getParameterValue().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getParametricConstraint().addAll(this.getParametricConstraint().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Requirement} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Requirement}.
     */
    @Override
    public Requirement clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Requirement)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Requirement}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Requirement} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Requirement dto = (cdp4common.dto.Requirement)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setGroup((dto.getGroup() != null) ? this.getCache().get<RequirementsGroup>(dto.getGroup.getValue(), dto.getIterationContainerId()) : null);
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setOwner(this.getCache().get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel(DomainOfExpertise.class));
        this.getParameterValue().resolveList(dto.getParameterValue(), dto.getIterationContainerId(), this.getCache());
        this.getParametricConstraint().resolveList(dto.getParametricConstraint(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Requirement}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.Requirement dto = new cdp4common.dto.Requirement(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setGroup(this.getGroup() != null ? (UUID)this.getGroup().getIid() : null);
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameterValue().addAll(this.getParameterValue().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getParametricConstraint().addAll(this.getParametricConstraint().toDtoOrderedItemList());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
