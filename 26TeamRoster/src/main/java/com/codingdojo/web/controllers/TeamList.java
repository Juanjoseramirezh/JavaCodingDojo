package com.codingdojo.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Team;


@WebServlet("/TeamList")
public class TeamList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TeamList() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("delete") != null) {
			Team.getTeams().remove(Integer.parseInt(request.getParameter("id")));
			response.sendRedirect("/26TeamRoster/Home");
		}
		else {
			request.getRequestDispatcher("/WEB-INF/views/teamPlayerPage.jsp");
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("id") != null) {
			Team.getTeams().get(Integer.parseInt(request.getParameter("id"))).addPlayer(request.getParameter("firstName"), request.getParameter("lastName"), Integer.parseInt(request.getParameter("age")));
			response.sendRedirect("/26TeamRoster/TeamList?id="+request.getParameter("id"));
		}
		else{
			doGet(request, response);
		}
	}

}
