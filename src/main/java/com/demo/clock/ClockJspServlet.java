package com.demo.clock;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

@WebServlet("/clockMVC")
public class ClockJspServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        LocalDateTime heure = LocalDateTime.now();
        request.setAttribute("heure", heure );

        Boolean ilFaitJour = false;
        request.setAttribute("ilFaitJour", ilFaitJour);

        ArrayList<String> jourSemaine = new ArrayList<>();
        jourSemaine.add("lundi");
        jourSemaine.add("mardi");
        jourSemaine.add("mercredi");
        jourSemaine.add("jeudi");
        jourSemaine.add("vendredi");
        jourSemaine.add("samedi");
        jourSemaine.add("dimanche");
        request.setAttribute("jours", jourSemaine);

//        response.getWriter().write("Hello !");

        request.getRequestDispatcher("WEB-INF/clock.jsp")
                .forward(request, response);
    }
}