<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FormSec.jsp</title>
</head>
<body>
    <form action="/servletjee_war_exploded/receiverSec" method="get">
        <p><label for="name">Name: <input type="text" name="name" id="name"></label></p>
        <p><label for="mail">Mail: <input type="text" name="mail" id="mail"></label></p>
        <p><label for="id">Id: <input type="text" name="id" id="id"></label></p>
        <p><input type="submit" name="wyslij" value="Wyslij"></p>
    </form>
</body>
</html>
