<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 25.09.19
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>randomTeams.jsp</title>
    <style>
        table {
            width: 500px;
        }

        td {
            padding: 5px;
        }
    </style>
</head>
<body>
<c:choose>
    <c:when test="${empty teams}">
        <h3>Lista zespołów jest pusta</h3>
    </c:when>
    <c:otherwise>
        <table>
            <tr>
                <th>Nazwa</th>
                <th>Mistrzostw</th>
                <th>Adress</th>
            </tr>
            <tr>
                <td>${teams.name}</td>
                <td>${teams.champions}</td>
                <td>${teams.adress}</td>
            </tr>
        </table>
    </c:otherwise>
</c:choose>

</body>
</html>
