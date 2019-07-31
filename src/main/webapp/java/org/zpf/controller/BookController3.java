package org.zpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zpf.domain.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/json")
public class BookController3 {
    @RequestMapping(value = "/testRequestBody3")
    //@ResponseBody注解会将集合数据类型转为josn格式返回客户端
    @ResponseBody
    /**
     * getJson方法会将List集合的数据转换成Json格式，并返回到客户端
     */
    public Object getJson() {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1, "spring MVC 企业应用实战", "肖文吉"));
        list.add(new Book(2, "轻量级JavaEE企业应用实战", "李刚"));
        return list;
    }
}
