/* --------------------------------------------------------------------------------------------------------------------
 * AbstractLogarithmicScale.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
 * representation of a logarithmic MeasurementScale
 * Note: The logarithmic ratio quantity value <i>v</i> is computed as follows: <i>v</i> = <i>f</i> · log<sub>base</sub>( (<i>x</i> / <i>x<sub>ref</sub></i> )<i><sup>a</sup></i> ), where <i>f</i> is a multiplication factor, <i>base</i> is the base of the log function, <i>x</i> is the actual quantity, <i>x<sub>ref</sub></i> is a reference quantity, and <i>a</i> is an exponent.
 * Example 1: The base 10 logarithmic measurement scale for "sound pressure level" in "decibel", with <i>factor</i> is "10", <i>exponent</i> is "2", <i>referenceQuantityKind</i> is "sound pressure" and <i>referenceQuantityValue</i>.value is "20" on the "µPa" RatioScale. Source: ISO 80000-08.
 * Example 2: The natural logarithmic measurement scale for "electric field strength" in "neper".
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
@ToString
@EqualsAndHashCode
public  class LogarithmicScale extends MeasurementScale  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link LogarithmicScale} class.
     */
    public LogarithmicScale() {
        this.referenceQuantityValue = new ContainerList<ScaleReferenceQuantityValue>(this);
    }

    /**
     * Initializes a new instance of the {@link LogarithmicScale} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public LogarithmicScale(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.referenceQuantityValue = new ContainerList<ScaleReferenceQuantityValue>(this);
    }

    /**
     * Property exponent.
     * exponent used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String exponent;

    /**
     * Property factor.
     * factor used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String factor;

    /**
     * Property logarithmBase.
     * base of the logarithmic function used on this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private LogarithmBaseKind logarithmBase;

    /**
     * Property referenceQuantityKind.
     * reference to the applicable QuantityKind for the quotient of quantities in the definition formula of this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private QuantityKind referenceQuantityKind;

    /**
     * List of contained ScaleReferenceQuantityValue.
     * optional value for the reference quantity in the definition formula for this LogarithmicScale
     * Note: A logarithmic scale may define a fixed reference quantity. See also <a href="http://www.nist.gov/pml/pubs/sp811/index.cfm">NIST SP811</a> for many more details.
     * Example: The base 10 logarithmic scale for "sound pressure level" in decibel is defined with respect to a reference sound pressure <i>p<sub>0</sub></i> = 20 µPa. The sound pressure level value on such a scale for a corresponding sound pressure <i>p</i> would then be 10·log<sub>10</sub>((<i>p</i>/<i>p<sub>0</sub></i>)<sup>2</sup>) dB.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ScaleReferenceQuantityValue> referenceQuantityValue;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link LogarithmicScale}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the exponent.
     * exponent used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExponent(){
         return this.exponent;
    }

    /**
     * Gets the factor.
     * factor used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getFactor(){
         return this.factor;
    }

    /**
     * Gets the logarithmBase.
     * base of the logarithmic function used on this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public LogarithmBaseKind getLogarithmBase(){
         return this.logarithmBase;
    }

    /**
     * Gets the referenceQuantityKind.
     * reference to the applicable QuantityKind for the quotient of quantities in the definition formula of this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public QuantityKind getReferenceQuantityKind(){
         return this.referenceQuantityKind;
    }

    /**
     * Gets a list of contained ScaleReferenceQuantityValue.
     * optional value for the reference quantity in the definition formula for this LogarithmicScale
     * Note: A logarithmic scale may define a fixed reference quantity. See also <a href="http://www.nist.gov/pml/pubs/sp811/index.cfm">NIST SP811</a> for many more details.
     * Example: The base 10 logarithmic scale for "sound pressure level" in decibel is defined with respect to a reference sound pressure <i>p<sub>0</sub></i> = 20 µPa. The sound pressure level value on such a scale for a corresponding sound pressure <i>p</i> would then be 10·log<sub>10</sub>((<i>p</i>/<i>p<sub>0</sub></i>)<sup>2</sup>) dB.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ScaleReferenceQuantityValue> getReferenceQuantityValue(){
         return this.referenceQuantityValue;
    }

    /**
     * Sets the exponent.
     * exponent used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExponent(String exponent){
        this.exponent = exponent;
    }

    /**
     * Sets the factor.
     * factor used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setFactor(String factor){
        this.factor = factor;
    }

    /**
     * Sets the logarithmBase.
     * base of the logarithmic function used on this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLogarithmBase(LogarithmBaseKind logarithmBase){
        this.logarithmBase = logarithmBase;
    }

    /**
     * Sets the referenceQuantityKind.
     * reference to the applicable QuantityKind for the quotient of quantities in the definition formula of this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferenceQuantityKind(QuantityKind referenceQuantityKind){
        this.referenceQuantityKind = referenceQuantityKind;
    }

    /**
     * Sets a list of contained ScaleReferenceQuantityValue.
     * optional value for the reference quantity in the definition formula for this LogarithmicScale
     * Note: A logarithmic scale may define a fixed reference quantity. See also <a href="http://www.nist.gov/pml/pubs/sp811/index.cfm">NIST SP811</a> for many more details.
     * Example: The base 10 logarithmic scale for "sound pressure level" in decibel is defined with respect to a reference sound pressure <i>p<sub>0</sub></i> = 20 µPa. The sound pressure level value on such a scale for a corresponding sound pressure <i>p</i> would then be 10·log<sub>10</sub>((<i>p</i>/<i>p<sub>0</sub></i>)<sup>2</sup>) dB.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setReferenceQuantityValue(ContainerList<ScaleReferenceQuantityValue> referenceQuantityValue){
        this.referenceQuantityValue = referenceQuantityValue;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link LogarithmicScale}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.referenceQuantityValue);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link LogarithmicScale} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link LogarithmicScale}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        LogarithmicScale clone = (LogarithmicScale)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setMappingToReferenceScale(cloneContainedThings ? new ContainerList<MappingToReferenceScale>(clone) : new ContainerList<MappingToReferenceScale>(this.getMappingToReferenceScale(), clone));
        clone.setReferenceQuantityValue(cloneContainedThings ? new ContainerList<ScaleReferenceQuantityValue>(clone) : new ContainerList<ScaleReferenceQuantityValue>(this.getReferenceQuantityValue(), clone));
        clone.setValueDefinition(cloneContainedThings ? new ContainerList<ScaleValueDefinition>(clone) : new ContainerList<ScaleValueDefinition>(this.getValueDefinition(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getMappingToReferenceScale().addAll(this.getMappingToReferenceScale().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getReferenceQuantityValue().addAll(this.getReferenceQuantityValue().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getValueDefinition().addAll(this.getValueDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link LogarithmicScale} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link LogarithmicScale}.
     */
    @Override
    public LogarithmicScale clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (LogarithmicScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>LogarithmicScale}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getExponent().trim().isEmpty()) {
            errorList.add("The property exponent is null or empty.");
        }

        if (this.getFactor().trim().isEmpty()) {
            errorList.add("The property factor is null or empty.");
        }

        if (this.getReferenceQuantityKind() == null || this.getReferenceQuantityKind().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referenceQuantityKind is null.");
            this.setReferenceQuantityKind(SentinelThingProvider.getSentinel<QuantityKind>());
            this.sentinelResetMap.put("referenceQuantityKind", new ActionImpl(() -> this.setReferenceQuantityKind(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link LogarithmicScale} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.LogarithmicScale dto = (cdp4common.dto.LogarithmicScale)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setExponent(dto.getExponent());
        this.setFactor(dto.getFactor());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setMaximumInclusive(dto.getMaximumInclusive());
        this.setMinimumInclusive(dto.getMinimumInclusive());
        this.setLogarithmBase(dto.getLogarithmBase());
        this.getMappingToReferenceScale().resolveList(dto.getMappingToReferenceScale(), dto.getIterationContainerId(), this.getCache());
        this.setMaximumPermissibleValue(dto.getMaximumPermissibleValue());
        this.setMinimumPermissibleValue(dto.getMinimumPermissibleValue());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setNegativeValueConnotation(dto.getNegativeValueConnotation());
        this.setNumberSet(dto.getNumberSet());
        this.setPositiveValueConnotation(dto.getPositiveValueConnotation());
        this.setReferenceQuantityKind(this.getCache().get<QuantityKind>(dto.getReferenceQuantityKind(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<QuantityKind>());
        this.getReferenceQuantityValue().resolveList(dto.getReferenceQuantityValue(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setUnit(this.getCache().get<MeasurementUnit>(dto.getUnit(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementUnit>());
        this.getValueDefinition().resolveList(dto.getValueDefinition(), dto.getIterationContainerId(), this.getCache());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link LogarithmicScale}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.LogarithmicScale dto = new cdp4common.dto.LogarithmicScale(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setExponent(this.getExponent());
        dto.setFactor(this.getFactor());
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setMaximumInclusive(this.getMaximumInclusive());
        dto.setMinimumInclusive(this.getMinimumInclusive());
        dto.setLogarithmBase(this.getLogarithmBase());
        dto.getMappingToReferenceScale().add(this.getMappingToReferenceScale().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setMaximumPermissibleValue(this.getMaximumPermissibleValue());
        dto.setMinimumPermissibleValue(this.getMinimumPermissibleValue());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setNegativeValueConnotation(this.getNegativeValueConnotation());
        dto.setNumberSet(this.getNumberSet());
        dto.setPositiveValueConnotation(this.getPositiveValueConnotation());
        dto.setReferenceQuantityKind(this.getReferenceQuantityKind() != null ? this.getReferenceQuantityKind().getIid() : new UUID(0L, 0L));
        dto.getReferenceQuantityValue().add(this.getReferenceQuantityValue().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setUnit(this.getUnit() != null ? this.getUnit().getIid() : new UUID(0L, 0L));
        dto.getValueDefinition().add(this.getValueDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
