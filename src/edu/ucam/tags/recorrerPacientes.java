package edu.ucam.tags;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

import edu.ucam.pojo.Pacient;

public class recorrerPacientes extends BodyTagSupport {

	private static final long serialVersionUID = 1L;

	int veces = 0;
	BodyContent bc;
	Pacient pacient;
	ArrayList<Pacient> list;
	int sizeList;

	public void setVeces(int veces) {
		this.veces = veces;
	}

//	public void setBodyContent(BodyContent bc) {
//		this.bc = bc;
//	}

	public int doStartTag() throws JspException {

		pacient = new Pacient(0, id, id, id, null);
		list = new ArrayList<Pacient>();
		list.add(new Pacient(1, "Carlos", "Alonso", "martín"));
		list.add(new Pacient(2, "Raquel", "Vazquez", "Campá"));
		list.add(new Pacient(3, "Maria", "Alonso", "Ruiz"));
		list.add(new Pacient(4, "Pepe", "Gutierrez", "Ramirez"));
		sizeList = list.size();

		sizeList--;

		pageContext.setAttribute("id", list.get(sizeList).getIdPaciente());
		pageContext.setAttribute("nombre", list.get(sizeList).getNombre());
		pageContext.setAttribute("pApellido", list.get(sizeList).getPrimerApellido());
		pageContext.setAttribute("sApellido", list.get(sizeList).getSegundoApellido());
		System.out.println(list.get(sizeList).getIdPaciente());
//		sizeList--;

		return EVAL_PAGE;
	}



	public int doAfterBody() throws JspException {
		sizeList--;
	
		if (sizeList > -1) {
			try {
				
				System.out.println(list.get(sizeList).getIdPaciente());
				pageContext.setAttribute("id", list.get(sizeList).getIdPaciente());
				pageContext.setAttribute("nombre", list.get(sizeList).getNombre());
				pageContext.setAttribute("pApellido", list.get(sizeList).getPrimerApellido());
				pageContext.setAttribute("sApellido", list.get(sizeList).getSegundoApellido());
				
				bc =getBodyContent();
				JspWriter out = bc.getEnclosingWriter();
				String cad= bc.getString();
			
				out.println(cad);
				
				bc.clearBody();

			} catch (Exception e) {
				System.out.println("Error en Tag Bucle " + e.getMessage());
			}
			return EVAL_BODY_AGAIN;
		} else {
			JspWriter out = bc.getEnclosingWriter();
			try {
				out.println(bc.getString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//bc.clearBody();

			return SKIP_BODY;
		}
	}

}