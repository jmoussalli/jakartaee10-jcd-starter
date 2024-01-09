<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Personnes non VIP</title>
</head>
<body>

<h1>Personnes non VIP</h1>

<table border="1">
    <thead>
    <caption>Personnes NON-VIP</caption>
    <tr>
        <th>Prénom</th>
        <th>Nom</th>
    </tr>
    </thead>
    <c:forEach items="${ personnes }" var="personne">
        <c:if test="${personne.VIP=='NON'}">
            <tr>
                <td>${personne.getPrenom()}</td>
                <td>${personne.getNom()}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>

<hr>

<form method="GET" action="vip">
    <input type = "submit" value="Personnes VIP"/>
</form>

<hr>

<form method="GET" action="personnesVIP">
    <input type = "submit" value="Saisie de personne"/>
</form>

</body>
</html>
