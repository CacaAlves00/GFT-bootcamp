package models;

public class Emprestimo {

	public static float calcularValorFinal(float valor, int parcelas) {
		float taxa;
		
		if (parcelas == 2) 
			taxa = 0.4f;
		else if (parcelas == 3)
			taxa = 0.5f;
		else
			taxa = 0.6f;
			
		return (valor + (valor * taxa));
	}
	
}
