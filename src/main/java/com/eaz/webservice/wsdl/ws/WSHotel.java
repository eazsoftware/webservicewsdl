package com.eaz.webservice.wsdl.ws;

import com.eaz.webservice.wsdl.model.Room;
import com.eaz.webservice.wsdl.model.response.ResponseStatus;
import com.eaz.webservice.wsdl.model.response.WSResponseRoom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;

/**
 *
 * @author javier
 */
@WebService(serviceName="HotelService", endpointInterface = "com.eaz.webservice.wsdl.ws.WSHotelInt")
public class WSHotel implements WSHotelInt
{
    public final static Logger log = Logger.getLogger(WSHotel.class.getName());
    public static Level logLevel = Level.WARNING;         

    public WSHotel() {
    
    }
    
    @Override
    public WSResponseRoom getRooms() {
        WSResponseRoom wsResponseRoom = new WSResponseRoom();
        
        try {
            Collection<WSResponseRoom> cWSResponseRoom = new ArrayList<WSResponseRoom>();
            
            if(true) {
                wsResponseRoom.setRoom(cWSResponseRoom);
                wsResponseRoom.setResult(ResponseStatus.SUCCESS);
                wsResponseRoom.setMessage("Rooms searched successfully");                 
            }
            else {
                wsResponseRoom.setResult(ResponseStatus.ERROR);
                wsResponseRoom.setMessage("No room found");
            }
        }
        catch(Exception e) {
            log.log(logLevel, "------- Exception in getRooms: {0}", new Object[]{e.toString()});
            
            wsResponseRoom.setResult(ResponseStatus.ERROR);
            wsResponseRoom.setMessage("Error searching rooms: " + e.toString());            
        }        
        
        return wsResponseRoom;       
    }
    
    @Override
    public WSResponseRoom getRoom(Room room){
        WSResponseRoom wsResponseRoom = new WSResponseRoom();
        
        try {
            Collection<WSResponseRoom> cWSResponseRoom = new ArrayList<WSResponseRoom>();
            
            if(true) {
                wsResponseRoom.setRoom(cWSResponseRoom);
                wsResponseRoom.setResult(ResponseStatus.SUCCESS);
                wsResponseRoom.setMessage("Room searched successfully: " + room.toString());                 
            }
            else {
                wsResponseRoom.setResult(ResponseStatus.ERROR);
                wsResponseRoom.setMessage("No room found");
            }
        }
        catch(Exception e) {
            log.log(logLevel, "------- Exception in createProperty: {0}", new Object[]{e.toString()});
            
            wsResponseRoom.setResult(ResponseStatus.ERROR);
            wsResponseRoom.setMessage("Error searching room: " + e.toString());            
        }        
        
        return wsResponseRoom;    
    }   

    @Override
    public WSResponseRoom createProperty(Room room){
        WSResponseRoom wsResponseRoom = new WSResponseRoom();
        
        try {
            Collection<WSResponseRoom> cWSResponseRoom = new ArrayList<WSResponseRoom>();
            
            if(true) {
                wsResponseRoom.setRoom(cWSResponseRoom);
                wsResponseRoom.setResult(ResponseStatus.SUCCESS);
                wsResponseRoom.setMessage("Room created successfully");                 
            }
            else {
                wsResponseRoom.setResult(ResponseStatus.ERROR);
                wsResponseRoom.setMessage("No room created");
            }
        }
        catch(Exception e) {
            log.log(logLevel, "------- Exception in createProperty: {0}", new Object[]{e.toString()});
            
            wsResponseRoom.setResult(ResponseStatus.ERROR);
            wsResponseRoom.setMessage("Error creating room: " + e.toString());            
        }        
        
        return wsResponseRoom;     
    }
    
    @Override
    public WSResponseRoom modifyRoom( String strID,
                                      Room room){
        WSResponseRoom wsResponseRoom = new WSResponseRoom();
        
        try {
            Collection<WSResponseRoom> cWSResponseRoom = new ArrayList<WSResponseRoom>();
            
            if(true) {
                wsResponseRoom.setRoom(cWSResponseRoom);
                wsResponseRoom.setResult(ResponseStatus.SUCCESS);
                wsResponseRoom.setMessage("Room modified successfully");                 
            }
            else {
                wsResponseRoom.setResult(ResponseStatus.ERROR);
                wsResponseRoom.setMessage("No room found with id ["+strID+"]");
            }
        }
        catch(Exception e) {
            log.log(logLevel, "------- Exception in modifyRoom: {0}", new Object[]{e.toString()});
            
            wsResponseRoom.setResult(ResponseStatus.ERROR);
            wsResponseRoom.setMessage("Error modifying room with id ["+strID+"]. " + e.toString());            
        }        
        
        return wsResponseRoom;    
    }
    
    @Override
    public WSResponseRoom removeRoom(String strID){
        WSResponseRoom wsResponseRoom = new WSResponseRoom();
        
        try {
            Collection<WSResponseRoom> cWSResponseRoom = new ArrayList<WSResponseRoom>();
            
            if(true) {
                wsResponseRoom.setRoom(cWSResponseRoom);
                wsResponseRoom.setResult(ResponseStatus.SUCCESS);
                wsResponseRoom.setMessage("Room removed successfully");                 
            }
            else {
                wsResponseRoom.setResult(ResponseStatus.ERROR);
                wsResponseRoom.setMessage("No room found with id ["+strID+"]");
            }
        }
        catch(Exception e) {
            log.log(logLevel, "------- Exception in removeRoom: {0}", new Object[]{e.toString()});
            
            wsResponseRoom.setResult(ResponseStatus.ERROR);
            wsResponseRoom.setMessage("Error removing room with id ["+strID+"]. " + e.toString());            
        }        
        
        return wsResponseRoom;
    } 
    
}
