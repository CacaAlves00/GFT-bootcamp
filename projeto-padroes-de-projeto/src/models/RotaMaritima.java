package models;

public class RotaMaritima implements RotaStrategy {

	@Override
	public void rotacionar(String rotaA, String rotaB) {
		System.out.println("Rota marítima entre " + rotaA + " e " + rotaB);
	}

}
