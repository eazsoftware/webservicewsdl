package com.eaz.webservice.wsdl.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author javier
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsroom", 
         propOrder = { "id",
                       "name"
})
@XmlRootElement(name = "room")
public class Room 
{
    @XmlElement(name = "id", required = false)
    protected String id;
    @XmlElement(name = "name", required = false)
    protected String name;
    
    public Room() {
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}
