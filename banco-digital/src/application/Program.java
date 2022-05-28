package application;

import models.Banco;
import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Program {
	
	public static void main(String[] args) {
		Banco banco = new Banco("Banco do Brazil");
		
		Cliente c1 = new Cliente("José");
		banco.adicionarCliente(c1);
		Conta cc = new ContaCorrente(banco);
		c1.adicionarConta(cc);
		
		cc.depositar(1000);
		
		Cliente c2 = new Cliente("Maria");
		banco.adicionarCliente(c2);
		Conta cp = new ContaPoupanca(banco);
		c2.adicionarConta(cp);
		
		cc.transferir(600, cp);
		
		banco.listarClientes();
		
	}
	
}
