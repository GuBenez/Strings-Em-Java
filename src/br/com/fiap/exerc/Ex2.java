package br.com.fiap.exerc;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a expressão: ");
		String texto = sc.next();
		
	    String palindromo = "";
	    int i;
	    System.out.print("A Palavra: " +texto);
	    palindromo = new StringBuffer(texto).reverse().toString();
	    if (texto.equals(palindromo)) {
	    System.out.println("  é palindrome");
	    } else {
	    System.out.println(" Não é Palindrome");
	    }

	}
}
	
