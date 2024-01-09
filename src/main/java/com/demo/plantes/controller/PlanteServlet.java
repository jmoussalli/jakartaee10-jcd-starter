package com.demo.plantes.controller;

import com.demo.plantes.metier.Plante;
import com.demo.plantes.metier.Serre;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/plantes")
public class PlanteServlet extends HttpServlet {

    private Serre serre = new Serre();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Plante> plantes = serre.getPlantes();
        request.setAttribute("plantes", plantes);
        request.getRequestDispatcher("WEB-INF/plante/plantes.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String espece = request.getParameter("espece");
        String couleur = request.getParameter("couleur");
        String ageString = request.getParameter("age");

        Integer age = ageString == null ? 0 : Integer.parseInt(ageString);

        request.setAttribute("nom", nom);
        request.setAttribute("espece", espece);
        request.setAttribute("couleur", couleur);
        request.setAttribute("age", age);

        Plante p = new Plante(nom, espece, couleur,age );
        serre.addPlante(p);
        ArrayList<Plante> plantes = serre.getPlantes();

        request.setAttribute("plantes", plantes);

        request.getRequestDispatcher("WEB-INF/plante/plantes.jsp").forward(request, response);


    }

}
