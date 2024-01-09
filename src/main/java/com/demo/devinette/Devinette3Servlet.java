package com.demo.devinette;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Random;

@WebServlet("/devinette3")
public class Devinette3Servlet extends HttpServlet {
    int tentativesRestantes = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Récupérer ou générer le nombre aléatoire
        Integer nombreAleatoire = (Integer) session.getAttribute("nombreAleatoire");
        if (nombreAleatoire == null) {
            tentativesRestantes = 4;
            nombreAleatoire = new Random().nextInt(10) + 1;
            session.setAttribute("nombreAleatoire", nombreAleatoire);
        }
        // Récupérer le nombre proposé par le joueur
        String nombreProposeStr = request.getParameter("nombre");
        int nombrePropose;
        try {
            nombrePropose = Integer.parseInt(nombreProposeStr);
        } catch (NumberFormatException e) {
            response.getWriter().write("Veuillez entrer un nombre valide.");
            return;
        }

        // Reste-t-il des tentatives ? Sinon on réinitialise les variables
        if (tentativesRestantes == 0) {
            response.getWriter().write("<h1>Perdu, nombre de tentatives restantes égal à zero !</h1>");
            session.setAttribute("nombreAleatoire", null);
        } else {
            // Comparer le nombre proposé avec le nombre aléatoire
            if (nombrePropose == nombreAleatoire) {
                response.getWriter().write("<h1>Bravo! Vous avez deviné le nombre.</h1>");
            } else if (nombrePropose > nombreAleatoire) {
                tentativesRestantes--;
                response.getWriter().write("<h1>Trop grand. le nombre est " + nombreAleatoire + ". Essayez encore. Il vous reste " + tentativesRestantes + " tentatives.</h1>");
            } else {
                tentativesRestantes--;
                response.getWriter().write("<h1>Trop petit. le nombre est " + nombreAleatoire + ". Essayez encore.  Il vous reste " + tentativesRestantes + " tentatives.</h1>");
            }
        }
    }
}
