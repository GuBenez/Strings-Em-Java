package br.com.fiap.modulo6;

public class TrabalhandoStrings {
	public static void main(String[] args) {
		
	//Preciso declarar a variável dentro de um Metodo (String)
	String nome;
	nome = new String();
	nome = "Gustavo";
	System.out.println(nome);
	
	String nome2 = new String("Maça");
	System.out.println(nome2);
	
	String nome3 = "Maça";
	System.out.println(nome3);
	
	/*dará erro porque o nome4 não foi inicializxada nem instanciada
	String nome4;
	System.out.println(nome4);*/
	
	String descricao = "Tipo Gala \nA maça mais doce do mercado";
	System.out.println(descricao);
	
	descricao = "Tipo Gala \tA maça mais doce do mercado";
	System.out.println(descricao);
	
	descricao = "Tipo Gala: \"A maça mais doce do mercado\"";
	System.out.println(descricao);
	System.out.println(descricao.length());
	
	
	//comparando Strings. Elas serão diferentes, pois usam endereço de memória diferentes
	// não posso usar os == para Strings. 
	String nome5 = new String("FIAP");
	String nome6 = new String("FIAP");

	if (nome5 == nome6){
	  System.out.println("As Strings são iguais.");
	}else{
	  System.out.println("As Strings são diferentes.");
	}
	}
}
