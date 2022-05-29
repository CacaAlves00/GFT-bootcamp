package services;

import models.RotaStrategy;

public class Roteador {

	private static RotaStrategy rotaStrategy;
	
	public static void setRotaStrategy(RotaStrategy rotaStrategy) {
		Roteador.rotaStrategy = rotaStrategy;
	}
	
	public static void roteirizar(String rotaA, String rotaB) {
		rotaStrategy.rotacionar(rotaA, rotaB);
	}
	
}
