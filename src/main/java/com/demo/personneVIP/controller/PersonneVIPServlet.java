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

@WebServlet("/vip")
public class PersonneVIPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<PersonneVIP> personnes = annuaire.getPersonneVIPs();
        request.setAttribute("personnes", personnes);
        request.getRequestDispatcher("WEB-INF/personneVIP/personnesVIP.jsp").forward(request, response);
    }

}
