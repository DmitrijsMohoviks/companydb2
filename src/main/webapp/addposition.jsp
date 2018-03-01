<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="main.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway:400,800,900" rel="stylesheet">
    <title>Add position to Positions</title>
    <style>
    </style>
</head>
<body>
<div class="w3-display-container container">
    <div class="w3-card-4 w3-display-middle">
        <header class="w3-container w3-blue">
            <h2>Add Position</h2>
        </header>
        <form class="w3-container" action="addposition" method="post">
            <p>
                <label for="position-name" class="w3-text-red"><b>Enter position name:</b></label>
                <input class="w3-input w3-border" id="position-name" type="text" name="position-name">
            </p>
            <p>
                <input class="w3-button w3-blue" type="submit" name="register" value="Add!">
            </p>
        </form>
    </div>
</div>
</body>
</html>
