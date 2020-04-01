<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 12.09.19
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>addQuote.jsp</title>
</head>
<body>
<c:if test="${not empty msg}">
    <h3>${msg}</h3>
</c:if>

<form action="addquote" method="post">
    <p><label for="author">Author: <input type="text" name="author" id="author"></label></p>
    <p><label for="content">Content: <input type="text" name="content" id="content"></label></p>
    <p><input type="submit" name="wyslij" value="Wyslij"></p>
    <a href="index.jsp">
        <input type="button" value="Back to menu"/>
    </a>

    <a href="calculator.jsp">
        <input type="button" value="Calculator">
    </a>

</form>


</body>
</html>