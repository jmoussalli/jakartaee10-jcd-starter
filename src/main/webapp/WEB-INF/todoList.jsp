<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<String> tasks = (ArrayList<String>) request.getAttribute("tasks");
%>
<html>
<body>
<h2>Todo List</h2>
<ol>
    <% for(String task : tasks) { %>
    <li><%= task %></li>
    <% } %>
</ol>
<form action='todolistMVC' method='POST'>
    <input type='text' name='task' />
    <input type='submit' value='Ajouter' />
</form>
</body>
</html>
