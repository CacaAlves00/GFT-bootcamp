package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	
	private List<Conta> contas;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
}
