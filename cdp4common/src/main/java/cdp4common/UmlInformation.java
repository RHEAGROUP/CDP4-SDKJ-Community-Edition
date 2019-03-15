/*
 * UmlInformation.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The purpose of the <code>cdp4common.UmlInformation</code> is to decorate properties of classes
 * to be able to use reflection to compute what kind of Aggregation of the property is.
 *
 * @see UmlInformation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface UmlInformation {
    /**
     * Gets the <code>cdp4common.AggregationKind</code> of the decorated property
     *
     * @see AggregationKind
     */
    AggregationKind aggregation();

    /**
     * Gets a value indicating whether the property is ordered
     */
    boolean isOrdered();

    /**
     * Gets a value indicating whether the property is derived
     */
    boolean isDerived();

    /**
     * Gets a value indicating whether the property is nullable
     */
    boolean isNullable() default false;

    /**
     * Gets a value indicating whether the property is non-persistent
     */
    boolean isPersistent() default true;
}
