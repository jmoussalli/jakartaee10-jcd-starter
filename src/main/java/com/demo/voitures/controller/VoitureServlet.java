package com.demo.voitures.controller;

import com.demo.voitures.metier.Voiture;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

import static com.demo.voitures.metier.ApplicationData.garage;

@WebServlet("/voitures")
public class VoitureServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Voiture> voitures = garage.getVoitures();
        request.setAttribute("voitures", voitures);
        request.getRequestDispatcher("WEB-INF/voiture/voitures.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String marque = request.getParameter("marque");
        String immatriculation = request.getParameter("immatriculation");
        String anneeString = request.getParameter("annee");

        Integer annee = anneeString == null ? 0 : Integer.parseInt(anneeString);

        Voiture p = new Voiture(nom, marque, immatriculation,annee );
        garage.addVoiture(p);
        ArrayList<Voiture> voitures = garage.getVoitures();

        request.setAttribute("voitures", voitures);

        request.getRequestDispatcher("WEB-INF/voiture/voitures.jsp").forward(request, response);

    }

}
