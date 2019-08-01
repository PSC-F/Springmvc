package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zpf.domain.UserRegister;
@Controller
public class DateFormatterController {
    private static final Log logger = LogFactory.getLog(UserRegisterController.class);

//    @RequestMapping(value = "/{forName}")
//    public String loginForm(@PathVariable String forName) {
//        //动态跳转
//        return forName;
//    }

    @RequestMapping(value = "/registerFormatter", method = RequestMethod.POST)
    public String register(
            @ModelAttribute UserRegister userRegister, Model model
    ) {
        logger.info(userRegister);
        model.addAttribute("userRegister",userRegister);
        return "success.jsp";

    }
}
