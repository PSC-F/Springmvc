<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-31
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringMVC标签库练习</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
数据绑定:id值 、name值 自动映射到对象中的字段
1.使用自动绑定默认的"command"属性
2.通过指定modelAttribute属性来指定绑定对象是谁
<form:form modelAttribute="user" method="post" action="/registerForm">
    <table border="1">
        <tr>
            <td>姓名:</td>
            <td><form:input path="userName"/></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><form:input path="sex"/></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><form:input path="age"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
