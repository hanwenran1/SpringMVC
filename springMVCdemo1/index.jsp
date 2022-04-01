<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2022/3/24
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <%--引入样式--%>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <script src="https://fastly.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
<table border="1" style="text-align:center;width:600px;margin:0 auto;">
    <tr>
        <caption style="font-size:36px">Student CURD</caption>
    </tr>
    <tr>
        <td>
            <a href="/jsp/add.jsp">
                <button type="button">ADD</button>
            </a>
        </td>
        <td>
            <a href="/jsp/delete.jsp">
                <button type="button">DELETE</button>
            </a>
        </td>
        <td>
            <a href="/springMVCdemo2/update">
                <button type="button">UPDATE</button>
            </a>
        </td>
        <td>
            <a th:href="@{/target}">
                <button type="button">SHOW</button>
            </a>
        </td>
    </tr>
</table>
</body>
</html>
