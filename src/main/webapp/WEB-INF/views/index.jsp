<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\19 0019
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello World</h1>
<span id = "text">
    <%=request.getAttribute("test")%>
    <a href="${pageContext.request.contextPath}/logout">loginout</a>
</span>
</body>
</html>
