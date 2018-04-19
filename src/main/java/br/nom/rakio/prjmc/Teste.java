package br.nom.rakio.prjmc;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<String> var1, var2=new ArrayList<>();
		var1=var2;
//		var1.add("asd vr1");
		var2.add("asd vr2");
		System.out.println(var1.size());
		
		for (String string : var2) {
			System.out.println(string );
		}
		System.out.println(var2.size());
		for (String string : var1) {
			System.out.println(string );
		}
		
		String str8, drtEntrada = "S";
		str8="1";
		System.out.println(str8);
		System.out.println(drtEntrada);
		
		
		if(drtEntrada.equals("S"))
			System.out.println("1 drtEntrada.equals(\"S\")");
		
		if(drtEntrada.equals("s"))
			System.out.println("2 drtEntrada.equals(\"s\")");
		
		if(drtEntrada.equals("SSS"))
			System.out.println("3 drtEntrada.equals(\"SSS\")");

		if(drtEntrada=="S")
			System.out.println("4 drtEntrada==\"S\"");
		
		if(drtEntrada=="SSS")
			System.out.println("5 drtEntrada==\"SSS\"");
		
		///////////////////////
		 String str1 = "teste";
	        String str2 = "Oteste".substring(1);

	        System.out.println("\n\nstr1: " + str1 + ", str2: " + str2);
	        if(str1 == str2) {
	            System.out.println("6 str1 igual a str2");
	        }
	        else {
	            System.out.println("str1 diferente de str2");
	        }
	        if("teste" == str2) {
	            System.out.println("7 \"teste\" == str2");
	        }
	        if("teste" == str1) {
	            System.out.println("8 \"teste\" == str2");
	        }
	        
	        if(str1.equals("teste")) {
	            System.out.println("9 str1.equals(\"teste\"");
	        }

	        if(str2.equals("teste")) {
	            System.out.println("10 str2.equals(\"teste\"");
	        }
	}

}
