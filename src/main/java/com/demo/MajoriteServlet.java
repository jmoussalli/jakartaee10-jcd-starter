package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/majorite")
public class MajoriteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("WEB-INF/majorite.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // récupérer les données dans la requete qui ont été envoyées par
        // l'utilisateur à travers le Form HTML
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");

        // parser le nombre dans le String
        int age = 0;
        String ageString = request.getParameter("age");
        age = ageString == null ? 0 : Integer.parseInt(ageString);

        // envoyer les données à la Vue JSP
        request.setAttribute("prenom", prenom);
        request.setAttribute("nom", nom);
        request.setAttribute("age", age);

        // choix de la Vue JSP à afficher
        request.getRequestDispatcher("WEB-INF/majoriteResultat.jsp")
                .forward(request, response);
    }
}
