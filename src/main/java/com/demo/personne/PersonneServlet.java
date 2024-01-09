package com.demo.personne;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "personneServlet", urlPatterns = {"/personneServlet"})
public class PersonneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("<h1>Formulaire Personne</h1>");
        response.getWriter().write("<form action='personne' method='POST'>");
        response.getWriter().write("<div>");
        response.getWriter().write("<label>Prénom:</label>");
        response.getWriter().write("<input type='text' name='prenom'/>");
        response.getWriter().write("</div>");
        response.getWriter().write("<div>");
        response.getWriter().write("<label>Nom:</label>");
        response.getWriter().write("<input type='text' name='nom'/>");
        response.getWriter().write("</div>");
        response.getWriter().write("<div>");
        response.getWriter().write("<input type='submit' value='Envoyer'/>");
        response.getWriter().write("</div>");
        response.getWriter().write("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        System.out.println("<h1>prenom : " + prenom + "</h1>");
        System.out.println("<h1>nom : " + nom + "</h1>");
    }
}
