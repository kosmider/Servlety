<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>randomQuote.jsp</title>
    <style>
        table {
            width: 400px
        }
        td {
            padding: 5px
        }
    </style>
</head>
<body>
<c:choose>
    <c:when test="${empty quotes}">
        <h3>List cytatow jest pusta</h3>
    </c:when>
    <c:otherwise>
        <table>
            <tr>
                <th>Autor</th>
                <th>Zawartosc</th>
            </tr>
            <tr>
                <td>${quote.author}</td>
                <td>${quote.content}</td>
            </tr>
        </table>
    </c:otherwise>
</c:choose>
</body>
</html>
