<%@page import="com.codingdojo.web.models.Team"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<title>Team</title>
</head>
<body>
	<div class="container">
		<%
		Team teamId = Team.getTeams().get(Integer.parseInt(request.getParameter("id")));
		%>
		<div class="row">
			<div class="col-11">
				<h2>
					<c:out value="${teamId.getTeamName}"></c:out>
				</h2>
			</div>
			<div class="col-1">
				<a href="/26TeamRoster/NewPlayer?id=<%=request.getParameter("id")%>">New
					Player</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table>
					<thead>
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Age</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${Team.getPlayers()}" var="i">
							<tr>
								<td><c:out value="${i.getFirstName}" /></td>
								<td><c:out value="${i.getLastName}" /></td>
								<td><c:out value="${i.getAge}" /></td>
								<td></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>

