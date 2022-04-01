<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>SSM crud</title>
</head>
<body>

<table border="1" style="text-align:center;width:600px;margin:0 auto;">
  <tr>
    <caption style="font-size:36px">Student CURD</caption>
  </tr>
  <tr>
    <td>
      <a href="./web/jsp/add.jsp">
        <button type="button">ADD</button>
      </a>
    </td>
    <td>
      <a href="/web/jsp/delete.jsp">
        <button type="button">DELETE</button>
      </a>
    </td>
    <td>
      <a href="/springMVCdemo2/update">
        <button type="button">UPDATE</button>
      </a>
    </td>
    <td>
      <a href="/springMVCdemo2/show">
        <button type="button">SHOW</button>
      </a>
    </td>
  </tr>
</table>
</body>
</html>