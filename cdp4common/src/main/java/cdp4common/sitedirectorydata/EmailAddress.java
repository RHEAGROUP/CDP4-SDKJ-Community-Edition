/* --------------------------------------------------------------------------------------------------------------------
 * AbstractEmailAddress.java
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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of an e-mail address
 */
@Container(clazz = Person.class, propertyName = "emailAddress")
@ToString
@EqualsAndHashCode
public  class EmailAddress extends Thing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>EmailAddress<code/> class.
     *
     * @see EmailAddress
     */
    public EmailAddress() {
    }

    /**
     * Initializes a new instance of the <code>EmailAddress<code/> class.
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
     * @see EmailAddress
     */
    public EmailAddress(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property value.
     * representation of the actual e-mail address of this EmailAddress
     * Note: The e-mail address value shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. "user-name@domain" or "Full Name <user-name@domain>".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String value;

    /**
     * Property vcardType.
     * representation of the applicable vCard TYPE values
     * Note: See VcardEmailAddressKind for details.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private VcardEmailAddressKind vcardType;

    /**
     * Gets the value.
     * representation of the actual e-mail address of this EmailAddress
     * Note: The e-mail address value shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. "user-name@domain" or "Full Name <user-name@domain>".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getValue(){
         return this.value;
    }

    /**
     * Gets the vcardType.
     * representation of the applicable vCard TYPE values
     * Note: See VcardEmailAddressKind for details.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public VcardEmailAddressKind getVcardType(){
         return this.vcardType;
    }

    /**
     * Sets the value.
     * representation of the actual e-mail address of this EmailAddress
     * Note: The e-mail address value shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. "user-name@domain" or "Full Name <user-name@domain>".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setValue(String value){
        this.value = value;
    }

    /**
     * Sets the vcardType.
     * representation of the applicable vCard TYPE values
     * Note: See VcardEmailAddressKind for details.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setVcardType(VcardEmailAddressKind vcardType){
        this.vcardType = vcardType;
    }

    /**
     * Creates and returns a copy of this <code>EmailAddress<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>EmailAddress<code/>.
     *
     * @see EmailAddress
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        EmailAddress clone = (EmailAddress)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>EmailAddress<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>EmailAddress<code/>.
     * 
     * @see EmailAddress
     */
    @Override
    public EmailAddress clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EmailAddress)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>EmailAddress<code/>.
     *
     * @return A list of potential errors.
     *
     * @see EmailAddress
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getValue().trim().isEmpty()) {
            errorList.add("The property value is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>EmailAddress<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see EmailAddress
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.EmailAddress dto = (cdp4common.dto.EmailAddress)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setValue(dto.getValue());
        this.setVcardType(dto.getVcardType());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>EmailAddress<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see EmailAddress
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.EmailAddress dto = new cdp4common.dto.EmailAddress(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setValue(this.getValue());
        dto.setVcardType(this.getVcardType());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
