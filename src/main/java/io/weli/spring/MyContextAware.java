package io.weli.spring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

// https://books.google.fr/books?id=rjRjDwAAQBAJ&pg=PA343&lpg=PA343&dq=ServletContextAware+usage&source=bl&ots=8mQ2gG_fmQ&sig=ACfU3U3DIef--U-Pwsd8KROQQ2_PSwy6uA&hl=en&sa=X&ved=2ahUKEwjl0f745YfmAhVRXn0KHRuZAHEQ6AEwCHoECAoQAQ#v=onepage&q=ServletContextAware%20usage&f=false
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
