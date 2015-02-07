package Encheres.xml;//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.07 at 12:03:06 PM CET 
//


import impl.EnchereTypeImpl;
import impl.PersonneTypeImpl;
import impl.SiteImpl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Encheres.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static Void _useJAXBProperties = null;

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Encheres.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Site }
     *
     */
    public Site createSite() {
        return new SiteImpl();
    }

    /**
     * Create an instance of {@link EnchereType }
     *
     */
    public EnchereType createEnchereType() {
        return new EnchereTypeImpl();
    }

    /**
     * Create an instance of {@link PersonneType }
     * 
     */
    public PersonneType createPersonneType() {
        return new PersonneTypeImpl();
    }

}
