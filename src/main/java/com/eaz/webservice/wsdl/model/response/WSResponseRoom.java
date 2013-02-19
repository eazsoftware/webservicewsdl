package com.eaz.webservice.wsdl.model.response;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author javier
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "responseRoom")
public class WSResponseRoom extends WSResponse {
    
    @XmlElement(name = "room")
    protected Collection<WSResponseRoom> room;

    public WSResponseRoom() {
        this.room = new ArrayList<WSResponseRoom>();
    }

    public Collection<WSResponseRoom> getRoom() {
        return room;
    }

    public void setRoom(Collection<WSResponseRoom> room) {
        this.room = room;
    }
       
}