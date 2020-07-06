/* --------------------------------------------------------------------------------------------------------------------
 * SiteReferenceDataLibrary.java
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

public class SiteReferenceDataLibrary {

    public static CDP4.SiteDirectoryData.SiteReferenceDataLibrary toEmf(cdp4common.sitedirectorydata.SiteReferenceDataLibrary thing) {       
        
        
        CDP4.SiteDirectoryData.SiteReferenceDataLibrary emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteReferenceDataLibrary();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emf.getBaseQuantityKind().addAll(thing.getBaseQuantityKind().stream().map(item -> cdp4emfconnector.QuantityKind.toEmf(item)).collect(Collectors.toList()));
        
        emf.getBaseUnit().addAll(thing.getBaseUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toEmf(item)).collect(Collectors.toList()));
        
        emf.getConstant().addAll(thing.getConstant().stream().map(item -> cdp4emfconnector.Constant.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDefinedCategory().addAll(thing.getDefinedCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getFileType().addAll(thing.getFileType().stream().map(item -> cdp4emfconnector.FileType.toEmf(item)).collect(Collectors.toList()));
        
        emf.getGlossary().addAll(thing.getGlossary().stream().map(item -> cdp4emfconnector.Glossary.toEmf(item)).collect(Collectors.toList()));
        
        emf.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emf.setIsDeprecated(thing.isDeprecated());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.getParameterType().addAll(thing.getParameterType().stream().map(item -> cdp4emfconnector.ParameterType.toEmf(item)).collect(Collectors.toList()));
        
        emf.getReferenceSource().addAll(thing.getReferenceSource().stream().map(item -> cdp4emfconnector.ReferenceSource.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRequiredRdl(thing.getRequiredRdl() != null ? cdp4emfconnector.SiteReferenceDataLibrary.toEmf(thing.getRequiredRdl()) : null);
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.getRule().addAll(thing.getRule().stream().map(item -> cdp4emfconnector.Rule.toEmf(item)).collect(Collectors.toList()));
        
        emf.getScale().addAll(thing.getScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toEmf(item)).collect(Collectors.toList()));
        
        emf.setShortName(thing.getShortName());
        
        emf.getUnit().addAll(thing.getUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toEmf(item)).collect(Collectors.toList()));
        
        emf.getUnitPrefix().addAll(thing.getUnitPrefix().stream().map(item -> cdp4emfconnector.UnitPrefix.toEmf(item)).collect(Collectors.toList()));
        
        return emf;
        
    }

    public static  cdp4common.sitedirectorydata.SiteReferenceDataLibrary toPojo(CDP4.SiteDirectoryData.SiteReferenceDataLibrary emfThing) {
        
        
        cdp4common.sitedirectorydata.SiteReferenceDataLibrary pojo = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getBaseQuantityKind().addAll(emfThing.getBaseQuantityKind().stream().map(item -> cdp4emfconnector.QuantityKind.toPojo(item)).collect(Collectors.toList()));
        
        pojo.getBaseUnit().addAll(emfThing.getBaseUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getConstant().addAll(emfThing.getConstant().stream().map(item -> cdp4emfconnector.Constant.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDefinedCategory().addAll(emfThing.getDefinedCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getFileType().addAll(emfThing.getFileType().stream().map(item -> cdp4emfconnector.FileType.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getGlossary().addAll(emfThing.getGlossary().stream().map(item -> cdp4emfconnector.Glossary.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setDeprecated(emfThing.getIsDeprecated());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.getParameterType().addAll(emfThing.getParameterType().stream().map(item -> cdp4emfconnector.ParameterType.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getReferenceSource().addAll(emfThing.getReferenceSource().stream().map(item -> cdp4emfconnector.ReferenceSource.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setRequiredRdl(emfThing.getRequiredRdl() != null ? cdp4emfconnector.SiteReferenceDataLibrary.toPojo(emfThing.getRequiredRdl()) : null);
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.getRule().addAll(emfThing.getRule().stream().map(item -> cdp4emfconnector.Rule.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getScale().addAll(emfThing.getScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setShortName(emfThing.getShortName());
        
        pojo.getUnit().addAll(emfThing.getUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getUnitPrefix().addAll(emfThing.getUnitPrefix().stream().map(item -> cdp4emfconnector.UnitPrefix.toPojo(item)).collect(Collectors.toList()));              
        
        return pojo;
    	
     }

        
    public static cdp4common.sitedirectorydata.SiteReferenceDataLibrary instiatePojo(CDP4.SiteDirectoryData.SiteReferenceDataLibrary thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.SiteReferenceDataLibrary(UUID.fromString(thing.getIid()), cache, uri);}
}