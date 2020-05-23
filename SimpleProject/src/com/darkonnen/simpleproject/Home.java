package com.darkonnen.simpleproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String favoriteLanguage = request.getParameter("favoriteLanguage");
        String homeTown = request.getParameter("homeTown");
        
        if (firstName == null || firstName == "") {
        	firstName = "Unknown";
        } 
        
        if(lastName == null || lastName == "") {
        	lastName = "Unknown";
        }
        
        if(favoriteLanguage == null || favoriteLanguage == "") {
        	favoriteLanguage = "Unknown";
        }
        
        if(homeTown == null || homeTown == "") {
        	homeTown = "Unknown";
        }
        
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome " + firstName + " " + lastName + "</h1>");
		out.write("<br>");
		out.write("<p>Your favorite language is " + favoriteLanguage + "</p>");
		out.write("<br>");
		out.write("<p>Your hometown is " + homeTown + "</p>");

		//http://localhost:8080/SimpleProject/Home?firstName=Adel&lastName=Cabrera&favoriteLanguage=Dart&homeTown=Berlin

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
