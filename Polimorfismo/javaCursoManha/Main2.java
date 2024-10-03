package javaCursoManha;

public class Main2 {

	public static void main(String[] args) {
		// Criação de uma conta com saldo inicial de R$ 1000,00
		ContaBancaria conta = new ContaBancaria(5000);
		
		// exibir o saldo inicial:
		System.out.println("Saldo Inicial: R$ " + conta.getSaldo());

		// Realizando um depósito de R$ 500,00:
		conta.sacar(1);
		System.out.println("Saldo: R$ " + conta.getSaldo());
		//Realizando novo depósito:
		conta.depositar(2);
		System.out.println("Saldo: R$ " + conta.getSaldo());

	}
}
