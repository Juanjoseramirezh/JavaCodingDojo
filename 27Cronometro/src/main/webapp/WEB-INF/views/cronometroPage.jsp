<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.concurrent.TimeUnit"%>
<%@ page import="com.codingdojo.web.models.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">




<title>Temporizador</title>
</head>
<body>
	<div class="container">

		<%
		Calendar cal = Calendar.getInstance();
		%>
		<%
		Calendar cal2 = Calendar.getInstance();
		%>
		<%
		ArrayList<Timer> times = (ArrayList<Timer>) request.getSession().getAttribute("times");
		%>
		<%
		cal2.setTime((Date) request.getSession().getAttribute("tiempoActual"));
		%>
		<%
		if (request.getSession().getAttribute("starTime") != null) {
		%>
		<%
		cal.setTime((Date) request.getSession().getAttribute("starTime"));
		%>
		<p>
			Start:
			<c:out value="${cal.get(Calendar.HOUR) }"></c:out>
			:
			<c:out value="${cal.get(Calendar.MINUTE) }"></c:out>
			:
			<c:out value="${cal.get(Calendar.SECOND) }"></c:out>
		</p>
		<p>
			Actual:
			<c:out value="${cal2.get(Calendar.HOUR) }"></c:out>
			:
			<c:out value="${cal2.get(Calendar.MINUTE) }"></c:out>
			:
			<c:out value="${cal2.get(Calendar.SECOND) }"></c:out>
		</p>
		<p>
			Total Time:
			<c:out value="${Timer.getDiferencia}"></c:out>
		</p>
		<%
		}
		%>
		<div class="row">
			<div class="col-4">
				<a href="/27Cronometro/Cronometro?action=star">Star</a>
			</div>
			<div class="col-4">
				<a href="/27Cronometro/Cronometro?action=stop">Stop</a>
			</div>
			<div class="col-4">
				<a href="/27Cronometro/Cronometro?action=reset">Reset</a>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<table>
					<thead>
						<tr>
							<th>Star</th>
						</tr>
						<tr>
							<th>Stop</th>
						</tr>
						<tr>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${Timer()}" var="i">
							<tr>
								<td><c:out value="${i.getStar}" /></td>
								<td><c:out value="${i.getStop}" /></td>
								<td><c:out value="${i.getDiferencia}" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>
</body>
</html>