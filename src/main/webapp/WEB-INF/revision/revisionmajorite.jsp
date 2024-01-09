<%--
  Created by IntelliJ IDEA.
  User: jerom
  Date: 07/01/2024
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Révision Majorité WebServlet</title>
</head>
<body>
<h1>Révision WebServlet Majorité</h1>

<%--form[action=revisionmajorite method=POST]>label[for=prenom]{Prénom:}+input[type=text name=prenom id=prenom]+label[for=nom]{Nom:}+input[type=text name=nom id=nom]+label[for=age]{Age:}+input[type=number name=age id=age]+label[for=adresse]{Adresse:}+input[type=textarea name=adresse id=adresse]+input[type=submit value=Envoyer]--%>
<form action="revisionmajorite" method="POST">
    <div><label for="prenom">Prénom:</label><input type="text" name="prenom" id="prenom"></div>
    <div><label for="nom">Nom:</label><input type="text" name="nom" id="nom"></div>
    <div><label for="age">Age:</label><input type="number" name="age" id="age"></div>
    <div><label for="adresse">Adresse:</label><input type="textarea" height="3" name="adresse" id="adresse"></div>
    <div><input type="submit" value="Envoyer"></div>
</form>
</body>
</html>
