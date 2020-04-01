<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 25.11.19
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GetParameterMap</title>
</head>
<body>
<form action="getParameterMap" method="post">
    Name: <input type="text" name="name">
    Country: <input type="text" name="country"><br>
    Habits: <br>
    <input type="checkbox" name="habits" value="Reading">Reading<br>
    <input type="checkbox" name="habits" value="Movies">Movies<br>
    <input type="checkbox" name="habits" value="Writing">Writing<br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
