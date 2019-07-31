<%--
  Created by IntelliJ IDEA.
  User: index
  Date: 2019-07-31
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试接受XML格式数据</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <title>测试接收Json格式的数据</title>
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="js/json2.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            sendXml();
        });

        function sendXml() {
            var xmlData = "<?xml version=\"1.0\"encoding=UTF-8\"standalone=\"yes\"?>" +
                "<book><id>1</id><name>疯狂java讲义</name><author>李刚</author></book>";
            $.ajax("${pageContext.request.contextPath}/sendXml",//发送请求的url
                {
                    type: "POST",//请求方式
                    contentType: "application/xml",//发送信息至服务器的编码类型
                    data: xmlData,//发送的数据
                    async: true//异步请求
                });
        }
    </script>
</head>
<body>

</body>
</html>
