<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fomr" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-08-01
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试06使用注解方式格式化数据</title>

</head>
<body>
<form:form modelAttribute="user06" method="post" action="userController06">
    <table>
        <tr>
            <td>日期类型:</td>
            <td><fomr:input path="birthday"/></td>
        </tr>
        <tr>
            <td>整数类型:</td>
            <td><form:input path="total"/></td>
        </tr>
        <tr>
            <td>百分数类型:</td>
            <td><form:input path="discount"/></td>
        </tr>
        <tr>
            <td>货币类型:</td>
            <td><form:input path="money"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
