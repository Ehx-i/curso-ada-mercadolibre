package ejercicios.calculadora;
import ejercicios.calculadora.utils.CalculatorImpl;
import ejercicios.calculadora.utils.InputCalculator;
import ejercicios.calculadora.utils.OperationsCalculator;
import ejercicios.calculadora.utils.OutputCalculator;

public class Main {

	public static void main(String[] args) {
		 
	     runCalculator();

	}
	
	
	
	
	
	
	
	 public static void runCalculator() {
	        
	        InputCalculator input = new InputCalculator();
	        OutputCalculator output = new OutputCalculator();
	        OperationsCalculator calc = new CalculatorImpl();

	        
	        double[] numbers = input.readNumbers();

	        
	        output.printResult("Promedio de notas", calc.average(numbers));
	        
	        
//	        output.printResult("Suma", calc.sum(numbers));
//	        output.printResult("Máximo", calc.max(numbers));
//	        output.printResult("Mínimo", calc.min(numbers));
	    }
	
}
