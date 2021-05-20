package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Dog;

@WebServlet("/Dogs")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Dogs() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// crear el modelo
		Dog dog = new Dog(request.getParameter("name"), request.getParameter("breed"),
				Double.valueOf(request.getParameter("weigth")));

		// establecer el modelo para las visitas
		request.setAttribute("dog", dog);

		// permitir que la visita maneja la solicitud
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dog.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
