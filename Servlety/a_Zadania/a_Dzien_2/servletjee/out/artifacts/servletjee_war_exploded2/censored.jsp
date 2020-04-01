<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 01.12.19
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Censored</title>
    <meta charset="UTF-8">
</head>
<body>
<form action="/servletjee_war_exploded/censored" method="post">
    <div style="text-align: center;">
        <textarea name="textArea"></textarea><br>
        <input type="checkbox" name="checkBox" value="checked">I am aware of the consequences <br>
        <button type="submit">Send</button>
    </div>
</form>
</body>
</html>
