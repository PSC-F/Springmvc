package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.zpf.domain.User;

import javax.print.DocFlavor;

@Controller
//将Model中的属性名为user的属性放入HttpSession中
@SessionAttributes("user")
public class SessionAttributesController {
    //静态日志类
    public static final Log looger = LogFactory.getLog(SessionAttributesController.class);


    @RequestMapping(value = "/{forName}")
    public String loginForm(@PathVariable String forName) {
        //动态跳转页面
        return forName;
    }

    @RequestMapping(value = "/login-sessionAttributes")
    public String login(
            @RequestParam("loginName") String loginName,
            @RequestParam("password") String password,
            Model model) {
        //创建user对象装载用户信息
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        user.setUserName("admin");
        //将user对象添加到Model当中
        model.addAttribute("user", user);
        return "/welcome.jsp";
    }
}
