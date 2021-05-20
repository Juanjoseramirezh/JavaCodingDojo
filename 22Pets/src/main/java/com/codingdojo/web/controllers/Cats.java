package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Cat;

@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Cats() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Crear el modelo
		Cat cat = new Cat(request.getParameter("name"), request.getParameter("breed"),
				Double.parseDouble(request.getParameter("weigth")));

		// Establecer el modelo para la vista
		request.setAttribute("cat", cat);

		// Permitir que la vista maneja la solicitud
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/cat.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
