<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 12.09.19
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>players.jsp</title>
</head>
<body>
<table>
    <c:forEach items="${players}" var="player">
        <tr>
            <td>${player.name}, ${player.secName}, ${player.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
