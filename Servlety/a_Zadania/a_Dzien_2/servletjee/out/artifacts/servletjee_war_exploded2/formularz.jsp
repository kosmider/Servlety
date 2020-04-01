<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 27.11.19
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formularz</title>
</head>
<body>
 <form action="/servletjee_war_exploded/formularz" method="post">
     Imię: <input type="text" name="userName">
     Nazwisko:<input type="text" name="userSurname">
     <input type="submit" value="Send">
 </form>
</body>
</html>
