<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-30
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试_ModelAttribute1</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/login-ModelAttribute" method="post">
        <span>登录名</span><input type="text" name="loginName">
        <span>密码</span><input type="text" name="password">
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>
