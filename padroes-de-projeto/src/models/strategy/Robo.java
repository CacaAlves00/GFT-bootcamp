package models.strategy;

public class Robo {

	public Comportamento strategy;
	
	public void setComportamento(Comportamento comportamento) {
		strategy = comportamento;
	}
	
	public void mover() {
		strategy.mover();
	}
}
