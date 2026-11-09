package modulo1.ejercicios.arrays.exception;

import java.util.Scanner;

public class MainValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner(System.in);

	        int intentos = 0;
	        boolean numeroValido = false;
	        int numero = 0;

	        while (!numeroValido && intentos < 3) {

	            System.out.print("Por favor, ingrese un número: ");
	            String entrada = sc.nextLine();

	            try {
	                numero = Integer.parseInt(entrada);
	                numeroValido = true;

	            } catch (NumberFormatException e) {
	                intentos++;

	                if (intentos < 3) {
	                    System.out.println("Ingresaste un dato / número incorrecto. Ya te quedan "
	                            + (3 - intentos) + " intentos.");
	                }
	            }
	        }

	        if (numeroValido) {
	            System.out.println("Número ingresado correctamente: " + numero);
	        } else {
	            System.out.println("Has agotado los 3 intentos. Programa finalizado.");
	        }

	      
	    
}
		
	

}
