//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.29 at 06:09:13 PM CEST 
//


package com.khronos.collada;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for fx_rendertarget_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fx_rendertarget_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="param">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="instance_image" type="{http://www.collada.org/2008/03/COLLADASchema}instance_image_type"/>
 *       &lt;/choice>
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
 *       &lt;attribute name="mip" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
 *       &lt;attribute name="face" type="{http://www.collada.org/2008/03/COLLADASchema}image_face_enum" default="POSITIVE_X" />
 *       &lt;attribute name="slice" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_rendertarget_type", propOrder = {
    "param",
    "instanceImage"
})
@XmlSeeAlso({
    FxStenciltargetType.class,
    FxDepthtargetType.class,
    FxColortargetType.class
})
public class FxRendertargetType {

    protected FxRendertargetType.Param param;
    @XmlElement(name = "instance_image")
    protected InstanceImageType instanceImage;
    @XmlAttribute(name = "index")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger index;
    @XmlAttribute(name = "mip")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mip;
    @XmlAttribute(name = "face")
    protected ImageFaceEnum face;
    @XmlAttribute(name = "slice")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger slice;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link FxRendertargetType.Param }
     *     
     */
    public FxRendertargetType.Param getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxRendertargetType.Param }
     *     
     */
    public void setParam(FxRendertargetType.Param value) {
        this.param = value;
    }

    /**
     * Gets the value of the instanceImage property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceImageType }
     *     
     */
    public InstanceImageType getInstanceImage() {
        return instanceImage;
    }

    /**
     * Sets the value of the instanceImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceImageType }
     *     
     */
    public void setInstanceImage(InstanceImageType value) {
        this.instanceImage = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        if (index == null) {
            return new BigInteger("0");
        } else {
            return index;
        }
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the mip property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMip() {
        if (mip == null) {
            return new BigInteger("0");
        } else {
            return mip;
        }
    }

    /**
     * Sets the value of the mip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMip(BigInteger value) {
        this.mip = value;
    }

    /**
     * Gets the value of the face property.
     * 
     * @return
     *     possible object is
     *     {@link ImageFaceEnum }
     *     
     */
    public ImageFaceEnum getFace() {
        if (face == null) {
            return ImageFaceEnum.POSITIVE_X;
        } else {
            return face;
        }
    }

    /**
     * Sets the value of the face property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFaceEnum }
     *     
     */
    public void setFace(ImageFaceEnum value) {
        this.face = value;
    }

    /**
     * Gets the value of the slice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlice() {
        if (slice == null) {
            return new BigInteger("0");
        } else {
            return slice;
        }
    }

    /**
     * Sets the value of the slice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlice(BigInteger value) {
        this.slice = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Param {

        @XmlAttribute(name = "ref", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String ref;

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
        public void fuck(){System.out.println("fuuuuuuuck");}
    }
    public void fuck(){System.out.println("fuuuuuuuck");}
}
