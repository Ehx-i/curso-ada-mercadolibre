package modulo1.ejercicios.calculadora.utils;

import java.util.Scanner;

public class InputCalculator {
	 private double[] numbers;

	    public double[] readNumbers() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("¿Cuántos notas deseas ingresar? ");
	        int count = sc.nextInt();

	        numbers = new double[count];
	        for (int i = 0; i < count; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numbers[i] = sc.nextDouble();
	        }
	        return numbers;
	    }
}
