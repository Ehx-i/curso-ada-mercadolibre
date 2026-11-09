package modulo1.ejercicios.calculadora_notas.version2.bidireccional;

public class MainBidireccional {

	public static void main(String[] args) {
		

        double[][] notas = {
            {7, 8, 6},
            {9, 5, 7},
            {6, 6, 9}
        };

        double[] pesos = {0.2, 0.3, 0.5};
        System.out.println("------------------------------------------------------");
        System.out.println("\t\tCUADRO DE NOTAS");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < notas.length; i++) {

            double promedio = 0;

            for (int j = 0; j < notas[i].length; j++) {
                promedio += notas[i][j] * pesos[j];
            }

            if (promedio >= 6) {
                System.out.println(
                    "\tAlumno " + (i + 1) +
                    " -> " + promedio +
                    " ====>  | Aprobó |"
                );
            } else {
                System.out.println(
                    "\t¡Que triste! El Alummno " + (i + 1) +
                    " -> " + promedio +
                    " ====>  | Reprobó |"
                );
            }
        }
        System.out.println("------------------------------------------------------");
    }

	

}
