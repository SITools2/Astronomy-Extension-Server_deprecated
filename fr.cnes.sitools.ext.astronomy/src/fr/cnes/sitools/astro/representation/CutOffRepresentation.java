/*******************************************************************************
* Copyright 2012, 2013 CNES - CENTRE NATIONAL d'ETUDES SPATIALES
* 
* This file is part of SITools2.
* 
* SITools2 is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* SITools2 is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with SITools2.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
package fr.cnes.sitools.astro.representation;

import fr.cnes.sitools.astro.cutoff.CutOffException;
import fr.cnes.sitools.astro.cutoff.CutOffInterface;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.restlet.data.MediaType;
import org.restlet.representation.OutputRepresentation;

/**
 * Creates a cutoff on a FITS image.
 * @author Jean-Christophe Malapert
 */
public class CutOffRepresentation extends OutputRepresentation {
  /**
   * Logger.
   */  
  private static final Logger LOG = Logger.getLogger(CutOffRepresentation.class.getName());
  
  /**
   * Interface.
   */
    private CutOffInterface cutout;
    
    /**
     * Constructs a cutoff.
     * @param media media type
     * @param cutoff curoff object
     */
    public CutOffRepresentation(final MediaType media, final CutOffInterface cutoff) {
        super(media);
        this.cutout = cutoff;
    }

    /**
     * Writes the response.
     * @param out output stream
     * @throws IOException IO Exception
     */
    @Override
    public final void write(final OutputStream out) throws IOException {
        try {
            this.cutout.createCutoutFits(out);
        } catch (CutOffException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }    
}
