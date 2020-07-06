/* --------------------------------------------------------------------------------------------------------------------
 * RelationshipParameterValue.java
 *
 * Copyright (c) 2015-2020 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Kamil Wojnowski
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated EMF Converter Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4emfconnector;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
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
import lombok.EqualsAndHashCode;

public class RelationshipParameterValue {

    public static CDP4.EngineeringModelData.RelationshipParameterValue toEmf(cdp4common.engineeringmodeldata.RelationshipParameterValue thing) {       
        
        
        CDP4.EngineeringModelData.RelationshipParameterValue emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRelationshipParameterValue();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setParameterType(thing.getParameterType() != null ? cdp4emfconnector.ParameterType.toEmf(thing.getParameterType()) : null);        
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setScale(thing.getScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getScale()) : null);
        thing.getValue().forEach(item -> emf.getValue().add(item));	             
        
        return emf;
        
    }

    public static  cdp4common.engineeringmodeldata.RelationshipParameterValue toPojo(CDP4.EngineeringModelData.RelationshipParameterValue emfThing) {
        
        
        cdp4common.engineeringmodeldata.RelationshipParameterValue pojo = new cdp4common.engineeringmodeldata.RelationshipParameterValue();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setParameterType(emfThing.getParameterType() != null ? cdp4emfconnector.ParameterType.toPojo(emfThing.getParameterType()) : null);        
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setScale(emfThing.getScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getScale()) : null);
        emfThing.getValue().forEach(item -> pojo.getValue().set(item.indexOf(item), item));		      
        
        return pojo;
    	
     }

        
    public static cdp4common.engineeringmodeldata.RelationshipParameterValue instiatePojo(CDP4.EngineeringModelData.RelationshipParameterValue thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.RelationshipParameterValue(UUID.fromString(thing.getIid()), cache, uri);}
}
