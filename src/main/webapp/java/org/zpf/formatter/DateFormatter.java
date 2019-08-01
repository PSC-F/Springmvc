package org.zpf.formatter;

import org.springframework.format.Formatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//实现Formatter接口
public class DateFormatter implements Formatter<Date> {
    //日期类型模板如yyyy-MM-dd
    private String datePattern;
    //日期格式化对象
    private SimpleDateFormat dateFormat;
    //构造器，通过依赖注入的日期类型来创建日期格式化对象
    public DateFormatter(String datePattern) {
        this.datePattern = datePattern;
        this.dateFormat=new SimpleDateFormat(datePattern);
    }
    //解析文本字符串,返回一个Formatter<T>的T类型对象
    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        return dateFormat.parse(s);
    }

    //显示Formatter<T>的T类型对象
    @Override
    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}
