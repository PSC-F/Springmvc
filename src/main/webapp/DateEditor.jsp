<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-08-01
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试转换器</title>
</head>
<body>
本页为@InitBinder装配的自定义编辑器
<br>
优先级:
@InitBinder的装配 > ConversionService的装配 > WebBindingInitializer的接口全局装配

<form action="${pageContext.request.contextPath}/registerDateEditor" method="post">
    <table>
        <tr>
            <td><label>登录名:</label></td>
            <td><input type="text" id="loginName" name="loginName"/></td>
        </tr>
        <tr>
            <td><label>生日:</label></td>
            <td><input type="text" id="birthday" name="birthday"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
