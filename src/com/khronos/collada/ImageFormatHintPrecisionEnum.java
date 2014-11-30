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
 * <p>Java class for image_format_hint_precision_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="image_format_hint_precision_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MID"/>
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="MAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "image_format_hint_precision_enum")
@XmlEnum
public enum ImageFormatHintPrecisionEnum {


    /**
     * Designer does not care as long as it provides "reasonable" percision and performance
     * 
     */
    DEFAULT,

    /**
     * For integers this typically represents 8 bits.  For floats typically 16 bits.
     * 
     */
    LOW,

    /**
     * For integers this typically represents 8 to 24 bits.  For floats typically 16 to 32 bits.
     * 
     */
    MID,

    /**
     * For integers this typically represents 16 to 32 bits.  For floats typically 24 to 32 bits.
     * 
     */
    HIGH,

    /**
     * Typically 32 bits or 64 bits if available.  64 bit has been seperated into it's own catagory beyond HIGH because it typically has significant performance impact and is beyond what non CAD software considers high percision.
     * 
     */
    MAX;

    public String value() {
        return name();
    }

    public static ImageFormatHintPrecisionEnum fromValue(String v) {
        return valueOf(v);
    }

}
