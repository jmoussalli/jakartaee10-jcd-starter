<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Informations sur la Personne</title>
</head>
<body>

<h1>Saisie de Personne VIP ou non</h1>

<form action="personnes" method="POST">
    <label>Prénom : </label><input type="text" id="prenom" name="prenom"><br>
    <label>Nom : </label><input type="text" id="nom" name="nom"><br>
    <label>VIP ? </label>
    <select name="vip" name="VIP">
        <option value="OUI">OUI</option>
        <option value="NON">NON</option>
    </select>
    <input type="submit" value="Envoyer">
</form>

<hr>

<form method="GET" action="personnes">
    <input type = "submit" value="Liste des personnes non VIP"/>
</form>

<hr>

<form method="GET" action="vip">
    <input type = "submit" value="Liste des personnes VIP"/>
</form>


</body>
</html>
