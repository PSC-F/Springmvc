package org.zpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zpf.domain.UserForm;


@Controller
public class FormUserController {
    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm(Model model) {
        UserForm userForm = new UserForm("jack", "男", 28);
        //Model中添加属性Command，值为user对象 前者为1.自动绑定   这里使用第2种绑定需在页面指定modelAttribute的名称user
        model.addAttribute("user", userForm);
        return "FormTest.jsp";
    }
}
