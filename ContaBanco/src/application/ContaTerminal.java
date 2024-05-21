package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o número da conta:");
		Integer numeroDaConta = sc.nextInt();
		sc.nextLine();

		System.out.println("Digite o número da agência:");
		String numeroDaAgencia = sc.nextLine();

		System.out.println("Digite o nome do cliente:");
		String nomeDoCliente = sc.nextLine();

		System.out.println("Digite seu saldo " + nomeDoCliente + ":");
		Double saldoDoCliente = sc.nextDouble();

		System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, " + "sua agência é "
				+ numeroDaAgencia + ", conta " + numeroDaConta + " e seu saldo " + saldoDoCliente
				+ " já está disponível para saque.");
		sc.close();

	}

}
