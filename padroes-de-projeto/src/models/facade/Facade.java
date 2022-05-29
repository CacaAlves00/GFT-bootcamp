package models.facade;

import models.facade.subsistema1.CRMService;
import models.facade.subsistema2.CEPAPI;

public class Facade {

	// Criar uma interface mais simples para consumo desses serviços.
	// Fachada para integrar subsistemas.
	
	public void migrarCliente(String nome, String cep) {
		CEPAPI cepAPI = CEPAPI.getInstancia();
		
		String cidade = cepAPI.recuperarCidade(cep);
		String estado = cepAPI.recuperarEstado(cep);
		
		CRMService.gravarCliente(nome, cep, cidade, estado);
	}
}
