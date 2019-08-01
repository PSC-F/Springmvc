package org.zpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zpf.domain.UserValidation06;

@Controller
public class UserValidatorController {
    //注入UserValidator对象
    @Autowired
    @Qualifier("userValidator")
    private UserValidator userValidator;

    @RequestMapping(value = "/login06", method = RequestMethod.POST)
    public String login(
            @ModelAttribute UserValidation06 userValidation06,
            Model model,
            Errors errors
    ) {
        model.addAttribute("userValidation06", userValidation06);
        //调用userValidator的验证方法
        userValidator.validate(userValidation06, errors);
        //如果验证通过跳转到到
        if (errors.hasErrors()) {
            return "code06-loginForm.jsp";
        }
        return "welcome.jsp";
    }
}
