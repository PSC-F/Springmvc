package org.zpf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zpf.domain.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

@Controller
public class BookController4 {
    private static final Log logger = LogFactory.getLog(BookController4.class);

    //@RequestBody Book book会将传递的xml数据自动绑定到Book对象
    @RequestMapping(value = "/sendXml", method = RequestMethod.POST)
    public void sendXml(@RequestBody Book book) {
        logger.info(book);
        logger.info("接受xml成功");
    }

    //@ResponseBody注解会自动将Book对象转为XML数据返回
    @RequestMapping(value = "/readXml", method = RequestMethod.POST)
    public @ResponseBody
    Book readXml() throws Exception {
        //通过JAXBContext的newInstance方法，传递一个class就可以获得一个上下文
        JAXBContext context = JAXBContext.newInstance(Book.class);
        //创建一个Unmarshall对象
        Unmarshaller unmar = context.createUnmarshaller();
        InputStream is = this.getClass().getResourceAsStream("book.xml");
        Book book = (Book) unmar.unmarshal(is);
        logger.info(book);
        return book;
    }
}
