package com.sample;

public class RemoveDuplicate {
    public  static String removeDup(String str) {
		String resultString="";
		while(str.length()>0){
			if(!resultString.contains(str.substring(0, 1))) {
				resultString+=str.substring(0, 1);
				str=str.replaceAll(str.substring(0, 1), "");
							
			}
		}
		return resultString;
	}
    public static void main(String args[]) {
    System.out.println(removeDup("aaahhaaytttrrcscc"));
    }
}