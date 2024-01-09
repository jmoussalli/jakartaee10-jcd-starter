package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Random;

@WebServlet("/memocouleur")
public class MemoCouleur extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        // Récupérer la couleur de l'utilisateur
        String memoCouleur = (String) session.getAttribute("couleur");
        response.getWriter().write("<h1>Votre couleur était : " + memoCouleur+ ".</h1>");
        // Récupérer la couleur saisie de l'utilisateur
        memoCouleur = request.getParameter("couleur");
        session.setAttribute("couleur", memoCouleur);
        response.getWriter().write("<h1>Votre couleur est maintenant : " + memoCouleur+ ".</h1>");
    }
}
