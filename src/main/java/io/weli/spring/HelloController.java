package io.weli.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// https://spring.io/guides/gs/serving-web-content/

/**
 * $ http localhost:8080/web/hello
 * HTTP/1.1 200 OK
 * Content-Length: 13
 * Content-Type: text/plain;charset=iso-8859-1
 * Date: Tue, 26 Nov 2019 11:55:57 GMT
 * Server: Jetty(9.4.17.v20190418)
 *
 * jetty/9.4.17.v20190418Hello, world!
 *
 * $
 */
@Controller
public class HelloController {

    @Autowired
    MyContextAware context;

    @GetMapping("/hello")
    // https://stackoverflow.com/questions/7672858/return-only-string-message-from-spring-mvc-3-controller
    @ResponseBody
    public String hello() {
        return context.getServerInfoFromServletContext() + "Hello, world!";
    }
}
