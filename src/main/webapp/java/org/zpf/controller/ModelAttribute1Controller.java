package org.zpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelAttribute1Controller {
    //使用@ModelAttribute注解的value属性，来指定Model属性的名称、Model属性的值就是方法的返回值
    @ModelAttribute("loginName")
    public String userModel1(
            @RequestParam("loginName") String loginName) {
        return loginName;
    }

    @RequestMapping(value = "/login-ModelAttribute")
    public String login1() {
        return "/result1.jsp";
    }
}
