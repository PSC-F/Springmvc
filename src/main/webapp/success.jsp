<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-08-01
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
登录名:${userRegister.loginName}<br>
生日:<fmt:formatDate value="${userRegister.birthday}"
pattern="yyyy年MM月dd日"/>
</body>
</html>
