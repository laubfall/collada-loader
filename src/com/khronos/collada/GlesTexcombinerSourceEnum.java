//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.29 at 06:09:13 PM CEST 
//


package com.khronos.collada;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gles_texcombiner_source_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gles_texcombiner_source_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="TEXTURE"/>
 *     &lt;enumeration value="CONSTANT"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="PREVIOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gles_texcombiner_source_enum")
@XmlEnum
public enum GlesTexcombinerSourceEnum {

    TEXTURE,
    CONSTANT,
    PRIMARY,
    PREVIOUS;

    public String value() {
        return name();
    }

    public static GlesTexcombinerSourceEnum fromValue(String v) {
        return valueOf(v);
    }

}
