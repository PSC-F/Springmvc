package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zpf.domain.User;
import java.util.ArrayList;
import java.util.List;

@Controller//指示该类是一个控制器类,可以同时处理多个请求动作
//RequestMapping可以注释一个控制器类，此时方法都将映射为类级别的请求。表示该控制器处理的所有的请求都被映射到Value的路径下
@RequestMapping(value = "/user")
public class UserController {
    //静态List集合，此处替代数据库用来保存注册的用户信息
    public static List<User> userList;

    //UserController构造函数,初始化userlist
    public UserController() {
        super();
        userList = new ArrayList<>();
    }

    //静态的日志类LogFactory
    private static Log logger = LogFactory.getLog(UserController.class);

    //该方法映射的请求为localhost://8080/Springmvc/user/register 支持Get请求
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("register Get方法被调用...");
        //跳转注册页面
        return "/registerUserRegister.jsp";
    }

    /**
     * 该方法支持Post请求
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("loginName") String loginName,
                           @RequestParam("password") String password,
                           @RequestParam("userName") String userName) {
        //将请求中的loginName参数的值赋值给loginName变量，password、userName同理
        logger.info("register POST请求被调用...");
        //创建user对象
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setLoginName(loginName);
        //模拟数据库存储user信息
        userList.add(user);
        return "/loginForm.jsp";
    }

    /**
     * 该方法映射地址user/login
     */
    @RequestMapping(value = "/login")
    //将请求中的参数赋值给变量
    public String login(@RequestParam("loginName") String loginName,
                        @RequestParam("password") String password,
                        Model model) {
        logger.info("登录名:" + loginName + "密码:" + password);
        //到集合中查找用户是否存在、模拟数据库验证
        for (User user : userList
        ) {
            if (user.getLoginName().equals(loginName)
                    && user.getPassword().equals(password)
            ) {
                model.addAttribute("user", user);
                return "/welcome.jsp";
            }
        }
        return "/loginForm.jsp";
    }
}
