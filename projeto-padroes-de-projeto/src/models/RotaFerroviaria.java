package models;

public class RotaFerroviaria implements RotaStrategy {

	@Override
	public void rotacionar(String rotaA, String rotaB) {
		System.out.println("Rota ferroviária entre " + rotaA + " e " + rotaB);
	}

}
