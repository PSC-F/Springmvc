package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    private static final Log logger = LogFactory.getLog(HelloController.class);

    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        logger.info("hello方法被调用");
//        创建准备返回的ModeAndView对象,该对象通常包含视图名、模型名称以及模型对象
        ModelAndView mv = new ModelAndView();
//        添加模型数据，可以是任意的POJO对象
        mv.addObject("message", "Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字具体到视图页面
        mv.setViewName("/welcome.jsp");
//       返回ModeAndView对象
        return mv;
    }

}
