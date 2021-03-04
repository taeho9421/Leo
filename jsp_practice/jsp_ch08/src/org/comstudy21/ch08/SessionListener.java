package org.comstudy21.ch08;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    static int activeSessions = 0;
    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
    	System.out.println("sessionCreated ...");
    	activeSessions++;
    }
    public void activeSessions(HttpSessionEvent arg0)  { }
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("sessionDestroyed ...");
    	activeSessions--;
    }
	
}
