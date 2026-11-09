package modulo1.ejercicios.arrays.exception.personalizada;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}