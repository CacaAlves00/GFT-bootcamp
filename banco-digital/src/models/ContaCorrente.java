package models;

public class ContaCorrente extends Conta  {

	public static int SEQUENCIAL = 0;
	
	public ContaCorrente(Banco banco) {
		super(banco);
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
	
	@Override
	public void exibirExtrato() {
		System.out.println("Conta Corrente");
		super.exibirExtrato();
	}
	
}
