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
 *      The brep element contains the complete topological     description of a static structure. There are also the     corresponding geometrical descriptions of the vertices,     edges and faces.    
 * 
 * <p>Java class for brep_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="brep_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curves" type="{http://www.collada.org/2008/03/COLLADASchema}curves_type" minOccurs="0"/>
 *         &lt;element name="surface_curves" type="{http://www.collada.org/2008/03/COLLADASchema}surface_curves_type" minOccurs="0"/>
 *         &lt;element name="surfaces" type="{http://www.collada.org/2008/03/COLLADASchema}surfaces_type" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.collada.org/2008/03/COLLADASchema}source_type" maxOccurs="unbounded"/>
 *         &lt;element name="vertices" type="{http://www.collada.org/2008/03/COLLADASchema}vertices_type"/>
 *         &lt;element name="edges" type="{http://www.collada.org/2008/03/COLLADASchema}edges_type" minOccurs="0"/>
 *         &lt;element name="wires" type="{http://www.collada.org/2008/03/COLLADASchema}wires_type" minOccurs="0"/>
 *         &lt;element name="faces" type="{http://www.collada.org/2008/03/COLLADASchema}faces_type" minOccurs="0"/>
 *         &lt;element name="pcurves" type="{http://www.collada.org/2008/03/COLLADASchema}pcurves_type" minOccurs="0"/>
 *         &lt;element name="shells" type="{http://www.collada.org/2008/03/COLLADASchema}shells_type" minOccurs="0"/>
 *         &lt;element name="solids" type="{http://www.collada.org/2008/03/COLLADASchema}solids_type" minOccurs="0"/>
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
@XmlType(name = "brep_type", propOrder = {
    "curves",
    "surfaceCurves",
    "surfaces",
    "source",
    "vertices",
    "edges",
    "wires",
    "faces",
    "pcurves",
    "shells",
    "solids",
    "extra"
})
public class BrepType {

    protected CurvesType curves;
    @XmlElement(name = "surface_curves")
    protected SurfaceCurvesType surfaceCurves;
    protected SurfacesType surfaces;
    @XmlElement(required = true)
    protected List<SourceType> source;
    @XmlElement(required = true)
    protected VerticesType vertices;
    protected EdgesType edges;
    protected WiresType wires;
    protected FacesType faces;
    protected PcurvesType pcurves;
    protected ShellsType shells;
    protected SolidsType solids;
    protected List<ExtraType> extra;

    /**
     * Gets the value of the curves property.
     * 
     * @return
     *     possible object is
     *     {@link CurvesType }
     *     
     */
    public CurvesType getCurves() {
        return curves;
    }

    /**
     * Sets the value of the curves property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvesType }
     *     
     */
    public void setCurves(CurvesType value) {
        this.curves = value;
    }

    /**
     * Gets the value of the surfaceCurves property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceCurvesType }
     *     
     */
    public SurfaceCurvesType getSurfaceCurves() {
        return surfaceCurves;
    }

    /**
     * Sets the value of the surfaceCurves property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceCurvesType }
     *     
     */
    public void setSurfaceCurves(SurfaceCurvesType value) {
        this.surfaceCurves = value;
    }

    /**
     * Gets the value of the surfaces property.
     * 
     * @return
     *     possible object is
     *     {@link SurfacesType }
     *     
     */
    public SurfacesType getSurfaces() {
        return surfaces;
    }

    /**
     * Sets the value of the surfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacesType }
     *     
     */
    public void setSurfaces(SurfacesType value) {
        this.surfaces = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceType }
     * 
     * 
     */
    public List<SourceType> getSource() {
        if (source == null) {
            source = new ArrayList<SourceType>();
        }
        return this.source;
    }

    /**
     * Gets the value of the vertices property.
     * 
     * @return
     *     possible object is
     *     {@link VerticesType }
     *     
     */
    public VerticesType getVertices() {
        return vertices;
    }

    /**
     * Sets the value of the vertices property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticesType }
     *     
     */
    public void setVertices(VerticesType value) {
        this.vertices = value;
    }

    /**
     * Gets the value of the edges property.
     * 
     * @return
     *     possible object is
     *     {@link EdgesType }
     *     
     */
    public EdgesType getEdges() {
        return edges;
    }

    /**
     * Sets the value of the edges property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgesType }
     *     
     */
    public void setEdges(EdgesType value) {
        this.edges = value;
    }

    /**
     * Gets the value of the wires property.
     * 
     * @return
     *     possible object is
     *     {@link WiresType }
     *     
     */
    public WiresType getWires() {
        return wires;
    }

    /**
     * Sets the value of the wires property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiresType }
     *     
     */
    public void setWires(WiresType value) {
        this.wires = value;
    }

    /**
     * Gets the value of the faces property.
     * 
     * @return
     *     possible object is
     *     {@link FacesType }
     *     
     */
    public FacesType getFaces() {
        return faces;
    }

    /**
     * Sets the value of the faces property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacesType }
     *     
     */
    public void setFaces(FacesType value) {
        this.faces = value;
    }

    /**
     * Gets the value of the pcurves property.
     * 
     * @return
     *     possible object is
     *     {@link PcurvesType }
     *     
     */
    public PcurvesType getPcurves() {
        return pcurves;
    }

    /**
     * Sets the value of the pcurves property.
     * 
     * @param value
     *     allowed object is
     *     {@link PcurvesType }
     *     
     */
    public void setPcurves(PcurvesType value) {
        this.pcurves = value;
    }

    /**
     * Gets the value of the shells property.
     * 
     * @return
     *     possible object is
     *     {@link ShellsType }
     *     
     */
    public ShellsType getShells() {
        return shells;
    }

    /**
     * Sets the value of the shells property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShellsType }
     *     
     */
    public void setShells(ShellsType value) {
        this.shells = value;
    }

    /**
     * Gets the value of the solids property.
     * 
     * @return
     *     possible object is
     *     {@link SolidsType }
     *     
     */
    public SolidsType getSolids() {
        return solids;
    }

    /**
     * Sets the value of the solids property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidsType }
     *     
     */
    public void setSolids(SolidsType value) {
        this.solids = value;
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
