package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DataBindingController {
    private static final Log logger = LogFactory.getLog(DataBindingController.class);

    //测试@PathVariable注解
    @RequestMapping(value = "/pathvariable/{userId}")
    public void pathVariable(@PathVariable Integer userId) {
        logger.info("通过PathVariable注解获取" + userId);
    }

    //测试@RequestHeader注解
    @RequestMapping(value = "/requestHeaderTest")
    public void requestHeaderTest(@RequestHeader(value = "User-Agent") String userAgent,
                                  @RequestHeader(value = "Accept") String[] accepts) {
        logger.info("通过RequestHeader注解获取" + userAgent);
        for (String accept : accepts) {
            logger.info(accept);
        }
    }

    //测试@CookieValue注解
    @RequestMapping("/cookieValueTest")
    public void cookieValue(@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId) {
        logger.info("通过@CookieValue注解获取" + sessionId);
    }



}
