package lab02.bean;

import java.io.Serializable;

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
	private Sistema sistema;
	
	public RecombinarBean(){
		setNovoTextoRecombinado("");
		this.sistema = Sistema.getInstace();
		
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
		if (recombinador == null) recombinador = sistema.getRecombinador();
		System.out.println(recombinador);
		this.novoTextoRecombinado += "\n"+ recombinador.addLinha();
		
	}
	
	public String[] getTexto(){

		return novoTextoRecombinado.split("\n");
	}
}
