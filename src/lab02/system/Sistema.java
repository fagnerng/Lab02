package lab02.system;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.faces.model.ListDataModel;

public class Sistema extends ListDataModel<String> implements Serializable {

	private static final long serialVersionUID = 7976411472730219629L;
	private Map<String, String> allTexts;
	private static Sistema sistema;
	
	private Sistema(){
		allTexts = new HashMap<String, String>();
	}
	public Set<String> getAllTexts() {
		
		return allTexts.keySet();
	}

	public void addText(String texto) {
		if (texto == null)
			return;
		if (texto.equals(""))
			return;
		getAllTexts();
		this.allTexts.put(texto.hashCode() + "", texto);
	}
	
	static public Sistema getInstace(){
		if (sistema == null) sistema = new Sistema();
		return sistema;
		
	}
	
	public Map <String, String>getAllTextos(){
		return this.allTexts;
	}
	

}
