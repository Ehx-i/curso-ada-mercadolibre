package modulo1.ejercicios.ciclos;

import java.util.Scanner;

public class MainCiclos {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Ingrese un número entero (ej. 8) : ");

            if (!sc.hasNextInt()) {
                System.out.println("Por favor, debe ingresar un número entero.");
                return;
            }

            int n = sc.nextInt();

            if (n < 1) {
                System.out.println("N° debe ser mayor o igual a 1.");
                return;
            }

            StringBuilder salida = new StringBuilder();
            int multiplos = 0; // contador adicional
            int i = 1;

            while (i <= n) {
                salida.append(i);

                if (i % 5 == 0) {      
                    salida.append('*');
                    multiplos++;
                }

                salida.append('\n');   
                i++;
            }

            System.out.print(salida);
            System.out.println("Hubo " + multiplos + " múltiplos de 5");
        }

	}

}
