package com.eaz.webservice.wsdl.ws;

import com.eaz.webservice.wsdl.model.Room;
import com.eaz.webservice.wsdl.model.response.WSResponseRoom;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author javier
 */
@WebService
public interface WSHotelInt 
{
    @WebMethod(operationName = "rooms")
    WSResponseRoom getRooms();
    
    @WebMethod(operationName = "room")
    WSResponseRoom getRoom(@XmlElement(required = true) @WebParam(name="room", mode=WebParam.Mode.IN) Room room);    

    @WebMethod(operationName = "newRoom")
    WSResponseRoom createProperty(@XmlElement(required = true) @WebParam(name="room", mode=WebParam.Mode.IN) Room room);
    
    @WebMethod(operationName = "updateRoom")
    WSResponseRoom modifyRoom( @XmlElement(required = true) @WebParam(name="id", mode=WebParam.Mode.IN) String strID,
                               @XmlElement(required = true) @WebParam(name="room", mode=WebParam.Mode.IN) Room room); 
    
    @WebMethod(operationName = "removeRoom")
    WSResponseRoom removeRoom( @XmlElement(required = true) @WebParam(name="id", mode=WebParam.Mode.IN) String strID);
}