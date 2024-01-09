package com.demo.personne;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/salutation")
public class PrenomServlet extends HttpServlet {

    String prenom;
    String nom;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH'h'mm");
        String formattedTime = currentTime.format(formatter);

        String prenomQuery = request.getParameter("prenom");
        if (prenomQuery != null)
            prenom = prenomQuery;
        String nomQuery = request.getParameter("nom");
        if (nomQuery != null)
            nom = nomQuery;

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("<h1>Bonjour, " + prenom + " " + nom + "! Il est " + formattedTime + " </h1>");
    }
}
