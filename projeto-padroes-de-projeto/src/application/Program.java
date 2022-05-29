package application;

import models.RotaFerroviaria;
import models.RotaMaritima;
import services.Roteador;

public class Program {

	public static void main(String[] args) {
		Roteador.setRotaStrategy(new RotaMaritima());
		Roteador.roteirizar("Rio de Janeiro", "Porto");
		
		Roteador.setRotaStrategy(new RotaFerroviaria());
		Roteador.roteirizar("Manaus", "Bogotá");
	}
	
}
