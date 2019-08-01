package org.zpf.domain;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;

//使用以注解为驱动的数据格式化
public class User06 implements Serializable {
    //日期类型
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    //正常数字类型
    @NumberFormat(style = NumberFormat.Style.NUMBER, pattern = "#,###")
    private int total;
    //百分比类型
    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private double discount;
    //货币类型
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double money;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
