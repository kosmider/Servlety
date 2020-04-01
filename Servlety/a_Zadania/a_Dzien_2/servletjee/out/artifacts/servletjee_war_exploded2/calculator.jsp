<%--
  Created by IntelliJ IDEA.
  User: przemysaw
  Date: 25.09.19
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator.jsp</title>
</head>
<form action="/servletjee_war_exploded/calculator" method="get">
    <div>
        <label for="A"><p>Insert first value: <input type="text" name="A"
                                                     id="A"></p></label>
        <label for="B"><p>Insert second value: <input type="text" name="B"
                                                      id="B"></p></label>
        <label for="C"><p>Insert third value: <input type="text" name="C"
                                                     id="C"></p></label>
        <label for="D"><p>Insert fourth value: <input type="text" name="D" id="D">
        </p></label>

        <label for="name"><p>Insert name: <input type="text" name="name" id="name"></p></label>
        <label for="surname"><p>Insert surname: <input type="text" name="surname" id="surname"></p></label>


        <p></p><input type="submit" name="Wyslij" value="submit"></p>

    </div>
</form>
</body>
</html>
