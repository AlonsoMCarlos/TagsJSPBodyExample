package edu.ucam.tags;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

import edu.ucam.pojo.Pacient;

public class recorrerPacientes2 extends BodyTagSupport {

	private static final long serialVersionUID = 1L;

	int veces = 0;
	int count =0;
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



		return EVAL_PAGE;
	}



	public int doAfterBody() throws JspException {
		
	
		if (count < sizeList) {
			try {
				
				
				bc =getBodyContent();
				JspWriter out = bc.getEnclosingWriter();
				String cad= bc.getString();
				
			
				cad = cad.replaceAll("<ID/>", Integer.toString(list.get(count).getIdPaciente()));
				cad = cad.replaceAll("<NOMBRE/>", list.get(count).getNombre());
				cad = cad.replaceAll("<PAPELLIDO/>", list.get(count).getPrimerApellido());
				cad = cad.replaceAll("<SAPELLIDO/>", list.get(count).getSegundoApellido());
				
			
				
				out.println(list.get(count).getIdPaciente()+cad);
				out.flush();
				bc.clearBody();

			} catch (Exception e) {
				System.out.println("Error en Tag Bucle " + e.getMessage());
			}
			count++;
			return EVAL_BODY_AGAIN;
		} else {
		

			return SKIP_BODY;
		}
	}

}