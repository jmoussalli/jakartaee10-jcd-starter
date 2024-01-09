<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Informations sur la Personne</title>
</head>
<body>

<h1>Personnes VIP</h1>

<table border="1">
    <thead>
    <caption>Personnes VIP</caption>
    <tr>
        <th>Prénom</th>
        <th>Nom</th>
    </tr>
    </thead>
    <c:forEach items="${ personnes }" var="personne">
        <c:if test="${personne.VIP=='OUI'}">
            <tr>
                <td>${personne.getPrenom()}</td>
                <td>${personne.getNom()}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>

<hr>

<form method="GET" action="personnes">
    <input type = "submit" value="Liste des personnes non VIP"/>
</form>

<hr>

<form method="GET" action="personnesVIP">
    <input type = "submit" value="Formulaire de saisie VIP ou non"/>
</form>

</body>
</html>
