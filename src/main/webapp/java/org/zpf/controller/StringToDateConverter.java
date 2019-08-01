package org.zpf.controller;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//实现Converter<s,t>接口
public class StringToDateConverter implements Converter<String, Date> {
    //日期模板如YY-MM-DD
    private String datePattern;

    public StringToDateConverter() {
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    //Converter<S,T>接口的类型转换方法
    @Override
    public Date convert(String date) {


        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(this.datePattern);
            //将日期字符串转换为Date类型返回
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("日期转换失败");
            return null;
        }

    }
}
