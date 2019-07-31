<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-31
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试Checkbox</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form:form modelAttribute="userCheckBox" method="post" action="/checkBoxForm">
    <table border="1">
        <tr>
            <td>选择课程</td>
            <td>
                <form:checkbox path="courses" value="JAVA EE" label="JAVA EE"/>
                <form:checkbox path="courses" value="Mybatis" label="Mybatis"/>
                <form:checkbox path="courses" value="Spring" label="Spring"/>
            </td>
        </tr>
    </table>
    <form:checkbox path="reader" value="true"/>已经阅读相关协议
</form:form>
</body>
</html>
