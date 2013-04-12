package lab02.bean;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import lab02.recombinador.ComRepeticao;
import lab02.system.Sistema;

@ManagedBean
@SessionScoped
public class SelecionarBean implements Serializable {
	private List<String> selectedTextos;
	private Map<String, String> Textos;
	private static final long serialVersionUID = -4754728111177763933L;

	private Sistema sistema;

	public SelecionarBean() {
		sistema = Sistema.getInstace();
		Textos = sistema.getAllTextos();
	}

	public List<String> getSelectedTextos() {
		return selectedTextos;
	}

	public void setSelectedTextos(List<String> selectedTextos) {
		this.selectedTextos = selectedTextos;
	}

	public Map<String, String> getTextos() {
		return Textos;
	}

	public void setTextos(Map<String, String> textos) {
		Textos = textos;
	}

	public String titulo() {
		if (Textos.isEmpty())
			return "Nenhum Texto Disponivel";
		if (Textos.size() == 1)
			return "Texto Disponivel";
		return "Textos Disponiveis";
	}

	public String enable() {
		return Textos.isEmpty() ? "true" : "false";
	}
	
	public String comRepeticao() {
		sistema.setRecombinador(new ComRepeticao("Fagner Nascimento Gomes"));
		
		return paginaRecombinar();
		}
	public String semRepeticao() {return paginaRecombinar();}
	public String inversa() {return paginaRecombinar();}
	
	private String paginaRecombinar(){
		return "recombinador.xhtml";
	}
	
}
