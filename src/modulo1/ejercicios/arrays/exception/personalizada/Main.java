package modulo1.ejercicios.arrays.exception.personalizada;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria();

        try {
            
            cuenta.retirar(1500.0);
        } catch (SaldoInsuficienteException e) {
            
            System.out.println("Error atrapado: " + e.getMessage());
        }
    }

	

}
