package operators;

public class ArthimeticOperators {

	public static void main(String[] args) {

			/*
			 * Arithmetic Operators:-  	1. Addition +
			 * 							2. Subtraction -
			 * 							3. Multiplication *
			 *  						4. Division /
			 *  						5. Modulo %
			 *  						6. Plus plus ++
			 *  						7. Minus minus --	
			 */
		int a=23;
		int b=45;
		System.out.println("Addition "+ (a+b));
		System.out.println("Subtraction "+(b-a));
		System.out.println("Multiplication "+(a*b));
		System.out.println("Division "+((double)b/(double)a)); 
		System.out.println("Modulo "+(b%a));
		System.out.println("Plus Plus "+b++);
		System.out.println("Minus Minus "+a--);
		/*
		 * ++q  -> First increment then use
		 * q++  -> First use then increment
		 */
	}

}

/*
Addition 68
Subtraction 22
Multiplication 1035
Division 1.9565217391304348
Modulo 22
Plus Plus 45
Minus Minus 23
*/