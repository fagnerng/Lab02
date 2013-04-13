package lab02.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lab02.recombinador.RecombinadorInterface;
import lab02.system.Sistema;


@ManagedBean
@SessionScoped
public class RecombinarBean implements Serializable {

	private static final long serialVersionUID = -2350631568266200986L;
	private String novoTextoRecombinado;
	private RecombinadorInterface recombinador;
	
	@PostConstruct
	public void init(){
		setNovoTextoRecombinado("");
		recombinador = Sistema.getInstance().getRecombinador();
	}
	

	public String getNovoTextoRecombinado() {
		return novoTextoRecombinado;
	}

	public void setNovoTextoRecombinado(String novoTextoRecombinado) {
		this.novoTextoRecombinado = novoTextoRecombinado;
	}
	public String enable(){
		
		return recombinador.enable();
	}
	public void addLinha(){
		
		this.novoTextoRecombinado += "\n"+ Sistema.getInstance().getRecombinador().addLinha();
		
	}
	public String salvar(){
		if (novoTextoRecombinado == null);
		else if(novoTextoRecombinado.equals(""));
		else
		{
			Sistema.getInstance().addText(novoTextoRecombinado);
			novoTextoRecombinado = "";
		}
		return "index.xhtml";
	}
	public String[] getTexto(){

		return novoTextoRecombinado.split("\n");
	}
}
