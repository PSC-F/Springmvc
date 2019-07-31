<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-30
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <title>测试接收Json格式的数据</title>
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="js/json2.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            testRequestBody();

        });

        function testRequestBody() {//两个demo不同请求地址/demo1 使用jackson解析器demo2使用了alibaba的库并且需要在spring-mvc中配置
            $.ajax("${pageContext.request.contextPath}/json/testRequestBody2",// 发送请求的URL字符串。
                {
                    dataType: "json", // 预期服务器返回的数据类型。
                    type: "post", //  请求方式 POST或GET
                    contentType: "application/json", //  发送信息至服务器时的内容编码类型
                    // 发送到服务器的数据。
                    data: JSON.stringify({id: 1, name: "Spring MVC企业应用实战"}),
                    async: true, // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
                    // 请求成功后的回调函数。
                    success: function (data) {
                        console.log(data);
                        $("#id").html(data.id);
                        $("#name").html(data.name);
                        $("#author").html(data.author);
                    },
                    // 请求出错时调用的函数
                    error: function () {
                        alert("数据发送失败");
                    }
                });
        }
    </script>
</head>
<body>
编号:<span id="id"></span><br>
书名:<span id="name"></span><br>
作者:<span id="author"></span>
</body>
</html>
