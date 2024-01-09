<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Informations sur la Personne</title>
</head>
<body>
<h2>Formulaire de la Personne</h2>
<form action="personne" method="POST">
    Prénom: <input type="text" name="prenom"><br>
    Nom: <input type="text" name="nom"><br>
    Âge: <input type="number" name="age"><br>
    <input type="submit" value="Envoyer">
</form>

<hr>

<%
    if (request.getAttribute("prenom") != null) {
        String prenom = (String) request.getAttribute("prenom");
        String nom = (String) request.getAttribute("nom");
        int age = (Integer) request.getAttribute("age");

        String status = age < 18 ? "mineure" : "majeure";
%>
<p>Vous vous appelez : <%= prenom %> <%= nom %></p>
<p>Et vous êtes une personne <%= status %>.</p>
<%
    }
%>
</body>
</html>
