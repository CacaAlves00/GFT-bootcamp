package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	
	private List<Cliente> clientes;
	
	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<Cliente>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void listarClientes() {
		for (Cliente cliente : clientes) {
			System.out.println("Contas do banco " + this.nome + 
					" pertencentes ao cliente " + cliente.getNome());
			
			for (Conta conta : cliente.getContas()) {
				conta.exibirExtrato();
			}
			
		}
		
	}
	
}
