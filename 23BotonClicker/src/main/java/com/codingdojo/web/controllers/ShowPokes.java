package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShowPokes")
public class ShowPokes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowPokes() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Integer poke = (Integer) session.getAttribute("poke");
		
		if ( poke == null) {
			session.setAttribute("poke", 0);
			
		}else {
			poke++;
			session.setAttribute("poke", poke);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/contador.jsp");
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
