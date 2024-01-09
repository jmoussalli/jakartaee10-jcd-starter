package com.demo.personne;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "personne", urlPatterns = {"/personne"})
public class PersonneJspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/personne.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        int age = Integer.parseInt(request.getParameter("age"));

        request.setAttribute("prenom", prenom);
        request.setAttribute("nom", nom);
        request.setAttribute("age", age);

        request.getRequestDispatcher("WEB-INF/personne.jsp").forward(request, response);
    }
}
