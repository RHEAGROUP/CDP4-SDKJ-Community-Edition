/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOverrideValueSet.java
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
 * representation of the switch setting and all values for a ParameterOverride
 */
@Container(clazz = ParameterOverride.class, propertyName = "valueSet")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParameterOverrideValueSet extends ParameterValueSetBase implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link ParameterOverrideValueSet} class.
     */
    public ParameterOverrideValueSet() {
    }

    /**
     * Initializes a new instance of the {@link ParameterOverrideValueSet} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterOverrideValueSet(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property actualOption.
     * reference to the actual Option to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    private Option actualOption;

    /**
     * Property actualState.
     * reference to the ActualFiniteState to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    private ActualFiniteState actualState;

    /**
     * Property parameterValueSet.
     * reference to the ParameterValueSet that this ParameterOverrideValueSet overrides
     * Note: The <i>parameter</i> must be the same as the <i>container</i> of the referenced ParameterValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterValueSet parameterValueSet;

    /**
     * Sets the actualOption.
     * reference to the actual Option to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     *
     * @throws IllegalStateException The actualOption property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setActualOption(Option actualOption){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverrideValueSet.actualOption");
    }

    /**
     * Sets the actualState.
     * reference to the ActualFiniteState to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     *
     * @throws IllegalStateException The actualState property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setActualState(ActualFiniteState actualState){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverrideValueSet.actualState");
    }

    /**
     * Creates and returns a copy of this {@link ParameterOverrideValueSet} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterOverrideValueSet}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterOverrideValueSet clone;
        try {
            clone = (ParameterOverrideValueSet)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterOverrideValueSet cannot be cloned.");
        }

        clone.setComputed(new ValueArray<String>(this.getComputed(), this));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setFormula(new ValueArray<String>(this.getFormula(), this));
        clone.setManual(new ValueArray<String>(this.getManual(), this));
        clone.setPublished(new ValueArray<String>(this.getPublished(), this));
        clone.setReference(new ValueArray<String>(this.getReference(), this));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ParameterOverrideValueSet} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterOverrideValueSet}.
     */
    @Override
    public ParameterOverrideValueSet clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterOverrideValueSet)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterOverrideValueSet}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getParameterValueSet() == null || this.getParameterValueSet().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterValueSet is null.");
            this.setParameterValueSet(SentinelThingProvider.getSentinel(ParameterValueSet.class));
            this.sentinelResetMap.put("parameterValueSet", new ActionImpl(() -> this.setParameterValueSet(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParameterOverrideValueSet} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterOverrideValueSet dto = (cdp4common.dto.ParameterOverrideValueSet)dtoThing;

        this.setComputed(new ValueArray<String>(dto.getComputed(), this));
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setFormula(new ValueArray<String>(dto.getFormula(), this));
        this.setManual(new ValueArray<String>(dto.getManual(), this));
        this.setModifiedOn(dto.getModifiedOn());
        this.setParameterValueSet(this.getCache().get<ParameterValueSet>(dto.getParameterValueSet(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel(ParameterValueSet.class));
        this.setPublished(new ValueArray<String>(dto.getPublished(), this));
        this.setReference(new ValueArray<String>(dto.getReference(), this));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setValueSwitch(dto.getValueSwitch());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterOverrideValueSet}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.ParameterOverrideValueSet dto = new cdp4common.dto.ParameterOverrideValueSet(this.getIid(), this.getRevisionNumber());

        dto.setComputed(new ValueArray<String>(this.getComputed(), this));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setFormula(new ValueArray<String>(this.getFormula(), this));
        dto.setManual(new ValueArray<String>(this.getManual(), this));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setParameterValueSet(this.getParameterValueSet() != null ? this.getParameterValueSet().getIid() : new UUID(0L, 0L));
        dto.setPublished(new ValueArray<String>(this.getPublished(), this));
        dto.setReference(new ValueArray<String>(this.getReference(), this));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setValueSwitch(this.getValueSwitch());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
