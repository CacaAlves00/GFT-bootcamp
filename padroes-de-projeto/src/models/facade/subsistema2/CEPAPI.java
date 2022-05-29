package models.facade.subsistema2;

public class CEPAPI {
	
	private static CEPAPI instancia = new CEPAPI();
	
	private CEPAPI() {}
	
	public static CEPAPI getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Ponta Grossa";
	}
	
	public String recuperarEstado(String cep) {
		return "PR";
	}

}
