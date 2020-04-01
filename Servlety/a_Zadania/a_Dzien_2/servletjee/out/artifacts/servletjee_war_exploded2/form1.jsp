<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" content="text/html">
    <title>JSP checkbox</title>
</head>
<body>

    <form action="/servletjee_war_exploded/form1" method="post">
        <div style="text-align: center;">Choose ingredients: <br>
        ABC<input type="checkbox" name="checkBox" value="ABC"><br>
        XYZ<input type="checkbox" name="checkBox" value="XYZ"/><br>
        WGA<input type="checkbox" name="checkBox" value="WGA"/><br>
        <button type="submit">Send</button>
        </div>
    </form>
</body>
</html>