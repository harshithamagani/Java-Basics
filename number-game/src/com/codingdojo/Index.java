package com.codingdojo;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Index
 */
@WebServlet("/")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("guessNum") == null) {
			int random = generateRandomNum();
			session.setAttribute("guessNum", random);
			request.setAttribute("guessNum", random);
			System.out.println(random);
		}
		RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/index.jsp");
		req.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNumber = request.getParameter("number");
		HttpSession session = request.getSession();
		session.getAttribute("guessNum");
		if(session.getAttribute("guessNum") != null) {
		if(session.getAttribute("guessNum").equals(Integer.parseInt(userNumber))) {
			System.out.println("correct");
			request.setAttribute("guessResult", "Correct");
		}
		else if((Integer)session.getAttribute("guessNum") > (Integer.parseInt(userNumber))) {
			System.out.println("tooLow");
			request.setAttribute("guessResult", "tooLow");
		}
		else if((Integer)session.getAttribute("guessNum") < (Integer.parseInt(userNumber))) {
			System.out.println("tooHight");
			request.setAttribute("guessResult", "tooHight");
		}
		}
		else {
			doGet(request, response);
		}
		doGet(request, response);
	}
	
    int generateRandomNum(){
        Random r = new Random();
        int num = r.nextInt(99) + 1; // with bounds 1 to 100
        return num;          
    }

}
