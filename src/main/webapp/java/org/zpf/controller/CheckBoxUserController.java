package org.zpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zpf.domain.UserCheckBox;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CheckBoxUserController {
    @RequestMapping(value = "/checkBoxForm", method = RequestMethod.GET)
    public String registerForm(Model model) {
        UserCheckBox userCheckBox = new UserCheckBox();
        //设置boolean变量reader值为true,页面checkbox复选框会被选中
        userCheckBox.setReader(true);
        //为集合变量Courses设置JAVAEE和Spring.页面checkBox复选框这两项会被选中
        List<String> list = new ArrayList<>();
        list.add("JAVA EE");
        list.add("Spring");
        userCheckBox.setCourses(list);
        //model中添加属性userCheckBox,值为userCheckBox对象
        model.addAttribute("userCheckBox", userCheckBox);
        return "CheckBox.jsp";
    }

}
