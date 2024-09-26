package javaCursoManha;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		String texto = "Bem Vindo ao curso dÊ JAVA";
		String texto2 = "Vamos aprender sobre STRING.";
		
		//1.Comprimento da string:
		String nome = "Thiago Viana de Menezes";
System.out.println("Comprimento da String: "+nome.length());

	//2.Concatenar Strings:
		String textoCompleto = texto + " "+ texto2;
		System.out.println("Texto completo: " + textoCompleto);
//		String nome2 = "Thiago";
//		String sobreNome = "Viana";
//		System.out.println(nome2 + sobreNome);
		
		//3. Converter para MAIÚSCULAS E minúsculas:
		System.out.println("MAIÚSCULAS: "+ texto.toUpperCase());
		System.out.println("minúsculas: "+ texto.toLowerCase());
		
		//4.Substituir uma parte da String:
		String novoTexto = texto.replace("Bem", "Vitória");
		System.out.println("Texto após substituição: " + novoTexto);
		
		//5.Buscar por uma substring:
		int posicao = texto.indexOf("curso");
		System.out.println("Posição da palavra 'curso': "+ posicao);
		
		
		//6.Verificar se uma string começa ou termina com 1 substring:
		System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));
		System.out.println("Termina com 'Java' " + texto.endsWith("JAVA"));
		
		
		//7.Dividir String:
		String[] palavras = textoCompleto.split(" ");
		System.out.println("Palavras no texto completo:");
			for ( String palavra : palavras ) {
				System.out.println(palavra);
			}
			
		//8.Remover	espaços em branco:
			String textoComEspacos = "     Texto com espaços     ";
	System.out.println("Texto sem espaços: '"+ textoComEspacos.trim() + "'");

	}

}
