package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zpf.domain.User06;

import java.io.Serializable;

@Controller
public class UserController06 {
    private static final Log logger = LogFactory.getLog(UserController06.class);

    @RequestMapping(value = "/userController06")
    public String test(
            @ModelAttribute User06 user06,
            Model model
    ) {
        logger.info(user06);
        model.addAttribute("user06", user06);
        return "success06.jsp";

    }
}
