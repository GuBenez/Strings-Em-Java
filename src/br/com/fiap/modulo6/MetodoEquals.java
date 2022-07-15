package br.com.fiap.modulo6;

public class MetodoEquals {
	public static void main(String[] args) {
		
		String nome = "FIAP";
		String nome2 = new String("FIAP");

		if (nome.equals(nome2)){
		  System.out.println("As Strings são iguais."); //será true pois ele compara o conteúdo das strings
		}else{
		  System.out.println("As Strings são diferentes.");
		}
		
		String nome3 = "FIAP";
		String nome4 = new String("FIAP");

		//será diferente pois estou usando o "!"
		if (!nome3.equals(nome4)){
		  System.out.println("As Strings são diferentes.");  
		}else{
		  System.out.println("As Strings são iguais.");
		}
		
		String nome5 = "FIAP";
		String nome6 = new String("fiap");
		
		//serão iguais pois o metodo ignora maiusculas e minusculas
		if (nome5.equalsIgnoreCase(nome6)){
		  System.out.println("As Strings são iguais.");  
		}else{
		  System.out.println("As Strings são diferentes.");
		}
	}
}
