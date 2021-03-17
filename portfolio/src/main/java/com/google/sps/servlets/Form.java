package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class Form extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameValue = request.getParameter("name-input");
    String emailValue = request.getParameter("email-input");
    String subjectValue = request.getParameter("subject-input");
    String contentValue = request.getParameter("content-input");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted the following: ");
    System.out.println("Name:" + nameValue);
    System.out.println("Email: " + emailValue);
    System.out.println("Subject: " + subjectValue);
    System.out.println("Content: " + contentValue);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted the following: ");
    response.getWriter().println("Name: " + nameValue);
    response.getWriter().println("Email: " + emailValue);
    response.getWriter().println("Subject: " + subjectValue);
    response.getWriter().println("Content: " + contentValue);
  }
}