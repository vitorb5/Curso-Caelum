package Itau;

public class Magica {


	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Data data = new Data();

		c1.nome = "Vitor";
		c1.numeroConta = 123456789;
		c1.agencia = "12345-0";
		c1.saldo = 2500.12;
		c1.dataDeAbertura = data; 
		/*
		 * c1.deposita(100); c1.saca(1000.100); c1.deposita(5000);
		 * //System.out.println("A conto do " + c1.nome + " agência " +
		 * c1.agencia + //" tem um saldo atual de " + c1.saldo +
		 * " e o rendimento mensal é " + c1.calculoRendimentoMensal());
		 */
		c2.nome = "Carol";
		c2.numeroConta = 125451;
		c2.agencia = "124510-10";
		c2.saldo = 0.0;
		/*
		 * c2.saca(100); c2.deposita(1000.100);
		 * //System.out.println("A conta da " + c2.nome + " agÊncia " +
		 * c2.agencia + // " tem um saldo atual de " + c2.saldo +
		 * " e o rendimento mensal é " + c2.calculoRendimentoMensal());
		 */
		 System.out.println(c1.recuperarDadosImpresso());
/*
		Conta c3 = new Conta();

		c3.nome = "Dani";
		c3.agencia = "1234-5";

		Conta c4 = new Conta();
		c4.nome = "Dani";
		c4.agencia = "1234-5";
		
		if (c3.equals(c4)) {
			System.out.println("Igual");

		} else {
			System.out.println("Diferente");
		
		System.out.println(c1.dataDeAbertura);
		}*/
	}

}
