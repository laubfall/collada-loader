//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.29 at 06:09:13 PM CEST 
//


package com.khronos.collada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for image_source_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="image_source_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ref" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="hex">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.collada.org/2008/03/COLLADASchema>list_of_hex_binary_type">
 *                 &lt;attribute name="format" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "image_source_type", propOrder = {
    "ref",
    "hex"
})
@XmlSeeAlso({
    com.khronos.collada.ImageType.InitFrom.class,
    com.khronos.collada.ImageType.Create2D.InitFrom.class,
    com.khronos.collada.ImageType.Create3D.InitFrom.class,
    com.khronos.collada.ImageType.CreateCube.InitFrom.class
})
public class ImageSourceType {

    @XmlSchemaType(name = "anyURI")
    protected String ref;
    protected ImageSourceType.Hex hex;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the hex property.
     * 
     * @return
     *     possible object is
     *     {@link ImageSourceType.Hex }
     *     
     */
    public ImageSourceType.Hex getHex() {
        return hex;
    }

    /**
     * Sets the value of the hex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSourceType.Hex }
     *     
     */
    public void setHex(ImageSourceType.Hex value) {
        this.hex = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.collada.org/2008/03/COLLADASchema>list_of_hex_binary_type">
     *       &lt;attribute name="format" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Hex {

        @XmlValue
        protected List<String> value;
        @XmlAttribute(name = "format", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String format;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getValue() {
            if (value == null) {
                value = new ArrayList<String>();
            }
            return this.value;
        }

        /**
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }
        public void fuck(){System.out.println("fuuuuuuuck");}
    }
    public void fuck(){System.out.println("fuuuuuuuck");}
}