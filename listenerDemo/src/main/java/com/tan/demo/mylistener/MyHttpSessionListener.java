package com.tan.demo.mylistener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    public MyHttpSessionListener() {
        System.out.println("构造方法调用了...");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session is created...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session is destroyed...");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
        System.out.println("an attribute is added to a session...");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
        System.out.println("an attribute is removed from a session...");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
        System.out.println("an attribute is replaced in a session...");
    }
}
