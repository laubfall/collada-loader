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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			Geometry describes the visual shape and appearance of an object in the scene.
 * 			The geometry element categorizes the declaration of geometric information. Geometry is a 
 * 			branch of mathematics that deals with the measurement, properties, and relationships of 
 * 			points, lines, angles, surfaces, and solids.
 * 			
 * 
 * <p>Java class for geometry_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geometry_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.collada.org/2008/03/COLLADASchema}asset_type" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="convex_mesh" type="{http://www.collada.org/2008/03/COLLADASchema}convex_mesh_type"/>
 *           &lt;element name="mesh" type="{http://www.collada.org/2008/03/COLLADASchema}mesh_type"/>
 *           &lt;element name="spline" type="{http://www.collada.org/2008/03/COLLADASchema}spline_type"/>
 *           &lt;element name="brep" type="{http://www.collada.org/2008/03/COLLADASchema}brep_type"/>
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
@XmlType(name = "geometry_type", propOrder = {
    "asset",
    "convexMesh",
    "mesh",
    "spline",
    "brep",
    "extra"
})
public class GeometryType {

    protected AssetType asset;
    @XmlElement(name = "convex_mesh")
    protected ConvexMeshType convexMesh;
    protected MeshType mesh;
    protected SplineType spline;
    protected BrepType brep;
    protected List<ExtraType> extra;
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
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link AssetType }
     *     
     */
    public AssetType getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetType }
     *     
     */
    public void setAsset(AssetType value) {
        this.asset = value;
    }

    /**
     * Gets the value of the convexMesh property.
     * 
     * @return
     *     possible object is
     *     {@link ConvexMeshType }
     *     
     */
    public ConvexMeshType getConvexMesh() {
        return convexMesh;
    }

    /**
     * Sets the value of the convexMesh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvexMeshType }
     *     
     */
    public void setConvexMesh(ConvexMeshType value) {
        this.convexMesh = value;
    }

    /**
     * Gets the value of the mesh property.
     * 
     * @return
     *     possible object is
     *     {@link MeshType }
     *     
     */
    public MeshType getMesh() {
        return mesh;
    }

    /**
     * Sets the value of the mesh property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeshType }
     *     
     */
    public void setMesh(MeshType value) {
        this.mesh = value;
    }

    /**
     * Gets the value of the spline property.
     * 
     * @return
     *     possible object is
     *     {@link SplineType }
     *     
     */
    public SplineType getSpline() {
        return spline;
    }

    /**
     * Sets the value of the spline property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplineType }
     *     
     */
    public void setSpline(SplineType value) {
        this.spline = value;
    }

    /**
     * Gets the value of the brep property.
     * 
     * @return
     *     possible object is
     *     {@link BrepType }
     *     
     */
    public BrepType getBrep() {
        return brep;
    }

    /**
     * Sets the value of the brep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrepType }
     *     
     */
    public void setBrep(BrepType value) {
        this.brep = value;
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