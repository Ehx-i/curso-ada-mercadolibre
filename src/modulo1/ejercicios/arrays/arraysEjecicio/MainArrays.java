package modulo1.ejercicios.arrays.arraysEjecicio;

import java.util.Arrays;




public class MainArrays {

	public static void main(String[] args) {
		
		
		int[] numbers = {1, 2, 4};
		int[] numbers2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		contadorParesImpares(numbers);
		System.out.println("\t\t\t  - 2° caso -");
		contadorParesImpares(numbers2);
		
		
		
		
		

	}
	
	public static void contadorParesImpares(int[]arreglo) {
		long pares = Arrays.stream(arreglo)
				.filter(p -> p % 2 == 0)
				.count();
		
		long impares = Arrays.stream(arreglo)
				.filter(i -> i % 2 != 0)
				.count();
		
		String textPar = pares == 1 ? "par" : "pares";
		String textImpar = impares == 1 ? "impar" : "impares";
		System.out.println("------------------------------------------------------------");
		System.out.printf("\tCantidad:  %d %s\ty\t%d %s%n", pares, textPar, impares, textImpar);
		System.out.println("------------------------------------------------------------");
	}

}
