package com.coding.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coding.models.Player;
import com.coding.models.Team;
import com.sun.media.jfxmedia.events.PlayerEvent;

/**
 * Servlet implementation class Player
 */
@WebServlet("/player")
public class ShowPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("id") == null) {
			HttpSession session = request.getSession();
			Team team = (Team) session.getAttribute("team");
			System.out.println(team.getTeam_name());
			RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/createPlayerForm.jsp");
			req.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			Team team = (Team) session.getAttribute("team");
			request.setAttribute("thisTeam", team);
			RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/showPlayer.jsp");
			req.forward(request, response);
		}
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Team team = (Team) session.getAttribute("team");
		String index =  (String) session.getAttribute("index");
		String firstName = (String) request.getParameter("first-name");
		System.out.println((String) request.getParameter("first-name"));
		String lastName = (String) request.getParameter("last-name");
		System.out.println((String) request.getParameter("last-name"));
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println((String) request.getParameter("age"));
		Player player = new Player(firstName,lastName,age);
		team.getTeam().add(player);
		response.sendRedirect("/team-roster/team?id="+index);
	}

}