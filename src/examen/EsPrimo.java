package examen;

import java.util.Scanner;

public class EsPrimo {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Buenos días, soy Karina Sanabria");
		System.out.println("Introduce un número para averiguar si es primo o no entre 1 y 10");
		int numero = Integer.parseInt(ent.nextLine().trim());
		String numeroPrimo = null;
		//Ver si número es primo
		switch(numero) {
		case 4, 6, 8, 9, 10 -> numeroPrimo ="No es primo";
		case 1, 2, 3, 5, 7 -> numeroPrimo="Es primo";
		default -> System.out.println("Opción no es válida");
		}
		
		//Ver sus divisibles Ejemplo
		if(numeroPrimo.equalsIgnoreCase("No es primo")) {
			System.out.println("Los divisibles de 4 son: 1, 2 y 4");
		}
		
	}

}
