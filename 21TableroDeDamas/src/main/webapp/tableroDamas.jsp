<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
* {
	margin: 0;
	padding: 0;
	text-align: center;
}

.color1 {
	display: inline-block;
	width: 1em;
	height: 1em;
	background-color: purple;
}

.color2 {
	display: inline-block;
	background-color: blue;
	width: 1em;
	height: 1em;
}
</style>
<title>Tablero Damas</title>
</head>
<body>

	<div class=container>
		<%
		int width = 0;
		int heigth = 0;
		
		if (request.getParameter("width") != null){
			width = Integer.parseInt(request.getParameter("width"));
		}
		if (request.getParameter("heigth") != null){
			heigth = Integer.parseInt(request.getParameter("heigth"));
		}
		%>



		<h1>
			Checkboard:
			<%=width%>w X
			<%=heigth%>h
		</h1>
		<table>

			<%
			for (int j = 0; j < heigth; j++) {
			%>

			<tr>
				<!-- FILAS -->
				<%
				for (int i = 0; i < width; i++) {
				%>
				<td class="color1"></td>
				<!-- COLUMNAS POR CADA FILA (WIDTH) -->
				<td class="color2"></td>
				<%
				}
				%>
			</tr>
			<%}%>
		</table>

	</div>

</body>
</html>