package lab02.bean;


import java.util.Set;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import lab02.system.Sistema;

@ManagedBean(name = "main")
@ApplicationScoped
public class SistemaBean {
	private Sistema system;
	private String editableTexto;


	public SistemaBean() {
		this.system = Sistema.getInstace();
		this.editableTexto = "";
		
	}
	public String recombinar() {
		return "recombinar.xhtml";

	}

	public String addNovoTexto() {
		if (this.editableTexto == null)
			;

		else if (this.editableTexto.equals(""))
			;

		else {
			system.addText(this.editableTexto);
			this.editableTexto = "";
		}

		return "index.xhtml";
	}

	public String getEditableTexto() {
		return this.editableTexto;
	}

	public void setEditableTexto(String editableTexto) {
		this.editableTexto = editableTexto;
	}

	public Set<String> getAllTextos() {
		return system.getAllTexts();
	}



}
