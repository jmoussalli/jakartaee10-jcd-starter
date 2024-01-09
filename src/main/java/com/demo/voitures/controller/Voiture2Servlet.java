package com.demo.voitures.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static com.demo.voitures.metier.ApplicationData.garage;

@WebServlet("/voitures2")
public class Voiture2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/voitures");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomVoitureASupprimer = request.getParameter("nomVoitureASupprimer");
        garage.supprimerVoiture(nomVoitureASupprimer);

        response.sendRedirect("voitures");
    }


}
