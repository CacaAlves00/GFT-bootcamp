package application;

import models.Calculadora;
import models.Cumprimento;
import models.Emprestimo;

public class Program {
	
	public static void main(String[] args) {
		System.out.println(Calculadora.dividir(5, 2));
		
		Cumprimento.cumprimentar();
		
		System.out.println(Emprestimo.calcularValorFinal(400.0f, 2));
	}
	
}
