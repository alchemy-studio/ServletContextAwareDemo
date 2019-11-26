package io.weli.spring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

@Component
public class MyContextAware implements ServletContextAware {

    private ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println("::::servletContext: " + servletContext);
        this.servletContext = servletContext;
    }

    public String getServerInfoFromServletContext() {
        return servletContext.getServerInfo();
    }
}
