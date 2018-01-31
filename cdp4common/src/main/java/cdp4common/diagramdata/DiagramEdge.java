/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDiagramEdge.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.diagramdata;

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
 * Represents a diagram element that renders as a polyline, connecting a source diagram element to a target diagram element,
 * and is positioned relative to the origin of the diagram.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
@ToString
@EqualsAndHashCode
public  class DiagramEdge extends DiagramElementThing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link DiagramEdge} class.
     */
    public DiagramEdge() {
        this.point = new OrderedItemList<Point>(this, true);
    }

    /**
     * Initializes a new instance of the {@link DiagramEdge} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public DiagramEdge(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.point = new OrderedItemList<Point>(this, true);
    }

    /**
     * List of ordered contained Point.
     * An optional list of points relative to the origin of the nesting diagram that specifies the connected line segments of the edge
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<Point> point;

    /**
     * Property source.
     * The edge's source diagram element, i.e., where this starts from
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DiagramElementThing source;

    /**
     * Property target.
     * The edge's target, i.e., where the edge ends at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DiagramElementThing target;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DiagramEdge}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of ordered contained Point.
     * An optional list of points relative to the origin of the nesting diagram that specifies the connected line segments of the edge
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<Point> getPoint(){
         return this.point;
    }

    /**
     * Gets the source.
     * The edge's source diagram element, i.e., where this starts from
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DiagramElementThing getSource(){
         return this.source;
    }

    /**
     * Gets the target.
     * The edge's target, i.e., where the edge ends at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DiagramElementThing getTarget(){
         return this.target;
    }

    /**
     * Sets a list of ordered contained Point.
     * An optional list of points relative to the origin of the nesting diagram that specifies the connected line segments of the edge
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setPoint(OrderedItemList<Point> point){
        this.point = point;
    }

    /**
     * Sets the source.
     * The edge's source diagram element, i.e., where this starts from
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSource(DiagramElementThing source){
        this.source = source;
    }

    /**
     * Sets the target.
     * The edge's target, i.e., where the edge ends at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setTarget(DiagramElementThing target){
        this.target = target;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link DiagramEdge}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.point);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link DiagramEdge} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagramEdge}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DiagramEdge clone = (DiagramEdge)this.clone();
        clone.setBounds(cloneContainedThings ? new ContainerList<Bounds>(clone) : new ContainerList<Bounds>(this.getBounds(), clone));
        clone.setDiagramElement(cloneContainedThings ? new ContainerList<DiagramElementThing>(clone) : new ContainerList<DiagramElementThing>(this.getDiagramElement(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setLocalStyle(cloneContainedThings ? new ContainerList<OwnedStyle>(clone) : new ContainerList<OwnedStyle>(this.getLocalStyle(), clone));
        clone.setPoint(cloneContainedThings ? new OrderedItemList<Point>(clone, true) : new OrderedItemList<Point>(this.getPoint(), clone));

        if (cloneContainedThings) {
            clone.getBounds().addAll(this.getBounds().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDiagramElement().addAll(this.getDiagramElement().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getLocalStyle().addAll(this.getLocalStyle().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getPoint().addAll(this.getPoint().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link DiagramEdge} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagramEdge}.
     */
    @Override
    public DiagramEdge clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramEdge)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DiagramEdge}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getSource() == null || this.getSource().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property source is null.");
            this.setSource(SentinelThingProvider.getSentinel<DiagramElementThing>());
            this.sentinelResetMap.put("source", new ActionImpl(() -> this.setSource(null)));
        }

        if (this.getTarget() == null || this.getTarget().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property target is null.");
            this.setTarget(SentinelThingProvider.getSentinel<DiagramElementThing>());
            this.sentinelResetMap.put("target", new ActionImpl(() -> this.setTarget(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link DiagramEdge} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DiagramEdge dto = (cdp4common.dto.DiagramEdge)dtoThing;

        this.getBounds().resolveList(dto.getBounds(), dto.getIterationContainerId(), this.getCache());
        this.setDepictedThing((dto.getDepictedThing() != null) ? this.getCache().get<Thing>(dto.getDepictedThing.getValue(), dto.getIterationContainerId()) : null);
        this.getDiagramElement().resolveList(dto.getDiagramElement(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getLocalStyle().resolveList(dto.getLocalStyle(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getPoint().resolveList(dto.getPoint(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setSharedStyle((dto.getSharedStyle() != null) ? this.getCache().get<SharedStyle>(dto.getSharedStyle.getValue(), dto.getIterationContainerId()) : null);
        this.setSource(this.getCache().get<DiagramElementThing>(dto.getSource(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DiagramElementThing>());
        this.setTarget(this.getCache().get<DiagramElementThing>(dto.getTarget(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DiagramElementThing>());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link DiagramEdge}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DiagramEdge dto = new cdp4common.dto.DiagramEdge(this.getIid(), this.getRevisionNumber());

        dto.getBounds().add(this.getBounds().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDepictedThing(this.getDepictedThing() != null ? (UUID)this.getDepictedThing().getIid() : null);
        dto.getDiagramElement().add(this.getDiagramElement().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getLocalStyle().add(this.getLocalStyle().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getPoint().add(this.getPoint().toDtoOrderedItemList());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setSharedStyle(this.getSharedStyle() != null ? (UUID)this.getSharedStyle().getIid() : null);
        dto.setSource(this.getSource() != null ? this.getSource().getIid() : new UUID(0L, 0L));
        dto.setTarget(this.getTarget() != null ? this.getTarget().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
