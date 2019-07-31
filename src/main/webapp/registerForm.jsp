<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-30
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <meta charset="UTF-8">
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/user/register" method="post">
        <span>登录名:</span><input type="text" name="loginName"><br>
        <span>密码:</span><input type="text" name="password"><br>
        <span>真实姓名:</span><input type="text" name="userName"><br>
        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>
