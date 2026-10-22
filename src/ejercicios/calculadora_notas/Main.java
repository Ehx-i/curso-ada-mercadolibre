package ejercicios.calculadora_notas;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaTeclado = new Scanner(System.in);

		double nota1;

		System.out.println("Escribe la nota 1: ");
		nota1 = entradaTeclado.nextDouble();

		double nota2;

		System.out.println("Escribe la nota 2: ");
		nota2 = entradaTeclado.nextDouble();

		double nota3;

		System.out.println("Escribe la nota 3: ");
		nota3 = entradaTeclado.nextDouble();
		
		System.out.print("Por favor, escribe el porcentaje (%) de asistencia (ej. 78 para --->78%): ");
        double asistencia = entradaTeclado.nextDouble();
		
		double promedio = (nota1+nota2+nota3) / 3.0;
		
		System.out.printf("%n%nPromedio ---->  %.2f%n", promedio);
		System.out.println("Asistencia: " + asistencia + "%");
		
		
		System.out.println("\n\t==EVALUANDO ASISTENCIA Y PROMEDIO==");
		boolean apruebaNota = (promedio >= 3.0);
        boolean apruebaAsistencia = (asistencia /100 >= 0.75);
        
        if (apruebaNota && apruebaAsistencia) {
            
            if (promedio >= 4.5) {
                System.out.println("Resultado de notas: Excelente (Aprobado)");
            } else if (promedio >= 3.5) {
                System.out.println("Resultado de notas: Bueno (Aprobado)");
            } else {
                System.out.println("Resultado de notas: Aprobado");
            }
        } else if (!apruebaNota && apruebaAsistencia) {
            
            System.out.println("Resultado final: Reprobado por nota baja");
        } else if (apruebaNota && !apruebaAsistencia) {
            
            System.out.println("Resultado final: Reprobado por asistencia insuficiente");
        } else {
            
            System.out.println("Resultado final: Reprobado por nota y asistencia");
        }
		
	}

}
