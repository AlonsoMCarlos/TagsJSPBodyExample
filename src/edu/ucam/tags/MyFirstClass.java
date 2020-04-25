package edu.ucam.tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MyFirstClass extends BodyTagSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String paco = "";

	public void setName(String name){
		this.paco = name;
	}
	
	public int doStartTag() throws JspException {
		try {
			this.pageContext.getOut()
				.println("<header class=\"header\">\r\n" + 
						"		\r\n" + 
						"		\r\n" + 
						"			<div class=\"header\">\r\n" + 
						"				<div id = acciones>\r\n" + 
						"					<a href=\""+this.paco+"\" class=\"header__logout\">LOGOUT</a>\r\n" + 
						"				</div>	\r\n" + 
						"				<div id=titulo>\r\n" + 
						"					<h2>MENU HOSPITAL</h2>\r\n" + 
						"				</div>\r\n" + 
						"				<div id=nameuser>\r\n" + 
						"					<h3 class= \"header__username\">"+this.paco +"</h3>\r\n" + 
						"				</div>		\r\n" + 
						"			</div>\r\n" + 
						"		\r\n" + 
						"		\r\n" + 
						"		</header>\r\n" + 
						"	\r\n" + 
						"		<nav class=\"navbar\">\r\n" + 
						"			<ul class= \"menu-hospital\">\r\n" + 
						"				<% \r\n" + 
						"				if(request.getSession().getAttribute(\"ROL\")!=null) \r\n" + 
						"					if (request.getSession().getAttribute(\"ROL\").equals(\"admin\")){ %>\r\n" + 
						"				<li>Usuarios\r\n" + 
						"					<ul class=\"menu-hospital__sublist\">\r\n" + 
						"						<li><a class=\"menu-hospital__link\" href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.FORM_ADD_USER%>\">Añadir Usuario</a></li>\r\n" + 
						"						<li><a class=\"menu-hospital__link\"  href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.LIST_USERS%>\">Listar Usuarios</a></li>\r\n" + 
						"						<li><a class=\"menu-hospital__link\"  href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.FORM_SEARCH_USER%>\">Buscar Usuario</a></li>\r\n" + 
						"					</ul>\r\n" + 
						"				</li>\r\n" + 
						"				<%}%>\r\n" + 
						"				<li>Pacientes\r\n" + 
						"					<ul class=\"menu-hospital__sublist\">\r\n" + 
						"						<li><a class=\"menu-hospital__link\"  href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.FORM_ADD_PACIENTE%>\">Alta Paciente</a></li>\r\n" + 
						"						<li><a class=\"menu-hospital__link\"  href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.LIST_PACIENTES%>\">Listar Pacientes</a></li>\r\n" + 
						"						<li><a class=\"menu-hospital__link\"  href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.FORM_SEARCH_PACIENTE%>\">Buscar Paciente</a></li>\r\n" + 
						"					</ul>\r\n" + 
						"				</li>\r\n" + 
						"				<li>Expedientes\r\n" + 
						"					<ul class=\"menu-hospital__sublist\">\r\n" + 
						"						<li><a class=\"menu-hospital__link\"  href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.FORM_ADD_MEDICAL_RECORD%>\">Alta Expediente</a></li>\r\n" + 
						"						<li><a class=\"menu-hospital__link\"  href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.LIST_MEDICAL_RECORD%>\">Listar Expedientes</a></li>\r\n" + 
						"						<li><a class=\"menu-hospital__link\" href=\"<%= request.getContextPath()%>/control?idaction=<%=Control.FORM_SEARCH_MEDICAL_RECORD%>\">Buscar Expediente</a></li>\r\n" + 
						"									\r\n" + 
						"					</ul>\r\n" + 
						"				</li>\r\n" + 
						"				<li>Medicos</li>\r\n" + 
						"				<li>Tratamientos</li>\r\n" + 
						"			</ul>\r\n" + 
						"		</nav>");
			
		} catch (IOException e){
			System.out
				.println("Se ha producido una excepci�n: " 
						+ e.getMessage());
		}
		return BodyTagSupport.EVAL_PAGE;
	}
}

