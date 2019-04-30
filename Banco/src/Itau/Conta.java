package Itau;

public class Conta {

	String nome;
	int numeroConta;
	String agencia;
	double saldo;
	Data dataDeAbertura;

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

	String recuperarDadosImpresso() {
		String recuperarDadosImpresso = "Nome " + this.nome;
		recuperarDadosImpresso += " \nnumero da conta " + this.numeroConta;
		recuperarDadosImpresso += " \nAgencia " + agencia;
		recuperarDadosImpresso += " \nSaldo " + saldo;
		recuperarDadosImpresso += " \nData de abertura da conta " + this.dataDeAbertura.dia + " Dia " 
		  + " mes " + this.dataDeAbertura.mes +  " ano " + this.dataDeAbertura.ano;
		return recuperarDadosImpresso;
	}

	void dataDeAbertura(int dia, int mes, int ano) {
		this.dataDeAbertura = new Data();
		this.dataDeAbertura.dia = dia;
		this.dataDeAbertura.mes = mes;
		this.dataDeAbertura.ano = ano;
		
	}

}