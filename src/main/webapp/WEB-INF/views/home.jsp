<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />" type="text/css">
    <link rel="stylesheet" href="<c:url value="/resources/css/stylesheet.css" />" type="text/css">
    <link rel="icon" type="image/png" href="<c:url value="/resources/graphic/favicon.png" />" sizes="32x32">
    <title>FPL</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>

<body>


<nav class="navbar fixed-top navbar-expand-sm justify-content-center">

    <!-- Links -->
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="initialize">Initialiser</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="getAllPlayers">Spillere</a>
        </li>
    </ul>

</nav>

</body>
</html>