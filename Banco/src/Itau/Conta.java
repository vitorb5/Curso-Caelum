package Itau;

public class Conta {

	String nome;
	int numeroConta;
	int agencia;
	double saldo;
	String dataAbertura;

	void saca(double valor) {
		double saldoAtual = saldo - valor;
		this.saldo = saldoAtual;
	}

	void deposita(double valor) {
		double deposita = saldo + valor;
		this.saldo = deposita;
	}

	double calculoRendimentoMensal() {
		double calculoRendimentoMensal = saldo * 0.99;
		return calculoRendimentoMensal;
	}

}