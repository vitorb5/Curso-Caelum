package Itau;

public class Magica {
	public static void main(String[] args) {
		Conta c1 = new Conta();

		c1.nome = "Vitor";
		c1.numeroConta = 123456789;
		c1.agencia = 12345;
		c1.saldo = 2500.12;
		c1.dataAbertura = "04/06/2015";
		
		c1.deposita(100);
		System.out.println("Saldo atual " + c1.saldo);
		System.out.println("O rendimento mensal é " + c1.calculoRendimentoMensal());

	}

}
