package com.demo.todolist;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(name = "todolist", urlPatterns = {"/todolist"})
public class TodoListServlet extends HttpServlet {

    private ArrayList<String> todolist;

    @Override
    public void init() throws ServletException {
        super.init();
        todolist = new ArrayList<>(); // Initialisation de la liste
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Todo List</h2>");

        // Afficher la liste des tâches
        out.println("<ol>");
        for (String task : todolist) {
            out.println("<li>" + task + "</li>");
        }
        out.println("</ol>");

        // Créer un tableau pour afficher les tâches
//        out.println("<table border='1'>");
//        out.println("<tr><th>Tâche</th></tr>"); // En-tête du tableau
//        for (String task : todolist) {
//            out.println("<tr><td>" + task + "</td></tr>");
//        }
//        out.println("</table>");

        // Formulaire pour ajouter une nouvelle tâche
        out.println("<form action='todolist' method='POST'>");
        out.println("<input type='text' name='task' />");
        out.println("<input type='submit' value='Ajouter' />");
        out.println("</form>");

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Récupérer ou sauvegarder la ToDoList
        todolist = (ArrayList<String>) session.getAttribute("todolist");
        if (todolist == null) {
            todolist = new ArrayList<>();
        }

        String newTask = request.getParameter("task");
        if (newTask != null && !newTask.isEmpty()) {
            todolist.add(newTask);
        }
        session.setAttribute("todolist", todolist);

        // Rediriger vers doGet() pour afficher la liste mise à jour
        response.sendRedirect("todolist");
//        response.getWriter().write("<a href='todolist'>retour</a>");

    }
}
