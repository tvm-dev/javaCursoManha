package javaCursoManha;
import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		//Instanciando uma classe para usá-la:
		Scanner sc = new Scanner(System.in);
		
		//Entradas do usuário:
		//Pegando o capital inicial:
		System.out.println("Digite o capital: ");
		double capital = sc.nextDouble();
		
		//Pegando a taxa de juros:
		System.out.println("Qual é a taxa de juros: ");
		double taxa = sc.nextDouble();
		
		//Pegando o tempo:
		System.out.println("Digite o tempo em anos: ");
		int tempo = sc.nextInt();
		
		//Calculando os juros compostos:
double montante = capital * Math.pow(1 + (taxa/100), tempo);
//Saída final:
System.out.println("O montante final será de R$ "+ montante);
sc.close();	
	}
}