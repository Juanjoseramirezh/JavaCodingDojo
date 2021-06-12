package com.codingdojo.web.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Team;


@WebServlet("/NewTeam")
public class NewTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public NewTeam() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/newTeamPage.jsp");		
		view.forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("nameTeam") != null) {
			Team.addTeam(request.getParameter("nameTeam"));
			response.sendRedirect("/26TeamRoster/Home");
		}
		
		else {
			doGet(request, response);
		}
		
		
	}

}
