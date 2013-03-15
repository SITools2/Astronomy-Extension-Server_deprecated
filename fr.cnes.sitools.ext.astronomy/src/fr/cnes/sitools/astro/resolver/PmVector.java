//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.13 at 12:27:53 AM CEST 
//


package fr.cnes.sitools.astro.resolver;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for pmVector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pmVector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="v" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="e" type="{}err" minOccurs="0"/>
 *         &lt;element name="q" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="r" type="{}bibcode" minOccurs="0"/>
 *         &lt;element name="pa" type="{}lon"/>
 *         &lt;element name="pmRA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="epmRA" type="{}err" minOccurs="0"/>
 *         &lt;element name="pmDE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="epmDE" type="{}err" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pmVector", propOrder = {
    "v",
    "e",
    "q",
    "r",
    "pa",
    "pmRA",
    "epmRA",
    "pmDE",
    "epmDE"
})
public class PmVector {

    /**
     *
     */
    @XmlElement(required = true)
    protected BigDecimal v;
    /**
     *
     */
    protected BigDecimal e;
    /**
     *
     */
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String q;
    /**
     *
     */
    protected String r;
    /**
     *
     */
    @XmlElement(required = true)
    protected BigDecimal pa;
    /**
     *
     */
    @XmlElement(required = true)
    protected BigDecimal pmRA;
    /**
     *
     */
    protected BigDecimal epmRA;
    /**
     *
     */
    @XmlElement(required = true)
    protected BigDecimal pmDE;
    /**
     *
     */
    protected BigDecimal epmDE;

    /**
     * Gets the value of the v property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getV() {
        return v;
    }

    /**
     * Sets the value of the v property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setV(BigDecimal value) {
        this.v = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setE(BigDecimal value) {
        this.e = value;
    }

    /**
     * Gets the value of the q property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ() {
        return q;
    }

    /**
     * Sets the value of the q property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ(String value) {
        this.q = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR(String value) {
        this.r = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPa() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPa(BigDecimal value) {
        this.pa = value;
    }

    /**
     * Gets the value of the pmRA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPmRA() {
        return pmRA;
    }

    /**
     * Sets the value of the pmRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPmRA(BigDecimal value) {
        this.pmRA = value;
    }

    /**
     * Gets the value of the epmRA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEpmRA() {
        return epmRA;
    }

    /**
     * Sets the value of the epmRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEpmRA(BigDecimal value) {
        this.epmRA = value;
    }

    /**
     * Gets the value of the pmDE property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPmDE() {
        return pmDE;
    }

    /**
     * Sets the value of the pmDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPmDE(BigDecimal value) {
        this.pmDE = value;
    }

    /**
     * Gets the value of the epmDE property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEpmDE() {
        return epmDE;
    }

    /**
     * Sets the value of the epmDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEpmDE(BigDecimal value) {
        this.epmDE = value;
    }

}
