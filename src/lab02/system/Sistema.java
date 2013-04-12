package lab02.system;

import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.SelectableDataModel; 
public class Sistema implements SelectableDataModel<String> {
	private List<String> allTexts ;
	
	public List<String> getAllTexts() {
		if (allTexts == null )allTexts = new ArrayList<String>();
		
		return allTexts;
	}
	public void setAllTexts(List<String> allTexts) {
		this.allTexts = allTexts;
	}
	
	public void addText(String texto){
		if (texto	== null) return;
		if (texto.equals("")) return;
		getAllTexts();
		this.allTexts.add(texto);
	}
	@Override
	public String getRowData(String arg0) {
		
		return arg0;
	}
	@Override
	public Object getRowKey(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
	
}
