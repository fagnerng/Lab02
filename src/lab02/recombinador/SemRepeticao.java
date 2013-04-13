package lab02.recombinador;

import java.util.List;

import lab02.util.Util;

public class SemRepeticao implements RecombinadorInterface {
	private List<String> listaDePalavras;
	private String disable = "false";

	
	public SemRepeticao (String texto){
		listaDePalavras = Util.stringToList(texto);
	}
	@Override
	public String disable() {
		return disable;
	}

	@Override
	public String addLinha(String Original) {
		int count = 0;
		String temp = "";
		while (count<= 12 &&  !listaDePalavras.isEmpty()){
			temp+=listaDePalavras.remove(Util.random(listaDePalavras.size()-1))+" " ;
			count++;
		}
		System.out.println(temp.length());
		if (!temp.equals("")){
			return Original + "\n" + temp;
		}
		disable = "true";
		return Original;
	}

}
