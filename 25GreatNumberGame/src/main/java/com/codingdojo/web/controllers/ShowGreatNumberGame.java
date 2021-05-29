package com.codingdojo.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShowGreatNumberGame")
public class ShowGreatNumberGame extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowGreatNumberGame() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		Random rand = new Random();
		System.out.println("ENTRE EN GET");
		if (session.getAttribute("numberSession") == null || session.getAttribute("firstEntry") == null) {
			session.setAttribute("numberSession", rand.nextInt(10));
			session.setAttribute("firstEntry", true);
			
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		Integer numberSession = (Integer) session.getAttribute("numberSession");
		Integer numberPiker = Integer.parseInt(request.getParameter("numberPiker"));
		Random rand = new Random();

		if (session.getAttribute("numberSession") == null) {
			session.setAttribute("numberSession", rand.nextInt(10));
			session.setAttribute("firstEntry", true);
		}
		
		if (numberSession == numberPiker) {
			session.setAttribute("numberSession", rand.nextInt(10));
			session.setAttribute("respuesta", "correct");
		} else if (numberPiker > numberSession) {
			session.setAttribute("respuesta", "high");
		} else {
			session.setAttribute("respuesta", "low");
		}

		response.sendRedirect("/25GreatNumberGame/ShowGreatNumberGame");
	}

}
