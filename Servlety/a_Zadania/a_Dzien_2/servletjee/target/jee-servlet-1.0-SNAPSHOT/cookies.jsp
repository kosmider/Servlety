<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 25.09.19
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookies.jsp</title>
    <meta CHARSET="UTF-8">
</head>
<body>
<form action="/servletjee_war_exploded/cookies" method="get">
    <p><label for="name">Name: <input type="text" name="name" id="name"></label></p>
    <p><label for="surname">Surname: <input type="text" name="surname" id="surname"></label></p>
    <p><label for="age">Age: <input type="text" name="age" id="age"></label></p>
    <input type="submit" name="wyslij" value="Submit">
</form>
</body>
</html>
