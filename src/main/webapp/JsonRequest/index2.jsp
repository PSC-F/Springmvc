<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-31
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试返回Json格式的数据</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <title>测试接收Json格式的数据</title>
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="js/json2.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            testRequestBody();
        });

        function testRequestBody() {
            $.post("${pageContext.request.contextPath}/json/testRequestBody3", null, function (data) {
                $.each(data, function () {
                    var tr = $("<tr align='center'/>");
                    $("<td/>").html(this.id).appendTo(tr);
                    $("<td/>").html(this.name).appendTo(tr);
                    $("<td/>").html(this.author).appendTo(tr);
                    $("#booktable").append(tr);
                })
            }, "json");

        }
    </script>
</head>
<body>
<table id="booktable" border="1" style="border-collapse: collapse;">
    <tr align="center">
        <th>编号</th>
        <th>书名</th>
        <th>作者</th>
    </tr>
</table>
</body>
</html>
