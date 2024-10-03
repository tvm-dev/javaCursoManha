package javaCursoManha;

public class ArraySimples {

	public static void main(String[] args) {
		//Criando um Array de supermercado(lista de compras):
		String[] mercado = {"Arroz", "Açúcar", "Danone", "Café", "Leite"};
		
		//Exibindo apenas o terceiro item da lista:
		//System.out.println("Item Selecionado: "+ mercado[1]);//Danone!
		//Todo array começa com ZERO!
		
		//Exibindo todos os itens do Array:
		
		//Lendo a linha "item < mercado.length": Enquanto item for menor do que o comprimento de itens do array, faça algo!
		
		for ( int item = 0; item < mercado.length; item++ ) {
			System.out.println(mercado[item]);
		}	
	}
}
