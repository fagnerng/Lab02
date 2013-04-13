package lab02.util;

import java.util.List;


public class Util {
	
	
	public static String getSmallTitle(String text, int maxNum){
		String temp = text;
		temp.replace("\n", " ");
		String[] tempArray = temp.split(" ");
		if (tempArray.length > maxNum) {
			temp  = tempArray[0];
			for(int  i = 1 ;i<maxNum; i++){
				temp += " " + tempArray[i];
			}
		}
		return temp;
	}
	
	public static int random(int maxValue){
		
		return (int) Math.ceil( ( Math.random() * maxValue ));
		
	}
	
	public static String listToString(List<String> lista){
		String temp = "";
		for (String string : lista) {
			temp += string +" ";	
		}
		return temp;
	}
}
