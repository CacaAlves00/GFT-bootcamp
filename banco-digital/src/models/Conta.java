package models;

public abstract class Conta {
	
	protected static final int AGENCIA_PADRAO = 001;
	
	protected int agencia;
	
	protected int numero;
	
	protected double saldo;
	
	protected Banco banco;
	
	public Conta(Banco banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void exibirExtrato() {
		System.out.println("Agência: " + agencia);
		System.out.println("Número: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("-----------------");
	}
}
