package com.demo.personneVIP.controller;

import com.demo.personneVIP.metier.PersonneVIP;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

import static com.demo.personneVIP.metier.ApplicationData.annuaire;

@WebServlet("/personnes")
public class PersonneNonVIPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<PersonneVIP> personnes = annuaire.getPersonneVIPs();
        request.setAttribute("personnes", personnes);
        request.getRequestDispatcher("WEB-INF/personneVIP/personnes.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        String VIP = request.getParameter("vip");

        PersonneVIP p = new PersonneVIP(prenom, nom, VIP);
        annuaire.addPersonneVIP(p);

//        response.sendRedirect("personnesVIP");
        request.getRequestDispatcher("WEB-INF/personneVIP/formulairepersonnes.jsp").forward(request, response);

    }

}
