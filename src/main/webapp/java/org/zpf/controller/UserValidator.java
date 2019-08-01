package org.zpf.controller;


import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.zpf.domain.User;
import org.zpf.domain.UserValidation06;

//实现Spring的Validator
@Repository("userValidator")//该注解将对象注释为Spring容器中的一个Bean,名字为userValidator
public class UserValidator implements Validator {
    //该校验器能够对Clazz类型的对象进行校验
    @Override
    public boolean supports(Class<?> aClass) {
        //uservalidation06指定的class参数所表示的类或接口是否相同.或是否是其超类或超接口
        return UserValidation06.class.isAssignableFrom(aClass);
    }

    //对目标类target进行校验,并将校验错误记录在errors当中
    @Override
    public void validate(Object o, Errors errors) {
        /*
         * 使用ValidationUtils中的一个静态方法rejectIfEmpty()来对loginName属性进行校验.
         * 假若loginName属性是Null或空字符串,就拒绝验证通过.
         * */
        ValidationUtils.rejectIfEmpty(errors, "loginName", null, "登录名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");
        UserValidation06 user = (UserValidation06) o;
        if (user.getLoginName().length() > 10) {
            //使用errors的rejectValue方法验证
            errors.rejectValue("loginName", null, "用户名不能超过10个字符");
        }
        if (user.getPassword() != null
                && !user.getPassword().equals("")
                && user.getPassword().length() < 6) {
            errors.rejectValue("password", null, "密码不能小于6位");
        }

    }
}
