<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
    <title>smurfs.jsp</title>
</head>
<body>
<table>
    <c:forEach items="${smurfs}" var="smurf">
        <tr>
            <td>${smurf.name}, ${smurf.attribute}, ${smurf.description}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
