package com.codingdojo;

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
		response.setContentType("text/html");
		
		 String firstname = request.getParameter("firstname");
		 String lastname = request.getParameter("lastname");
		 String language = request.getParameter("language");
		 String homeTown = request.getParameter("homeTown");
		 
		 if(firstname == null) {
			 firstname = "Unknown";
		 }
		 if(lastname == null) {
			 lastname = "Unknown";
		 }
		 if(language == null) {
			 language = "Unknown";
		 }
		 if(homeTown ==null) {
			 homeTown = "Unknown";
		 }
		PrintWriter write = response.getWriter();
		write.write("<h1>Welcome, "+firstname+" "+lastname+" </h1>\n" + 
				"<p>Your favorite language is: "+language+" </p>\n" + 
				"<p>Your hometown is : "+homeTown+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
