package models;

import java.util.Calendar;
import java.util.Formatter;

public class Cumprimento {
	
	public static void cumprimentar() {
		Formatter formatter = new Formatter();
		Calendar calendario = Calendar.getInstance();
		formatter.format("%tH", calendario);
		
		int hora = Integer.parseInt(formatter.toString());
		
		if (hora > 5 && hora < 12) {
			System.out.println("Bom dia");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
	}
}
