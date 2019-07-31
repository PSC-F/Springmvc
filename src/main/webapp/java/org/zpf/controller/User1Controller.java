package org.zpf.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zpf.domain.User;

@Controller
public class User1Controller {
    private static final Log logger = LogFactory.getLog(User1Controller.class);

    //ModeAttribute注解优先于login调用,该方法用于接受前台jsp页面传入的参数
    @ModelAttribute
    public void userModel(String loginName, String password, Model model) {
        logger.info("userModel");
        //创建User对象存储jsp传入的参数
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        // 将User对象添加到Model当中
        model.addAttribute("user",user);
    }

    @RequestMapping(value = "/login1")
    public String login(Model model) {
        logger.info("login");
        //从model中取出之前存入的user对象
        User user = (User) model.asMap().get("user");
        System.out.println(user);
        //设置user对象的userName属性
        user.setUserName("测试");
        return "/result1.jsp";
    }
}