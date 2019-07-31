package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zpf.domain.User;

@Controller
public class User3Controller {
    private static final Log logger = LogFactory.getLog(User3Controller.class);

    @ModelAttribute
    public void user3Model(String loginName, String password, ModelAndView modelAndView) {
        logger.info("user3Model");
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        //将user对象加入modelAndView中
        modelAndView.addObject("user", user);
    }

    @RequestMapping(value = "/login3")
    public ModelAndView login3(ModelAndView modelAndView) {
        logger.info("login3");
        //modeAndView中取出对象
        User user = (User) modelAndView.getModel().get("user");
        //设置username
        user.setUserName("测试3");
        modelAndView.setViewName("/result3.jsp");
        return modelAndView;
    }
}
