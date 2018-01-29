/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSimpleParameterValue.java
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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a single parameter with value for a SimpleParameterizableThing
 * Note: This allows attaching "user-defined attributes" to SimpleParameterizableThings by using ParameterTypes defined in a ReferenceDataLibrary, i.e. reusing the concepts already defined for Parameters of ElementDefinitions.
 */
@Container(clazz = SimpleParameterizableThing.class, propertyName = "parameterValue")
@ToString
@EqualsAndHashCode
public  class SimpleParameterValue extends Thing implements OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>SimpleParameterValue<code/> class.
     *
     * @see SimpleParameterValue
     */
    public SimpleParameterValue() {
        this.value = new ValueArray<String>(this);
    }

    /**
     * Initializes a new instance of the <code>SimpleParameterValue<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see SimpleParameterValue
     */
    public SimpleParameterValue(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.value = new ValueArray<String>(this);
    }

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this SimpleParameterValue
     * Note: The <i>owner</i> is the same as the <i>owner</i> of the SimpleParameterizableThing that contains this SimpleParameterValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;
 
    /**
     * Property parameterType.
     * reference to the applicable ParameterType for this SimpleParameterValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterType parameterType;

    /**
     * Property scale.
     * reference to the applicable MeasurementScale if the <i>parameterType</i> is a QuantityKind
     * Note: The MeasurementScale must be one of the <i>possibleScale</i> defined for the QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementScale scale;

    /**
     * List of ordered String.
     * value of this SimpleParameterValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private ValueArray<String> value;

    /**
     * Gets the owner.
     * reference to a DomainOfExpertise that is the owner of this SimpleParameterValue
     * Note: The <i>owner</i> is the same as the <i>owner</i> of the SimpleParameterizableThing that contains this SimpleParameterValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public DomainOfExpertise getOwner(){
        return this.GetDerivedOwner();
    }

    /**
     * Gets the parameterType.
     * reference to the applicable ParameterType for this SimpleParameterValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterType getParameterType(){
         return this.parameterType;
    }

    /**
     * Gets the scale.
     * reference to the applicable MeasurementScale if the <i>parameterType</i> is a QuantityKind
     * Note: The MeasurementScale must be one of the <i>possibleScale</i> defined for the QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementScale getScale(){
         return this.scale;
    }

    /**
     * Gets a list of ordered String.
     * value of this SimpleParameterValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public ValueArray<String> getValue(){
         return this.value;
    }

    /**
     * Sets the owner.
     * reference to a DomainOfExpertise that is the owner of this SimpleParameterValue
     * Note: The <i>owner</i> is the same as the <i>owner</i> of the SimpleParameterizableThing that contains this SimpleParameterValue.
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property SimpleParameterValue.owner");
    }

    /**
     * Sets the parameterType.
     * reference to the applicable ParameterType for this SimpleParameterValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setParameterType(ParameterType parameterType){
        this.parameterType = parameterType;
    }

    /**
     * Sets the scale.
     * reference to the applicable MeasurementScale if the <i>parameterType</i> is a QuantityKind
     * Note: The MeasurementScale must be one of the <i>possibleScale</i> defined for the QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setScale(MeasurementScale scale){
        this.scale = scale;
    }

    /**
     * Sets a list of ordered String.
     * value of this SimpleParameterValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setValue(ValueArray<String> value){
        this.value = value;
    }

    /**
     * Creates and returns a copy of this <code>SimpleParameterValue<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SimpleParameterValue<code/>.
     *
     * @see SimpleParameterValue
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        SimpleParameterValue clone = (SimpleParameterValue)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setValue(new ValueArray<String>(this.getValue(), this));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>SimpleParameterValue<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SimpleParameterValue<code/>.
     * 
     * @see SimpleParameterValue
     */
    @Override
    public SimpleParameterValue clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SimpleParameterValue)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SimpleParameterValue<code/>.
     *
     * @return A list of potential errors.
     *
     * @see SimpleParameterValue
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getParameterType() == null || this.getParameterType().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterType is null.");
            this.setParameterType(SentinelThingProvider.getSentinel<ParameterType>());
            this.sentinelResetMap["parameterType"] = () -> this.setParameterType(null);
        }

        int valueCount = this.getValue().size();
        if (valueCount < 1) {
            errorList.add("The number of elements in the property value is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>SimpleParameterValue<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see SimpleParameterValue
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SimpleParameterValue dto = (cdp4common.dto.SimpleParameterValue)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setParameterType(this.cache.get<ParameterType>(dto.getParameterType(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParameterType>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setScale((dto.getScale() != null) ? this.getCache().get<MeasurementScale>(dto.getScale.getValue(), dto.getIterationContainerId()) : null);
        this.setValue(new ValueArray<String>(dto.getValue(), this));

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>SimpleParameterValue<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see SimpleParameterValue
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SimpleParameterValue dto = new cdp4common.dto.SimpleParameterValue(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setParameterType(this.getParameterType() != null ? this.getParameterType().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setScale(this.getScale() != null ? (UUID)this.getScale().getIid() : null);
        dto.setValue(new ValueArray<String>(this.getValue(), this));

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
