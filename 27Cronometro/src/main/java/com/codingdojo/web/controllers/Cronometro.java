package com.codingdojo.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.web.models.Timer;


@WebServlet("/Cronometro")
public class Cronometro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Cronometro() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String factor = request.getParameter("action");
		
		// CUANDO RESETEO Y PARTO DE CERO, ELIMINO LA SESSION
		if(factor != null) {
			if(factor.equals("reset")) {
				request.getSession().invalidate();
			}
		}
		
		HttpSession session = request.getSession();
		
		Date tiempoActual = new Date();
		session.setAttribute("tiempoActual", tiempoActual);
		
		if(session.getAttribute("tiempo") == null) {
			session.setAttribute("tiempo", new ArrayList<Timer>());
		}
		
		
		// MODELO 
		if(factor != null) {
			if(factor.equals("star")) {
				if(session.getAttribute("starTime")== null) {
					Date star = new Date();
					session.setAttribute("starTime", star);
				}
			}else if(factor.equals("stop")){
				if(session.getAttribute("starTime") != null) {
					
					Timer newTime = new Timer((Date) session.getAttribute("starTime"), tiempoActual);
					session.setAttribute("starTime", null);
					session.setAttribute("endTime", null);
					
					ArrayList<Timer> times = (ArrayList<Timer>) session.getAttribute("times");
					times.add(newTime);
					session.setAttribute("times", times);
				}
			}
		}
		
		if(session.getAttribute("starTime") != null) {
			long diferencia = tiempoActual.getTime() - ((Date) session.getAttribute("starTime")).getTime();
			session.setAttribute("diferencia", diferencia);
		}
		
		request.getRequestDispatcher("/WEB-INF/views/cronometroPage.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
