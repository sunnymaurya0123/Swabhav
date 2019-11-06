package com.techlabs.listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class EventListeners implements HttpSessionListener {
	
	private static int visitorCount=0;
	private int activeUsersCount=0;
	private ServletContext context=null;
	
    public EventListeners() {
        System.out.println("Inside Listener Controller");
        
    }

    public void sessionCreated(HttpSessionEvent event)  { 
         System.out.println("Inside session created");
         visitorCount++;
         activeUsersCount++;
         System.out.println(event.getSession().getServletContext());
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("Inside session destroyed");
    	activeUsersCount--;
    }
	
    public static int getVisitorCount() {
        return visitorCount;
    }
    
    public int getActiveUserCount() {
    	return activeUsersCount;
    }
    
    private void storeInServletContext(HttpSessionEvent event) {
    	HttpSession session=event.getSession();
    	context = session.getServletContext();
    	context.setAttribute("actieUserCounter", this);
    }
}
