<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 25.09.19
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddTeam.jsp</title>
    <meta charset="UTF-8">

</head>
<body> ≤
    <c:if test="${not empty msg}">
        <h3>${msg}</h3>
    </c:if>
<form action="/servletjee_war_exploded/addTeam" method="post">
    <p><label for="name">Name: <input type="text" name="name" id="name"></label> </p>
    <p><label for="champions">Champions: <input type="text" name="champions" id="champions"></label> </p>
    <p><label for="adress">Adres: <input type="text" name="adress" id="adress"></label> </p>
    <input type="submit" name="submit" value="submit">
</form>
</body>
</html>
