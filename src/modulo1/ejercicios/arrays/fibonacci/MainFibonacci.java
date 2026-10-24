package modulo1.ejercicios.arrays.fibonacci;

public class MainFibonacci {
	
	public static void main(String[] args) {
		int n = 5;
		System.out.printf("Serie de fibonacci: " + fibonacci(n));
		

	}
	
	
	static StringBuilder sb = new StringBuilder();
	public static StringBuilder fibonacci(int num) {
		
		if(num < 1) return  sb.append("0");
		if(num == 1) return sb.append("1");
		int i = 0, a = 0, b = 1;
		int temp;
		
		while(i <= num) {
			
			sb.append(a);
			
			if(i < num) sb.append(", ");
			
			temp =  a + b;
			a = b;
			b = temp;
			i++;
		}	
		
		return sb;  
	}
}
