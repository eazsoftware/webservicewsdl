package com.eaz.webservice.wsdl.model.response;
    
/**
 *
 * @author javier
 */
public abstract class WSResponse {
    
    protected ResponseStatus result;
    protected String message;
    
    public WSResponse() {
    
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getResult() {
        return result;
    }

    public void setResult(ResponseStatus result) {
        this.result = result;
    }    
    
}