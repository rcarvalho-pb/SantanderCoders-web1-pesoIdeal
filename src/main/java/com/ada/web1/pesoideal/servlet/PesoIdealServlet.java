package com.ada.web1.pesoideal.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpRequest;

@WebServlet(name = "PesoIdealServlet", urlPatterns = "/calc")
public class PesoIdealServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        Double peso;

        String sexo = req.getParameter("sexo");
        String altura = req.getParameter("altura");

        if(sexo.equals("M")) {
            peso = ( 72.7 * Double.parseDouble(altura)) - 58;
        }
        else {
            peso = ( 62.1 * Double.parseDouble(altura)) - 44.7;
        }

        req.setAttribute("peso", String.format("%.2f kg", peso));
        res.setHeader("peso", String.format("%.2f", peso));
        req.getRequestDispatcher("/index.jsp").forward(req, res);
    }
}
