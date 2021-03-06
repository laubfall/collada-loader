//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.29 at 06:09:13 PM CEST 
//


package com.khronos.collada;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for altitude_mode_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="altitude_mode_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="absolute"/>
 *     &lt;enumeration value="relativeToGround"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "altitude_mode_enum")
@XmlEnum
public enum AltitudeModeEnum {

    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),
    @XmlEnumValue("relativeToGround")
    RELATIVE_TO_GROUND("relativeToGround");
    private final String value;

    AltitudeModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AltitudeModeEnum fromValue(String v) {
        for (AltitudeModeEnum c: AltitudeModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
