<%--
  Created by IntelliJ IDEA.
  User: linzhuofei
  Date: 2023/8/18
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--c:if : 用來完成邏輯判斷，替換java if else--%>

<%--<c:if test="true">
    <h1>true</h1>
</c:if>

<c:if test="false">
    <h1>false</h1>
</c:if>--%>

    <c:if test="${status ==1}">
        good
    </c:if>

    <c:if test="${status ==0}">
        禁用
    </c:if>

</body>
</html>
