<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Przelicznik walut</title>
    <style>
        ul {list-style-type: none}
        li {padding: 5px}
    </style>
</head>
<body>
<form action="/servletjee_war_exploded/s" method="post">
    <div><label for="amount">Kwota:<input type="number" name="amount" id="amount" step="0.01"></label></div>
    <ul>
        <li><label for="eurUsd"><input type="radio" name="currencyPair" id="eurUsd" value="eur-usd">EUR - USD</label></li>
        <li><label for="usdEur"><input type="radio" name="currencyPair" id="usdEur" value="usd-eur">USD - EUR</label></li>
        <li><label for="eurPln"><input type="radio" name="currencyPair" id="eurPln" value="eur-pln">EUR - PLN</label></li>
        <li><label for="plnEur"><input type="radio" name="currencyPair" id="plnEur" value="pln-eur">PLN - EUR</label></li>
        <li><label for="usdPln"><input type="radio" name="currencyPair" id="usdPln" value="usd-pln">USD - PLN</label></li>
        <li><label for="plnUsd"><input type="radio" name="currencyPair" id="plnUsd" value="pln-usd">PLN - USD</label></li>
    </ul>
    <div><input type="submit" value="Przelicz"></div>
</form>
</body>
</html>