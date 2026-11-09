package modulo1.ejercicios.arrays.exception.personalizada;

public class CuentaBancaria {
	private double saldo = 1000.0; 

  
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Intentaste retirar " + monto + " pero tu saldo es " + saldo);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Tu nuevo saldo es: " + saldo);
    }
}
