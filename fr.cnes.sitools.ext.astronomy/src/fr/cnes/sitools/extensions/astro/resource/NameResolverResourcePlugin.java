/**
 * *****************************************************************************
 * Copyright 2011 2012 2013 CNES - CENTRE NATIONAL d'ETUDES SPATIALES
 *
 * This file is part of SITools2.
 *
 * SITools2 is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * SITools2 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with SITools2. If not, see <http://www.gnu.org/licenses/>.
 * ****************************************************************************
 */
package fr.cnes.sitools.extensions.astro.resource;

import fr.cnes.sitools.plugins.resources.model.DataSetSelectionType;
import fr.cnes.sitools.plugins.resources.model.ResourceModel;
import fr.cnes.sitools.plugins.resources.model.ResourceParameter;
import fr.cnes.sitools.plugins.resources.model.ResourceParameterType;
import java.util.logging.Logger;

/**
 * A name resolver service provides object coordinates from its name.
 *
 * <p> The parameters are coordinates system and object name for deep sky objects and stars. The parameters are coordinates system, solar
 * object name and time for solar objects </p>
 *
 * <p>This service answers to the following scenario:<br/> As user, I want to set the name and the service retuns its coordinates in order
 * to integrate this service in a tool. Moreover several output can be supported. This means it is possible to get several coordinates for
 * on single name. </p>
 *
 *
 * @author Jean-Christophe Malapert <jean-christophe.malapert@cnes.fr>
 */
public class NameResolverResourcePlugin extends ResourceModel {

  /**
   * Logger.
   */
  private static final Logger LOG = Logger.getLogger(NameResolverResourcePlugin.class.getName());

  /**
   * Constructor of the administration panel.
   */
  public NameResolverResourcePlugin() {
    super();
    setClassAuthor("J-C Malapert");
    setClassOwner("CNES");
    setClassVersion("1.0");
    setName("Name Resolver service");
    setDescription("This service provides a resource (/nameResolver/{objectName}/{coordSystem})"
            + " to query name resolver services. coordSystem variable is either GALACTIC or EQUATORIAL");
    setDataSetSelection(DataSetSelectionType.NONE);
    setResourceClassName(fr.cnes.sitools.extensions.astro.resource.NameResolverResource.class.getName());
    ResourceParameter xsEnumEditable = new ResourceParameter("nameResolver",
            "Select your resolver name service for avoiding to add resolverName as URL parameter",
            ResourceParameterType.PARAMETER_USER_INPUT);
    xsEnumEditable.setValue("CDS"); // default value
    String valueTypexsEnumEditable = "xs:enum-multiple[IMCCE,CDS,IAS,ALL]";
    xsEnumEditable.setValueType(valueTypexsEnumEditable);
    this.addParam(xsEnumEditable);
    ResourceParameter epoch = new ResourceParameter("epoch", "Set an epoch for avoiding to add epoch as URL parameter",
            ResourceParameterType.PARAMETER_USER_INPUT);
    epoch.setValueType("String");
    epoch.setValue("now");
    this.addParam(epoch);
    this.completeAttachUrlWith("/nameResolver/{objectName}/{coordSystem}");
  }
}
