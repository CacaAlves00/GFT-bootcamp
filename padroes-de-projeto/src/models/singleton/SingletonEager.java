package models.singleton;

public class SingletonEager {

	// Instancia antes mesmo de alguém requisitar
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
	}

	public static SingletonEager getInstancia() {
		return instancia;
		
	}
	
}
