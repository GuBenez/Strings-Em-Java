package br.com.fiap.exerc;

/* Considere a string "Bananada" e combine as instruções de manipulação de String
 * Imprimir ANA usando substr
 * Substituir BANANADA por BANDA usando substr
 * Indicar as posições de todos "A"s existentes em "BANANADA"
 */

public class Ex1 {
	public static void main(String[] args) {
		
		String nome = new String("BANANADA");
		
		String nova = nome.substring(3, 6);
		System.out.println(nova);
		
		
		String nova1 = nome.substring(0, 3);
		String nova2 =nome.substring(6, 8);
		System.out.println(nova1+nova2);
		
		int total_as = 0;
		char temp;
		for (int i = 0; i<nome.length(); i++) {
			
			temp = nome.charAt(i);
			if (temp == 'A')
				total_as++;
		}
		System.out.println("\"A\" apareceu " + total_as + " vezes no nome " + nome);
	}
	
}
