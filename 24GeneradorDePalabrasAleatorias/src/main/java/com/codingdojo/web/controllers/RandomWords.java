package com.codingdojo.web.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/RandomWords")
public class RandomWords extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RandomWords() {
        super();
        
    }
    
    
    //METODO PARA GENERAR PALABRAS RANDOM 
    public String generate() {
    	String[] randString = new String[10];
    	for (int i = 0 ; i < 10; i++) {
    		int rand = (int)(Math.random()*(122-97))+1+97;
    		randString[i] = Character.toString((char) rand);
    	}
    	String finalString = String.join("", randString);
		return finalString;
    	
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
    	Integer numberClick = (Integer) session.getAttribute("numberClick");

  
    	if (numberClick == null) {
    		session.setAttribute("numberClick",0);
    	}
    	else {
    		numberClick ++;
    		session.setAttribute("numberClick", numberClick);
    	}

    	session.setAttribute("createdAt", new Date());
    	session.setAttribute("randomWord", generate());
    	
    	RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/randomWords.jsp");
    	view.forward(request, response);
    }

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
