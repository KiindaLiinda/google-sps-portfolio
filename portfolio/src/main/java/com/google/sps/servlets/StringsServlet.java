package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/strings")
public final class StringsServlet extends HttpServlet {

  public String[] StringArray = {"My favorite color is turquoise", "My favorite fruit is watermelon", "My favorite band is Slipknot"};

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    response.setContentType("text/html;");
    response.getWriter().println("Hello! Welcome to my page!");
  }

}
