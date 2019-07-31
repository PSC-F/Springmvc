<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-30
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <span>登录名:</span><input type="text" name="loginName"><br>
        <span>密码:</span><input type="text" name="password"><br>
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>
