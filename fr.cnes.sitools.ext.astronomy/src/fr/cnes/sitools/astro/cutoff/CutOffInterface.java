/*******************************************************************************
 * Copyright 2012 CNES - CENTRE NATIONAL d'ETUDES SPATIALES
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
package fr.cnes.sitools.astro.cutoff;

import java.io.OutputStream;

/**
 * Interface for handling cutout services.
 * @author Jean-Christophe Malapert
 */
public interface CutOffInterface {
    /**
     * Supported output file format.
     */
    public enum SupportedFileFormat {
        /**
         * FITS format.
         */
        FITS,
        /**
         * ANIMATED GIF.
         */
        GIF_ANIMATED,
        /**
         * PNG format.
         */
        PNG,
        /**
         * Not defined format.
         */
        NOT_DEFINED
    };

    /**
     * Returns supported formats list.
     * @return supported formats list
     */
    SupportedFileFormat getFormatOutput();

    /**
     * Create a cutout as graphic.
     * @param os output stream
     * @throws CutOffException CutOff Exception
     */
    void createCutoutPreview(OutputStream os) throws CutOffException;

    /**
     * Create a cutout as FITS.
     * @param os output stream
     * @throws CutOffException CutOff Exception
     */
    void createCutoutFits(OutputStream os) throws CutOffException;

    /**
     * Test if the output format can be a graphic.
     * @return True when the output format can be a graphic
     */
    boolean isGraphicAvailable();

    /**
     * Test if the output format can be a FITS.
     * @return True when the output format can be a FITS
     */
    boolean isFitsAvailable();

    /**
     * Test if the file to cut is a data cube.
     * @return True when the file is a data cube
     */
    boolean getIsDataCube();
}
