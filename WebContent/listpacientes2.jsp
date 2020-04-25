
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/taglib.tld" prefix="tag"%>

<%@ page import="java.util.Hashtable,java.util.*"%>
<%@ page import="edu.ucam.pojo.Pacient"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, user-scalable=no">
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/styleList.css">
<title>Lista Pacientes</title>
</head>
<body>

	<table>
		<tr>
			<th>PACIENTE ID</th>
			<th>NOMBRE</th>
			<th>PRIMER APELLIDO</th>
			<th>SEGUNDO APELLIDO</th>
			<th>ACCION</th>
		</tr>
		
		
		<tag:listpacientes2 veces="2">
		<tr>
		
			<td><ID/></td>
			<td><NOMBRE/></td>
			<td><PAPELLIDO/></td>
			<td><SAPELLIDO/></td>
			<td>
				<a href="<%=request.getContextPath() + "/control?idaction="%>">Editar</a>
			 	<a href="<%=request.getContextPath() + "/control?idaction="%>">Mostrar Expediente</a>
			 	<a	href="<%=request.getContextPath() + "/control?idaction=DELETE_PACIENTE&idPaciente="%>">Borrar</a>
				 <a href="<%=request.getContextPath() + "/control?idaction="%>">Añadir Expediente</a>
			 
			 </td>

		</tr>

		</tag:listpacientes2>
	
	</table>





</body>
</html>