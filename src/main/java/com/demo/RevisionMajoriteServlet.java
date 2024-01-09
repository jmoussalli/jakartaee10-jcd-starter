package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/revisionmajorite")
public class RevisionMajoriteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/revision/revisionmajorite.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        int age = 0;
        String ageString = request.getParameter("age");
        age = ageString == null ? 0 : Integer.parseInt(ageString);
        String adresse = request.getParameter("adresse");

        request.setAttribute("nom", nom);
        request.setAttribute("prenom", prenom);
        request.setAttribute("age", age);
        request.setAttribute("adresse", adresse);

        request.getRequestDispatcher("WEB-INF/revision/revisionmajoriteresultat.jsp").forward(request, response);
    }

}
