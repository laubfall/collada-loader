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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kinematics_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kinematics_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instance_kinematics_model" type="{http://www.collada.org/2008/03/COLLADASchema}instance_kinematics_model_type" maxOccurs="unbounded"/>
 *         &lt;element name="technique_common" type="{http://www.collada.org/2008/03/COLLADASchema}kinematics_technique_type"/>
 *         &lt;element name="technique" type="{http://www.collada.org/2008/03/COLLADASchema}technique_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kinematics_type", propOrder = {
    "instanceKinematicsModel",
    "techniqueCommon",
    "technique",
    "extra"
})
public class KinematicsType {

    @XmlElement(name = "instance_kinematics_model", required = true)
    protected List<InstanceKinematicsModelType> instanceKinematicsModel;
    @XmlElement(name = "technique_common", required = true)
    protected KinematicsTechniqueType techniqueCommon;
    protected List<TechniqueType> technique;
    protected List<ExtraType> extra;

    /**
     * Gets the value of the instanceKinematicsModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instanceKinematicsModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceKinematicsModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceKinematicsModelType }
     * 
     * 
     */
    public List<InstanceKinematicsModelType> getInstanceKinematicsModel() {
        if (instanceKinematicsModel == null) {
            instanceKinematicsModel = new ArrayList<InstanceKinematicsModelType>();
        }
        return this.instanceKinematicsModel;
    }

    /**
     * Gets the value of the techniqueCommon property.
     * 
     * @return
     *     possible object is
     *     {@link KinematicsTechniqueType }
     *     
     */
    public KinematicsTechniqueType getTechniqueCommon() {
        return techniqueCommon;
    }

    /**
     * Sets the value of the techniqueCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link KinematicsTechniqueType }
     *     
     */
    public void setTechniqueCommon(KinematicsTechniqueType value) {
        this.techniqueCommon = value;
    }

    /**
     * Gets the value of the technique property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technique property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnique().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechniqueType }
     * 
     * 
     */
    public List<TechniqueType> getTechnique() {
        if (technique == null) {
            technique = new ArrayList<TechniqueType>();
        }
        return this.technique;
    }

    /**
     * Gets the value of the extra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraType }
     * 
     * 
     */
    public List<ExtraType> getExtra() {
        if (extra == null) {
            extra = new ArrayList<ExtraType>();
        }
        return this.extra;
    }
    public void fuck(){System.out.println("fuuuuuuuck");}
}