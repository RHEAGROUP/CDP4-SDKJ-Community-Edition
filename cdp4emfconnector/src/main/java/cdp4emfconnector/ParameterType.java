/* --------------------------------------------------------------------------------------------------------------------
 * ParameterType.java
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

public abstract class ParameterType {

    public static CDP4.SiteDirectoryData.ParameterType toEmf(cdp4common.sitedirectorydata.ParameterType thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.CompoundParameterType":
        CDP4.SiteDirectoryData.ParameterType emfCompoundParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCompoundParameterType();    
        
        emfCompoundParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfCompoundParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfCompoundParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfCompoundParameterType.setName(thing.getName());
        
        emfCompoundParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfCompoundParameterType.setShortName(thing.getShortName());
        
        emfCompoundParameterType.setSymbol(thing.getSymbol());
        		        
        return emfCompoundParameterType;   
        
        
        case "cdp4common.sitedirectorydata.ArrayParameterType":
        CDP4.SiteDirectoryData.ParameterType emfArrayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createArrayParameterType();    
        
        emfArrayParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfArrayParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfArrayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfArrayParameterType.setName(thing.getName());
        
        emfArrayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfArrayParameterType.setShortName(thing.getShortName());
        
        emfArrayParameterType.setSymbol(thing.getSymbol());
        		        
        return emfArrayParameterType;   
        
        
        
        case "cdp4common.sitedirectorydata.EnumerationParameterType":
        CDP4.SiteDirectoryData.ParameterType emfEnumerationParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationParameterType();    
        
        emfEnumerationParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfEnumerationParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfEnumerationParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationParameterType.setName(thing.getName());
        
        emfEnumerationParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfEnumerationParameterType.setShortName(thing.getShortName());
        
        emfEnumerationParameterType.setSymbol(thing.getSymbol());
        		        
        return emfEnumerationParameterType;   
        
        
        case "cdp4common.sitedirectorydata.BooleanParameterType":
        CDP4.SiteDirectoryData.ParameterType emfBooleanParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBooleanParameterType();    
        
        emfBooleanParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfBooleanParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfBooleanParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfBooleanParameterType.setName(thing.getName());
        
        emfBooleanParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfBooleanParameterType.setShortName(thing.getShortName());
        
        emfBooleanParameterType.setSymbol(thing.getSymbol());
        		        
        return emfBooleanParameterType;   
        
        
        case "cdp4common.sitedirectorydata.DateParameterType":
        CDP4.SiteDirectoryData.ParameterType emfDateParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateParameterType();    
        
        emfDateParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfDateParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfDateParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateParameterType.setName(thing.getName());
        
        emfDateParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateParameterType.setShortName(thing.getShortName());
        
        emfDateParameterType.setSymbol(thing.getSymbol());
        		        
        return emfDateParameterType;   
        
        
        case "cdp4common.sitedirectorydata.TextParameterType":
        CDP4.SiteDirectoryData.ParameterType emfTextParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTextParameterType();    
        
        emfTextParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfTextParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfTextParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTextParameterType.setName(thing.getName());
        
        emfTextParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTextParameterType.setShortName(thing.getShortName());
        
        emfTextParameterType.setSymbol(thing.getSymbol());
        		        
        return emfTextParameterType;   
        
        
        case "cdp4common.sitedirectorydata.DateTimeParameterType":
        CDP4.SiteDirectoryData.ParameterType emfDateTimeParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateTimeParameterType();    
        
        emfDateTimeParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfDateTimeParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfDateTimeParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateTimeParameterType.setName(thing.getName());
        
        emfDateTimeParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateTimeParameterType.setShortName(thing.getShortName());
        
        emfDateTimeParameterType.setSymbol(thing.getSymbol());
        		        
        return emfDateTimeParameterType;   
        
        
        case "cdp4common.sitedirectorydata.TimeOfDayParameterType":
        CDP4.SiteDirectoryData.ParameterType emfTimeOfDayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTimeOfDayParameterType();    
        
        emfTimeOfDayParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfTimeOfDayParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfTimeOfDayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTimeOfDayParameterType.setName(thing.getName());
        
        emfTimeOfDayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTimeOfDayParameterType.setShortName(thing.getShortName());
        
        emfTimeOfDayParameterType.setSymbol(thing.getSymbol());
        		        
        return emfTimeOfDayParameterType;   
        
        
        
        case "cdp4common.sitedirectorydata.SpecializedQuantityKind":
        CDP4.SiteDirectoryData.ParameterType emfSpecializedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSpecializedQuantityKind();    
        
        emfSpecializedQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfSpecializedQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfSpecializedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSpecializedQuantityKind.setName(thing.getName());
        
        emfSpecializedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSpecializedQuantityKind.setShortName(thing.getShortName());
        
        emfSpecializedQuantityKind.setSymbol(thing.getSymbol());
        		        
        return emfSpecializedQuantityKind;   
        
        
        case "cdp4common.sitedirectorydata.SimpleQuantityKind":
        CDP4.SiteDirectoryData.ParameterType emfSimpleQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleQuantityKind();    
        
        emfSimpleQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfSimpleQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfSimpleQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleQuantityKind.setName(thing.getName());
        
        emfSimpleQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleQuantityKind.setShortName(thing.getShortName());
        
        emfSimpleQuantityKind.setSymbol(thing.getSymbol());
        		        
        return emfSimpleQuantityKind;   
        
        
        case "cdp4common.sitedirectorydata.DerivedQuantityKind":
        CDP4.SiteDirectoryData.ParameterType emfDerivedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedQuantityKind();    
        
        emfDerivedQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        
        emfDerivedQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfDerivedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedQuantityKind.setName(thing.getName());
        
        emfDerivedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedQuantityKind.setShortName(thing.getShortName());
        
        emfDerivedQuantityKind.setSymbol(thing.getSymbol());
        		        
        return emfDerivedQuantityKind;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.sitedirectorydata.ParameterType toPojo(CDP4.SiteDirectoryData.ParameterType emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.CompoundParameterType":                
        cdp4common.sitedirectorydata.ParameterType pojoCompoundParameterType = new cdp4common.sitedirectorydata.CompoundParameterType();	    
        
        pojoCompoundParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCompoundParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoCompoundParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCompoundParameterType.setName(emfThing.getName());
        
        pojoCompoundParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCompoundParameterType.setShortName(emfThing.getShortName());
        
        pojoCompoundParameterType.setSymbol(emfThing.getSymbol());
        		        
        return pojoCompoundParameterType;   
        
        
        case "CDP4.sitedirectorydata.ArrayParameterType":                
        cdp4common.sitedirectorydata.ParameterType pojoArrayParameterType = new cdp4common.sitedirectorydata.ArrayParameterType();	    
        
        pojoArrayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoArrayParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoArrayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoArrayParameterType.setName(emfThing.getName());
        
        pojoArrayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoArrayParameterType.setShortName(emfThing.getShortName());
        
        pojoArrayParameterType.setSymbol(emfThing.getSymbol());
        		        
        return pojoArrayParameterType;   
        
        
        
        case "CDP4.sitedirectorydata.EnumerationParameterType":                
        cdp4common.sitedirectorydata.ParameterType pojoEnumerationParameterType = new cdp4common.sitedirectorydata.EnumerationParameterType();	    
        
        pojoEnumerationParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEnumerationParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoEnumerationParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEnumerationParameterType.setName(emfThing.getName());
        
        pojoEnumerationParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEnumerationParameterType.setShortName(emfThing.getShortName());
        
        pojoEnumerationParameterType.setSymbol(emfThing.getSymbol());
        		        
        return pojoEnumerationParameterType;   
        
        
        case "CDP4.sitedirectorydata.BooleanParameterType":                
        cdp4common.sitedirectorydata.ParameterType pojoBooleanParameterType = new cdp4common.sitedirectorydata.BooleanParameterType();	    
        
        pojoBooleanParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBooleanParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoBooleanParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBooleanParameterType.setName(emfThing.getName());
        
        pojoBooleanParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBooleanParameterType.setShortName(emfThing.getShortName());
        
        pojoBooleanParameterType.setSymbol(emfThing.getSymbol());
        		        
        return pojoBooleanParameterType;   
        
        
        case "CDP4.sitedirectorydata.DateParameterType":                
        cdp4common.sitedirectorydata.ParameterType pojoDateParameterType = new cdp4common.sitedirectorydata.DateParameterType();	    
        
        pojoDateParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDateParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateParameterType.setName(emfThing.getName());
        
        pojoDateParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDateParameterType.setShortName(emfThing.getShortName());
        
        pojoDateParameterType.setSymbol(emfThing.getSymbol());
        		        
        return pojoDateParameterType;   
        
        
        case "CDP4.sitedirectorydata.TextParameterType":                
        cdp4common.sitedirectorydata.ParameterType pojoTextParameterType = new cdp4common.sitedirectorydata.TextParameterType();	    
        
        pojoTextParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTextParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoTextParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTextParameterType.setName(emfThing.getName());
        
        pojoTextParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTextParameterType.setShortName(emfThing.getShortName());
        
        pojoTextParameterType.setSymbol(emfThing.getSymbol());
        		        
        return pojoTextParameterType;   
        
        
        case "CDP4.sitedirectorydata.DateTimeParameterType":                
        cdp4common.sitedirectorydata.ParameterType pojoDateTimeParameterType = new cdp4common.sitedirectorydata.DateTimeParameterType();	    
        
        pojoDateTimeParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateTimeParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDateTimeParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateTimeParameterType.setName(emfThing.getName());
        
        pojoDateTimeParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDateTimeParameterType.setShortName(emfThing.getShortName());
        
        pojoDateTimeParameterType.setSymbol(emfThing.getSymbol());
        		        
        return pojoDateTimeParameterType;   
        
        
        case "CDP4.sitedirectorydata.TimeOfDayParameterType":                
        cdp4common.sitedirectorydata.ParameterType pojoTimeOfDayParameterType = new cdp4common.sitedirectorydata.TimeOfDayParameterType();	    
        
        pojoTimeOfDayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTimeOfDayParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoTimeOfDayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTimeOfDayParameterType.setName(emfThing.getName());
        
        pojoTimeOfDayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTimeOfDayParameterType.setShortName(emfThing.getShortName());
        
        pojoTimeOfDayParameterType.setSymbol(emfThing.getSymbol());
        		        
        return pojoTimeOfDayParameterType;   
        
        
        
        case "CDP4.sitedirectorydata.SpecializedQuantityKind":                
        cdp4common.sitedirectorydata.ParameterType pojoSpecializedQuantityKind = new cdp4common.sitedirectorydata.SpecializedQuantityKind();	    
        
        pojoSpecializedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSpecializedQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoSpecializedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSpecializedQuantityKind.setName(emfThing.getName());
        
        pojoSpecializedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSpecializedQuantityKind.setShortName(emfThing.getShortName());
        
        pojoSpecializedQuantityKind.setSymbol(emfThing.getSymbol());
        		        
        return pojoSpecializedQuantityKind;   
        
        
        case "CDP4.sitedirectorydata.SimpleQuantityKind":                
        cdp4common.sitedirectorydata.ParameterType pojoSimpleQuantityKind = new cdp4common.sitedirectorydata.SimpleQuantityKind();	    
        
        pojoSimpleQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoSimpleQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleQuantityKind.setName(emfThing.getName());
        
        pojoSimpleQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleQuantityKind.setShortName(emfThing.getShortName());
        
        pojoSimpleQuantityKind.setSymbol(emfThing.getSymbol());
        		        
        return pojoSimpleQuantityKind;   
        
        
        case "CDP4.sitedirectorydata.DerivedQuantityKind":                
        cdp4common.sitedirectorydata.ParameterType pojoDerivedQuantityKind = new cdp4common.sitedirectorydata.DerivedQuantityKind();	    
        
        pojoDerivedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDerivedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedQuantityKind.setName(emfThing.getName());
        
        pojoDerivedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDerivedQuantityKind.setShortName(emfThing.getShortName());
        
        pojoDerivedQuantityKind.setSymbol(emfThing.getSymbol());
        		        
        return pojoDerivedQuantityKind;   
        
        	
    }
        return null;
        
        
     }

        
}