package modulo1.ejercicios.calculadora.utils;

public class CalculatorImpl implements OperationsCalculator {

	  @Override
	    public double average(double... numbers) {
	        double sum = sum(numbers);
	        return sum / numbers.length;
	    }

	    @Override
	    public double sum(double... numbers) {
	        double total = 0;
	        for (double n : numbers) {
	            total += n;
	        }
	        return total;
	    }

	    @Override
	    public double max(double... numbers) {
	        double max = numbers[0];
	        for (double n : numbers) {
	            if (n > max) max = n;
	        }
	        return max;
	    }

	    @Override
	    public double min(double... numbers) {
	        double min = numbers[0];
	        for (double n : numbers) {
	            if (n < min) min = n;
	        }
	        return min;
	    }

}
