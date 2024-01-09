<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Voitures</title>
</head>
<body>

<h1>Voitures</h1>

<form action="voitures" method="POST">
    <label>Nom:</label><input type="text" name="nom"/>
    <label>Marque:</label><input type="text" name="marque"/>
    <label>Immatriculation:</label><input type="text" name="immatriculation"/>
    <label>Année:</label><input type="number" name="annee" required/>
    <input type="submit" value="Envoyer"/>
</form>

<table border="solid">
    <tr>
        <th>Nom</th>
        <th>Marque</th>
        <th>Immatriculation</th>
        <th>Année</th>
    </tr>
    <c:forEach items="${ voitures }" var="voiture">
        <tr>
            <td>${voiture.getNom()}</td>
            <td>${voiture.getMarque()}</td>
            <td>${voiture.getImmatriculation()}</td>
            <td>${voiture.getAnnee()}</td>
            <td>
                <form method="POST" action="voitures2">
                    <input type = "hidden" name = "nomVoitureASupprimer" value="${v.nom}"/>
                    <input type = "submit" value="Supprimer"/>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
