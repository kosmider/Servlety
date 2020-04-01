<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 04.12.19
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookie2</title>
</head>
<body>
<form action="/servletjee_war_exploded/addToCookies" method="post">
    <label>
        Klucz:
        <input type="text" name="key">
    </label>
    <label>
        Wartość:
        <input type="text" name="value">
    </label>
    <input type="submit">
</form>
</body>
</html>
