<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-08-01
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8"/>
    <title>测试Validator接口验证</title>
</head>
<body>
<h3>登录页面</h3>
<form:form  action="/login06" modelAttribute="userValidation06" method="post">
    <tr>
        <td>登录名:</td>
        <td><form:input path="loginName"/></td>
            <%--        显示loginName的错误信息--%>
        <td><form:errors path="loginName" cssStyle="color: red"/></td>
    </tr>
    <tr>
        <td>密码:</td>
        <td><form:input path="password"/></td>
            <%--        显示password的错误信息--%>
        <td><form:errors path="password" cssStyle="color: red"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"></td>
    </tr>
</form:form>
</body>
</html>
