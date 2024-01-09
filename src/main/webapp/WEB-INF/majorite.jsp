<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="fr">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Etes vous majeur</h1>


   <form action="majorite" method="POST">
    <label for="prenom">Prénom:</label>
    <input type="text" id="prenom" name="prenom"/>

    <label for="nom">Nom:</label>
    <input type="text" id="nom" name="nom"/>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age"/>

    <input type="submit" value="Envoyer"/>
   </form>

  </body>
</html>