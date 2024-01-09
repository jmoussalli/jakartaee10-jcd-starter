<%--
  Created by IntelliJ IDEA.
  User: jerom
  Date: 07/01/2024
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Résultat Révision Majorité</title>
</head>
<body>
    <h1>Résultat Révision Majorité : Etes vous majeur ?</h1>
    <div>Votre prénom : ${prenom}</div>
    <div>Votre nom : ${nom}</div>
    <div>Votre âge : ${age}</div>
    <div>Votre adresse : ${adresse}</div>

    <c:choose>
        <c:when test="${age >= 18}">
            <p>Vous êtes majeur</p>
        </c:when>
        <c:otherwise>
            <p>Vous êtes mineur</p>
        </c:otherwise>
    </c:choose>

    <div>
        <a href="revisionmajorite" style="text-decoration: none;">
            <button type="button">Retour</button>
        </a>
    </div>
</body>
</html>
