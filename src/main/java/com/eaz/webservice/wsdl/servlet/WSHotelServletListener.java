package com.eaz.webservice.wsdl.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author user
 */
@WebListener()
public class WSHotelServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {       
        sce.getServletContext().setAttribute("released", true); 
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       
    }
    
}