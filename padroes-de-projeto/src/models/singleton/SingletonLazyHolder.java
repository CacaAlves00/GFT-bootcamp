package models.singleton;

public class SingletonLazyHolder {

	private static class InstanceHolder {		
		// só vai chamar quando for solicitado
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
	}

	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
		
	}
	
}
