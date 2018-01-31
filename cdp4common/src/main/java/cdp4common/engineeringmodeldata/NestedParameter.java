/* --------------------------------------------------------------------------------------------------------------------
 * AbstractNestedParameter.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import java.util.*;
import java.util.concurrent.*;
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a parameter with a value of a NestedElement
 * Note: The NestedParameter effectively represents the data on a parameter row of a fully expanded workbook / explicit architectural decomposition for the combination of one DomainOfExpertise and one Option.
 */
@Container(clazz = NestedElement.class, propertyName = "nestedParameter")
@ToString
@EqualsAndHashCode
public  class NestedParameter extends Thing implements OwnedThing, VolatileThing {
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
     * Initializes a new instance of the {@link NestedParameter} class.
     */
    public NestedParameter() {
    }

    /**
     * Initializes a new instance of the {@link NestedParameter} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public NestedParameter(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Property actualState.
     * reference to the applicable ActualFiniteState for this NestedParameter if it references a state-dependent <i>associatedParameter</i>, otherwise null
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ActualFiniteState actualState;

    /**
     * Property actualValue.
     * <i>actualValue</i> of the applicable ParameterValueSet, ParameterOverrideValueSet or ParameterSubscriptionValueSet
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String actualValue;

    /**
     * Property associatedParameter.
     * reference to the Parameter, ParameterOverride or ParameterSubscription with which this NestedParameter is associated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterBase associatedParameter;

    /**
     * Property formula.
     * <i>formula</i> for the actualValue of this NestedParameter
     * Note: Property is TBC. Allowing formulas here is opening up a second level of inserting parameter values in a workbook. Perhaps just having read-only NestedParameters is good enough.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String formula;

    /**
     * Value indicating whether isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isVolatile;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise owner;

    /**
     * Property path.
     * derived unique short name path to this NestedParameter
     * Note: The path string consists of the following backslash separated parts: (1) path to the <i>nestedElement</i>, (2) path to the <i>associatedParameter</i>, (3) path for the <i>actualState</i> or empty string if that is null, (4) <i>shortName</i> of the <i>container</i> Option. Any nested parts of the path name are dot separated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String path;
 

    /**
     * Gets the actualState.
     * reference to the applicable ActualFiniteState for this NestedParameter if it references a state-dependent <i>associatedParameter</i>, otherwise null
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ActualFiniteState getActualState(){
         return this.actualState;
    }

    /**
     * Gets the actualValue.
     * <i>actualValue</i> of the applicable ParameterValueSet, ParameterOverrideValueSet or ParameterSubscriptionValueSet
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getActualValue(){
         return this.actualValue;
    }

    /**
     * Gets the associatedParameter.
     * reference to the Parameter, ParameterOverride or ParameterSubscription with which this NestedParameter is associated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterBase getAssociatedParameter(){
         return this.associatedParameter;
    }

    /**
     * Gets the formula.
     * <i>formula</i> for the actualValue of this NestedParameter
     * Note: Property is TBC. Allowing formulas here is opening up a second level of inserting parameter values in a workbook. Perhaps just having read-only NestedParameters is good enough.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getFormula(){
         return this.formula;
    }

    /**
     * Gets a value indicating whether isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getVolatile(){
         return this.isVolatile;
    }

    /**
     * Gets the owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DomainOfExpertise getOwner(){
         return this.owner;
    }

    /**
     * Gets the path.
     * derived unique short name path to this NestedParameter
     * Note: The path string consists of the following backslash separated parts: (1) path to the <i>nestedElement</i>, (2) path to the <i>associatedParameter</i>, (3) path for the <i>actualState</i> or empty string if that is null, (4) <i>shortName</i> of the <i>container</i> Option. Any nested parts of the path name are dot separated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getPath(){
        return this.GetDerivedPath();
    }

    /**
     * Sets the actualState.
     * reference to the applicable ActualFiniteState for this NestedParameter if it references a state-dependent <i>associatedParameter</i>, otherwise null
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActualState(ActualFiniteState actualState){
        this.actualState = actualState;
    }

    /**
     * Sets the actualValue.
     * <i>actualValue</i> of the applicable ParameterValueSet, ParameterOverrideValueSet or ParameterSubscriptionValueSet
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActualValue(String actualValue){
        this.actualValue = actualValue;
    }

    /**
     * Sets the associatedParameter.
     * reference to the Parameter, ParameterOverride or ParameterSubscription with which this NestedParameter is associated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAssociatedParameter(ParameterBase associatedParameter){
        this.associatedParameter = associatedParameter;
    }

    /**
     * Sets the formula.
     * <i>formula</i> for the actualValue of this NestedParameter
     * Note: Property is TBC. Allowing formulas here is opening up a second level of inserting parameter values in a workbook. Perhaps just having read-only NestedParameters is good enough.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setFormula(String formula){
        this.formula = formula;
    }

    /**
     *Sets a value indicating whether isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setVolatile(boolean isVolatile){
        this.isVolatile = isVolatile;
    }

    /**
     * Sets the owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setOwner(DomainOfExpertise owner){
        this.owner = owner;
    }

    /**
     * Sets the path.
     * derived unique short name path to this NestedParameter
     * Note: The path string consists of the following backslash separated parts: (1) path to the <i>nestedElement</i>, (2) path to the <i>associatedParameter</i>, (3) path for the <i>actualState</i> or empty string if that is null, (4) <i>shortName</i> of the <i>container</i> Option. Any nested parts of the path name are dot separated.
     *
     * @throws IllegalStateException The path property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setPath(String path){
        throw new IllegalStateException("Forbidden Set value for the derived property NestedParameter.path");
    }

    /**
     * Creates and returns a copy of this {@link NestedParameter} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link NestedParameter}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        NestedParameter clone = (NestedParameter)this.clone();
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link NestedParameter} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link NestedParameter}.
     */
    @Override
    public NestedParameter clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (NestedParameter)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>NestedParameter}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getActualValue().trim().isEmpty()) {
            errorList.add("The property actualValue is null or empty.");
        }

        if (this.getAssociatedParameter() == null || this.getAssociatedParameter().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property associatedParameter is null.");
            this.setAssociatedParameter(SentinelThingProvider.getSentinel<ParameterBase>());
            this.sentinelResetMap.put("associatedParameter", new ActionImpl(() -> this.setAssociatedParameter(null)));
        }

        if (this.getFormula().trim().isEmpty()) {
            errorList.add("The property formula is null or empty.");
        }

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel<DomainOfExpertise>());
            this.sentinelResetMap.put("owner", new ActionImpl(() -> this.setOwner(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link NestedParameter} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.NestedParameter dto = (cdp4common.dto.NestedParameter)dtoThing;

        this.setActualState((dto.getActualState() != null) ? this.getCache().get<ActualFiniteState>(dto.getActualState.getValue(), dto.getIterationContainerId()) : null);
        this.setActualValue(dto.getActualValue());
        this.setAssociatedParameter(this.getCache().get<ParameterBase>(dto.getAssociatedParameter(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParameterBase>());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setFormula(dto.getFormula());
        this.setVolatile(dto.getVolatile());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(this.getCache().get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link NestedParameter}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.NestedParameter dto = new cdp4common.dto.NestedParameter(this.getIid(), this.getRevisionNumber());

        dto.setActualState(this.getActualState() != null ? (UUID)this.getActualState().getIid() : null);
        dto.setActualValue(this.getActualValue());
        dto.setAssociatedParameter(this.getAssociatedParameter() != null ? this.getAssociatedParameter().getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setFormula(this.getFormula());
        dto.setVolatile(this.getVolatile());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
