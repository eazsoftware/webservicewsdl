package com.eaz.webservice.wsdl.model.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author javier
 */
@XmlRootElement(name = "ResponseStatus")
public enum ResponseStatus {
    SUCCESS("success"), ERROR("error");

    private String responseStatus;

    private ResponseStatus(String strResponseStatus) {
        this.responseStatus = strResponseStatus;
    }

    public String getStatusCode() {
        return this.responseStatus;
    }    
    
}