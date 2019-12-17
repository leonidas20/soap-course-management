//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.12.17 um 05:55:20 PM CET 
//


package com.in28minutes.courses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetAllCourseDetailsResponse" type="{http://in28minutes.com/courses}CourseDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllCourseDetailsResponse"
})
@XmlRootElement(name = "GetAllCourseDetailsResponse")
public class GetAllCourseDetailsResponse {

    @XmlElement(name = "GetAllCourseDetailsResponse", required = true)
    protected CourseDetails getAllCourseDetailsResponse;

    /**
     * Ruft den Wert der getAllCourseDetailsResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CourseDetails }
     *     
     */
    public CourseDetails getGetAllCourseDetailsResponse() {
        return getAllCourseDetailsResponse;
    }

    /**
     * Legt den Wert der getAllCourseDetailsResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseDetails }
     *     
     */
    public void setGetAllCourseDetailsResponse(CourseDetails value) {
        this.getAllCourseDetailsResponse = value;
    }

}
