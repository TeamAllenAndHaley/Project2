package com.allenhaley;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //automatically triggered on startup, because WebapplicationInitializer extends ContextLoaderListener
        WebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));

        //next three lines take place of xml servlet and servlet mapping
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(context));

        //<load-on-startup>
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/api/*");
    }

    private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.allenhaley.WebConfig");
        return context;
    }
}
