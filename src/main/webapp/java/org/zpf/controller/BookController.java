package org.zpf.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zpf.domain.Book;


import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping(value = "/json")
public class BookController {
    private static final Log logger = LogFactory.getLog(BookController.class);
    //@RequestBody根据Json数据转换为对应的Object对象
    @RequestMapping(value = "/testRequestBody")
    public void SetJson(@RequestBody Book book,
                        HttpServletResponse response)throws Exception{
        //ObjectMapper类是Jackson的主要类,提供了一些功能将java对象转化为对应的Json格式数据
        ObjectMapper mapper=new ObjectMapper();
        //将mapper转化Json输出
        logger.info("接受到客户端请求");
        logger.info(mapper.writeValueAsString(book));
        book.setAuthor("张鹏飞");
        response.setContentType("text/html;charset=UTF-8");
        //将book对象转换为Json输出到客户端
        response.getWriter().println(mapper.writeValueAsString(book));
    }
}
