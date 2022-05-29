package models.singleton;

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
	}

	public static SingletonLazy getInstancia() {
		// Instancia apenas quando requisitado
		if (instancia == null)
			instancia = new SingletonLazy();
			
		return instancia;
		
	}
	
}
