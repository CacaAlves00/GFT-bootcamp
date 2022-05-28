package models;

public class ContaPoupanca extends Conta {
	
	public static int SEQUENCIAL = 0;
	
	public ContaPoupanca(Banco banco) {
		super(banco);
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
	
	@Override
	public void exibirExtrato() {
		System.out.println("Conta Poupança");
		super.exibirExtrato();
	}
	
}
