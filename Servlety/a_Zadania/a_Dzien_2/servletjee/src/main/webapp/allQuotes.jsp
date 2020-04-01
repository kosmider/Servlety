<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 12.09.19
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>printQuotes.jsp</title>c
    <style>
        table{
            width: 400px;
        }
        td {
            padding: 5px;
        }
    </style>
</head>
<body>
<c:choose>
    <c:when test="${empty quotes}">
        <h3>Lista cytatów jest putsa</h3>
    </c:when>
    <c:otherwise>
        <table>
            <tr>
                <th>Author</th>
                <th>Zawartosc</th>
            </tr>
            <c:forEach var="quote" items="${quotes}">
                <tr>
                    <td>${quote.author}</td>
                    <td>${quote.content}</td>
                </tr>
            </c:forEach>
        </table>
    </c:otherwise>
</c:choose>
</body>
</html>
