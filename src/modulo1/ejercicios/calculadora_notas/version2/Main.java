package modulo1.ejercicios.calculadora_notas.version2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static Estado evaluar(double promedio, double asistencia) {

		if (asistencia < 75) {
			return Estado.REPROBADO_POR_ASISTENCIA;
		}

		return (promedio >= 3.0) ? Estado.APROBADO : Estado.REPROBADO;
	}

	public static void imprimirResultado(Estado estado, double promedio) {

		String clasificacion = (promedio >= 4.5) ? "Excelente" : (promedio >= 3.5 ? "Bueno" : "Regular");

		switch (estado) {

		case APROBADO:
			System.out.println("Resultado final: APROBADO");
			System.out.println("Clasificación: " + clasificacion);
			break;

		case REPROBADO:
			System.out.println("Resultado final: REPROBADO POR NOTA");
			break;

		case REPROBADO_POR_ASISTENCIA:
			System.out.println("Resultado final: REPROBADO POR ASISTENCIA");
			break;
		}
	}

	public static void main(String[] args) {

		Scanner entradaTeclado = new Scanner(System.in);
		
		double notas[] = new double[3];

		System.out.print("Escribe la nota 1: ");
		notas[0]  = entradaTeclado.nextDouble();

		System.out.print("Escribe la nota 2: ");
		notas[1]  = entradaTeclado.nextDouble();

		System.out.print("Escribe la nota 3: ");
		notas[2] = entradaTeclado.nextDouble();

		System.out.print("Por favor, escribe el porcentaje (%) de asistencia: ");
		double asistencia = entradaTeclado.nextDouble();
		System.out.println("\nCantidad de notas ingresadas: " + notas.length);
		double promedio = (notas[0] +notas[1]  + notas[2]) / notas.length;
		System.out.println("Notas ingresadas: " + Arrays.toString(notas));

		System.out.printf("%nPromedio -> %.2f%n", promedio);
		System.out.println("Asistencia -> " + asistencia + "%");

		Estado estado = evaluar(promedio, asistencia);

		System.out.println("\n\t=== RESULTADO ===");
		imprimirResultado(estado, promedio);

		entradaTeclado.close();
	}
}