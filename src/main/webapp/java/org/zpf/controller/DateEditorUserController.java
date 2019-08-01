package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zpf.converter.DateEditor;
import org.zpf.domain.UserRegister;

import java.util.Date;

@Controller
//@RequestMapping(value ="/ConversionService")
public class DateEditorUserController{
    private static final Log logger = LogFactory.getLog(UserRegisterController.class);

//    @RequestMapping(value = "/{forName}")
//    public String loginForm(@PathVariable String forName) {
//        //动态跳转
//        return forName;
//    }
    //在控制器初始化时进行注册属性编辑器
    @InitBinder
    public void initBinder(WebDataBinder binder){
        //注册自定义编辑器
        binder.registerCustomEditor(Date.class,new DateEditor());
    }

    @RequestMapping(value = "/registerDateEditor", method = RequestMethod.POST)
    public String register(
            @ModelAttribute UserRegister userRegister, Model model
    ) {
        logger.info(userRegister);
        model.addAttribute("userRegister",userRegister);
        return "success.jsp";

    }
}
