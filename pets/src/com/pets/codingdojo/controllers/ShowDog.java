package com.pets.codingdojo.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pets.codingdojo.models.Dog;
import com.pets.codingdojo.models.Pet;

/**
 * Servlet implementation class Dog
 */
@WebServlet("/dog")
public class ShowDog extends HttpServlet implements Pet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
        double weight = Double.parseDouble(request.getParameter("weight"));
        
        Dog dog = new Dog(name,breed,weight);
        request.setAttribute("dog", dog);
        RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/showDog.jsp");
        req.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public String showAffection() {
		// TODO Auto-generated method stub
		return null;
	}

}
