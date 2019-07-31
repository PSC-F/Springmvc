<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-30
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.message}
登录成功,欢迎${requestScope.user.userName}
</body>
</html>
