<%--
  Created by IntelliJ IDEA.
  User: linzhuofei
  Date: 2023/8/18
  Time: 5:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<input type="button" value="新增"><br>
<hr>
<table border="1" cellspacing="0" width="800">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>

    </tr>


    <c:forEach items="${brands}" var="brand">

        <tr align="center">

            <td>${brand.id}</td>
            <td>${brand.name}</td>
            <td>${brand.company}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <td>${brand.status}</td>
            <td><a href="#">修改</a> <a href="#">删除</a></td>
        </tr>

    </c:forEach>





</table>

</body>
</html>
