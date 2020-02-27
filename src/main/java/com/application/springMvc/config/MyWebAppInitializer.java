/*package com.application.springMvc.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

*//**
 * Java Config - instead of a web.xml
 * @author Ihor Savchenko
 * @version 1.0
 *//*
public class MyWebAppInitializer extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        XmlWebApplicationContext cxt = new XmlWebApplicationContext();
        cxt.setConfigLocation("/WEB-INF/app-context.xml");
        return cxt;
    }
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        XmlWebApplicationContext cxt = new XmlWebApplicationContext();
        cxt.setConfigLocation("/WEB-INF/app-context-servlet.xml");
        return cxt;
    }
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}*/
