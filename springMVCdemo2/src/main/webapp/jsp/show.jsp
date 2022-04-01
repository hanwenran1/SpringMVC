<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2022/3/28
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>show</title>

</head>
<style>
    td{
        width:100px;
    }
    table{text-align:center}
</style>
<body>
<h2>Department Info</h2>
<table border="1">
    <tr>
        <td>dept_id</td>
        <td>dept_name</td>
    </tr>
    <c:forEach items="${stus}" var="dept">
        <tr>
            <td>${dept.dept_id}</td>
            <td>${dept.dept_name}</td>
        </tr>
    </c:forEach>
</table>
<a href="javascript:history.back()"> 返回 </a>
</body>

</html>
