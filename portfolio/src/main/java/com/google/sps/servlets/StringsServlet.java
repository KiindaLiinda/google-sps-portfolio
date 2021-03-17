package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/strings")
public class StringsServlet extends HttpServlet {

  @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<String> favorites = new ArrayList<String>();
        favorites.add("Watermelon");
        favorites.add("Slipknot");
        favorites.add("Turquoise");
        favorites.add("Ballista");

        Gson gson = new Gson();
        String json = gson.toJson(favorites);
        
        response.setContentType("application/json;");
        response.getWriter().println(json);
    }
}