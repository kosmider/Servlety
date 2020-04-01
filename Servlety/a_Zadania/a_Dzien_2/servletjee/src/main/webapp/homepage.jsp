<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 13.09.19
  Time: 01:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Zadanie 5</title>
</head>
<body>
<p>Informujemy, że ta strona korzysta z plików cookies.</p>
<c:choose>
    <c:when test="${not empty cookie.accept.value}">
        <form action="homepage" method="get">
            <p>Akceptuję pliki cookies <input type="checkbox" name="accept" value="yes"/></p>
            <p><input type="submit"/></p>
        </form>
    </c:when>
</c:choose>
</body>
</html>

