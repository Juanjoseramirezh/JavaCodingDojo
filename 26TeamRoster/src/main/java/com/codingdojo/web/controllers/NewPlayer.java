package com.codingdojo.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Team;


@WebServlet("/NewPlayer")
public class NewPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewPlayer() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ACA LA REDIRECCION DE NEW PLAYER
		
		
		if(request.getParameter("delete") != null) {
			Team.getTeams().get(Integer.parseInt(request.getParameter("teamId"))).getPlayers().remove(Integer.parseInt(request.getParameter("playerId")));
			response.sendRedirect("/26TeamRoster/Home");
		}
		else {
			request.getRequestDispatcher("/WEB-INF/views/newPlayerPage.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
