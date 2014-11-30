//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.29 at 06:09:13 PM CEST 
//


package com.khronos.collada;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			The animation element categorizes the declaration of animation information. The animation 
 * 			hierarchy contains elements that describe the animation's key-frame data and sampler functions, 
 * 			ordered in such a way to group together animations that should be executed together.
 * 			
 * 
 * <p>Java class for animation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="animation_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.collada.org/2008/03/COLLADASchema}asset_type" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="source" type="{http://www.collada.org/2008/03/COLLADASchema}source_type" maxOccurs="unbounded"/>
 *             &lt;choice>
 *               &lt;sequence>
 *                 &lt;element name="sampler" type="{http://www.collada.org/2008/03/COLLADASchema}sampler_type" maxOccurs="unbounded"/>
 *                 &lt;element name="channel" type="{http://www.collada.org/2008/03/COLLADASchema}channel_type" maxOccurs="unbounded"/>
 *                 &lt;element name="animation" type="{http://www.collada.org/2008/03/COLLADASchema}animation_type" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;element name="animation" type="{http://www.collada.org/2008/03/COLLADASchema}animation_type" maxOccurs="unbounded"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="sampler" type="{http://www.collada.org/2008/03/COLLADASchema}sampler_type" maxOccurs="unbounded"/>
 *             &lt;element name="channel" type="{http://www.collada.org/2008/03/COLLADASchema}channel_type" maxOccurs="unbounded"/>
 *             &lt;element name="animation" type="{http://www.collada.org/2008/03/COLLADASchema}animation_type" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="animation" type="{http://www.collada.org/2008/03/COLLADASchema}animation_type" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "animation_type", propOrder = {
    "content"
})
public class AnimationType {

    @XmlElementRefs({
        @XmlElementRef(name = "extra", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "source", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sampler", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "asset", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "animation", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "channel", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Animation" is used by two different parts of a schema. See: 
     * line 8690 of https://www.khronos.org/files/collada_schema_1_5
     * line 8682 of https://www.khronos.org/files/collada_schema_1_5
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SamplerType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtraType }{@code >}
     * {@link JAXBElement }{@code <}{@link SourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChannelType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimationType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }
    public void fuck(){System.out.println("fuuuuuuuck");}
}
