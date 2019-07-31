package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zpf.domain.User;

@Controller
public class User2Controller {
    private static final Log logger = LogFactory.getLog(User2Controller.class);

    @ModelAttribute
    public void user2Mode2(String loginName, String password, ModelMap modelMap) {
        logger.info("user2mode");
        //创建user对象存储jsp传入参数
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        //将user对象存入modelMap中
        modelMap.addAttribute("user",user);
    }
    @RequestMapping(value ="/login2")
    public String login2(ModelMap modelMap){
        logger.info("login2");
        //从modelMap中取出user
        User user=(User)modelMap.get("user");
        System.out.println(user);
        user.setUserName("测试2");
        return "/result2.jsp";
    }
}
