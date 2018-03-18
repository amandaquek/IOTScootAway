/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot_database;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BIOSController implements ServletContextListener{

    /**
     * Receives notification that the web application initialization process is starting.
     * 
     * All ServletContextListeners are notified of context initialization before any filters or servlets in the web application are initialized.
     * @param sce the ServletContextEvent containing the ServletContext that is being initialized
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        //ServletContext ctx = sce.getServletContext();
        //ctx.setAttribute("RoundController", new RoundController());
    }

    /**
     * Receives notification that the ServletContext is about to be shut down.
     * 
     * All servlets and filters will have been destroyed before any ServletContextListeners are notified of context destruction.
     * @param sce the ServletContextEvent containing the ServletContext that is being destroyed
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       //ServletContext ctx = sce.getServletContext();
       //ctx.setAttribute("RoundController", null);
    } 
}