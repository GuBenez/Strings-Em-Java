package br.com.fiap.modulo6;

public class AvaliarStrings {
	public static void main(String[] args) {
		
		String facu = "FIAP – A melhor faculdade de tecnologia.";
		
		//STARTSWITH
		if (facu.startsWith("FIAP")){
		  System.out.println("A String começa com FIAP.");  //será verdade
		}else{
		  System.out.println("A String não começa com FIAP.");
		}
		
		//ENDS
		String facul = "FIAP – A melhor faculdade de tecnologia.";

		if (facul.endsWith("gia.")){
		  System.out.println("A String termina com gia.");  //será verdade
		}else{
		  System.out.println("A String não termina com gia.");
		}
		
		//LENGTH
		String faculd = "FIAP – A melhor faculdade de tecnologia.";

		int caracteres = faculd.length();
		System.out.println("A string possui " + caracteres + " caracteres.");
		
		
		//CHARAT
		String faculda = "FIAP – A melhor faculdade de tecnologia.";

		char caracter = faculda.charAt(1);
		System.out.println("O segundo caracter da string é " + caracter);
		
		
		String faculdad = "FIAP -  A Melhor Faculdade de Tecnologia";
		String nova = faculdad.substring(16, 26);
		System.out.println("A nova string é: " + nova);
		
		//UPPER
		String faculdade = "FIAP - A melhor faculdade de tecnologia";
		String nova5 = faculdade.toUpperCase();
		System.out.println("A nova string é: " + nova5);
		
		//Lower
		String facu1 = "FIAP – A Melhor Faculdade de Tecnologia";
		String nova6 = facu1.toLowerCase();
		System.out.println("A nova string é: " + nova6);
		
		//split
		String facu2 = "FIAP – A Melhor Faculdade de Tecnologia";
		String[] palavras = facu2.split(" ");
		for (String p : palavras) {
		    System.out.println(p);
		}
		
		String disciplinas = "LTP; Web; Algoritmos; Banco de Dados";
		String[] dis = disciplinas.split(";");
		for (String d : dis) {
		    System.out.println(d); //usei o ; para delimitar a separação 
		}
	}
	
	
	
}
