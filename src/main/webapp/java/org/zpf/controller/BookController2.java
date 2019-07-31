package org.zpf.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zpf.domain.Book;

import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping(value = "/json")
public class BookController2 {
    private static final Log logger = LogFactory.getLog(BookController2.class);

    @RequestMapping(value = "/testRequestBody2")//注意地址2 以后测试时检查地址
    public void setJson(
            @RequestBody Book book,
            HttpServletResponse response) throws Exception {
        //JsonObject-lib包是一个beans,collections,maps,java arrays和xml 和Json互相转换的包
        //使用JsonObject将book对象转换成json输出
        logger.info(JSONObject.toJSONString(book));
        book.setAuthor("zpf");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(JSONObject.toJSONString(book));
    }
}
