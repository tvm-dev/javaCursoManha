package javaCursoManha;

public class ClasseComMetodos {
	
	public static void main(String[] args) {
		// Instanciando a classe:
		ClasseComMetodos utilidades = new ClasseComMetodos();
		// Chamando os métodos:
		// System.out.println("A soma de 5 e 3 é: " + utilidades.soma(5, 3));
		// System.out.println("O numero 17 é par?: "+ utilidades.ehPar(17) );
		//System.out.println(" 'Java' invertida fica: " + utilidades.inverteString("Java"));
		System.out.println("Fatorial de 5 é: "+ utilidades.fatorial(5));

	}
	
	
	

	// Método 01: calcula a soma de 2 numeros:
	public int soma(int a, int b) {
		return a + b;
	}

	// Método 02: Verificar se 1 numero é par:
	public boolean ehPar(int numero) {
		return numero % 2 == 0;
	}

	// Método 03: inverter String:
	public String inverteString(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}

	// Método 04: calcula o fatorial de um número:
	public int fatorial(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
		return numero * fatorial(numero - 1);
	}

	

}
