package javaCursoManha;
public class IfConciso {
	public static void main(String[] args) {
	//Declarando variável:
		int numero = 9;
		
		//Uso do if normal:
		/* if ( numero >= 10) {
			System.out.println("Valor maior/igual que 10");
		} else {
			System.out.println("Valor MENOR que 10");
		} */
	String resultado = (numero > 10) ? "Maior que 10":"Menor que 10";
	System.out.println("O número "+numero+ " é "+resultado);
	}
}
