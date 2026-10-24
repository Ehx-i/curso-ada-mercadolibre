package modulo1.ejercicios.ciclos.adivinanza;


import java.util.Scanner;

public class MainAdivinanza {
	

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String otra;

	        do {
	            int secreto = (int) (Math.random() * 100) + 1;
	            int intentos = 0;
	            int intento;

	            System.out.println("Adivina el número entre 1 y 100");

	            do {
	                System.out.print("Tu intento: ");
	                intento = sc.nextInt();
	                intentos++;

	                int distancia = Math.abs(intento - secreto);

	                if (intento != secreto) {
	                    if (distancia > 20) {
	                        System.out.println("Muy lejos");
	                    } else if (distancia <= 10) {
	                        System.out.println("Caliente");
	                    } else if (intento < secreto) {
	                        System.out.println("Más alto");
	                    } else {
	                        System.out.println("Más bajo");
	                    }
	                }

	            } while (intento != secreto);

	            if (intentos <= 3) {
	                System.out.println("¡Eres un Crack! (" + intentos + " intentos)");
	            } else if (intentos <= 7) {
	                System.out.println("Bien hecho (" + intentos + " intentos)");
	            } else {
	                System.out.println("Por fin lo lograste (" + intentos + " intentos)");
	            }

	            System.out.print(" Hey! ¿Quieres jugar otra vez? (s/n): ");
	            otra = sc.next();

	        } while (otra.equalsIgnoreCase("s"));

	        sc.close();
	    
	}

}
