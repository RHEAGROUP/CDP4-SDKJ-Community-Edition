/* --------------------------------------------------------------------------------------------------------------------
 * Folder.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "Folder"} class.
 */
@Container(clazz = FileStore.class, propertyName = "folder")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Folder extends Thing implements Cloneable, NamedThing, OwnedThing, TimeStampedThing {
    /**
     * Initializes a new instance of the {@link "Folder"} class.
     */
    public Folder() {
    }

    /**
     * Initializes a new instance of the {@link "Folder"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public Folder(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The unique identifier of the referenced containingFolder.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID containingFolder;

    /**
     * The createdOn.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private LocalDateTime createdOn;

    /**
     * The unique identifier of the referenced creator.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID creator;

    /**
     * The name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String name;

    /**
     * The unique identifier of the referenced owner.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID owner;

    /**
     * Gets the path.
     * @throws UnsupportedOperationException The path property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getPath() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property Folder.path");
    }

    /**
     * Sets the path.
     * @throws UnsupportedOperationException The path property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setPath(String path) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property Folder.path");
    }

    /**
     * Gets the route for the current {@link Folder}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.Folder} from a {@link Folder}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.Folder}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.Folder(this.getIid(), cache, uri);
    }
}
