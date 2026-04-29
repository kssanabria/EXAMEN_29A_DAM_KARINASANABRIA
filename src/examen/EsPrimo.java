package examen;

import java.util.Scanner;

public class EsPrimo {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Buenos días, soy Karina Sanabria");
		System.out.println("Introduce un número para averiguar si es primo o no entre 1 y 10");
		int numero = Integer.parseInt(ent.nextLine().trim());
		
		switch(numero) {
		case 4, 6, 8, 9, 10 -> System.out.println("No es primo");
		case 1, 2, 3, 5, 7 ->System.out.println("Es primo");
		default -> System.out.println("Opción no es válida");
		}
		
	}

}
