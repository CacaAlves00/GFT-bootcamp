package application;

import models.facade.Facade;

public class Program {

	public static void main(String[] args) {
//		Robo robo = new Robo();
//		
//		robo.setComportamento(new ComportamentoAgressivo());
//		robo.mover();
//		robo.setComportamento(new ComportamentoDefensivo());
//		robo.mover();
//		robo.setComportamento(new ComportamentoNormal());
//		robo.mover();
		
		Facade facade = new Facade();
		facade.migrarCliente("Carlos", "45120-231");
	}
	
}
