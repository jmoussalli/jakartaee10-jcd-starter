<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Plantes</title>
</head>
<body>

<h1>Plantes</h1>

<form action="plantes" method="POST">
    <label>Nom:</label><input type="text" name="nom"/>
    <label>Espèce:</label><input type="text" name="espece"/>
    <label>Couleur:</label><input type="text" name="couleur"/>
    <label>Age:</label><input type="number" name="age" required/>
    <input type="submit" value="Envoyer"/>
</form>

<ul>
    <c:forEach items="${ plantes }" var="plante">
        <li>${plante.getNom()} ${plante.getCouleur()}</li>
    </c:forEach>
</ul>

</body>
</html>
