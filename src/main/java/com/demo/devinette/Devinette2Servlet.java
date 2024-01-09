package com.demo.devinette;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Random;

@WebServlet("/devinette2")
public class Devinette2Servlet extends HttpServlet {
    Integer nombreAleatoire;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Récupérer ou générer le nombre aléatoire
        if (nombreAleatoire == null) {
            nombreAleatoire = new Random().nextInt(10) + 1;
        }
        // Récupérer le nombre proposé par le joueur
        String nombreProposeStr = request.getParameter("nombre");
        int nombrePropose;
        try {
            nombrePropose = Integer.parseInt(nombreProposeStr);
        } catch (NumberFormatException e) {
            response.getWriter().write("<h1>Veuillez entrer un nombre valide.</h1>");
            return;
        }

        // Comparer le nombre proposé avec le nombre aléatoire
        if (nombrePropose == nombreAleatoire) {
            response.getWriter().write("<h1>Bravo ! Vous avez deviné le nombre.</h1>");
            nombreAleatoire = null;
        } else if (nombrePropose > nombreAleatoire) {
            response.getWriter().write("<h1>Trop grand. le nombre est " + nombreAleatoire+ ". Essayez encore.</h1>");
        } else {
            response.getWriter().write("<h1>Trop petit. le nombre est " + nombreAleatoire + ". Essayez encore.</h1>");
        }
    }
}
