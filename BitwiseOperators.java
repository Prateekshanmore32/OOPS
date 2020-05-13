package operators;

public class BitwiseOperators {

	public static void main(String[] args) {

			/*
			 * Bitwise Operators:- 	...,32,16,8,4,2,1
			 * 
			 * 						1. AND(&)
			 * 						2. OR(|)
			 * 						3. NOT(~)
			 * 						4. XOR(^)
			 * 						5. >>(right shift->value gets half)
			 * 						6. <<(left shift->value gets double)
			 */

		
		
			//AND
			int a=5;           			//Binary of 5      ->  101   ~5
			int	b=6;	       			//Binary of 6      ->  110   ~6
			int c=a&b;         			//AND of a and b   ->  100   ~4
			System.out.println("Bitwise AND Of a And b = "+ c);
			
			
			
			//OR
			int d=12;                  //Binary of 12      ->  1100   ~12
			int e=14;				   //Binary of 14      ->  1110   ~14
			int f=d|e;				   //OR of d and e     ->  1110   ~14
			System.out.println("Bitwise OR of d and e = "+f);
				
			
			
			//NOT
			int g=15;                   //Binary of 6        ->  1111  ~15
			int h=~g;                  
			System.out.println("Bitwise NOT of g = "+h);
			
			
			
			//XOR
			int i=8;                  //Binary of 8         ->   1000     ~8
			int j=6;                  //Binary of 6         ->   0110     ~6
			int k=i^j;                //XOR of i and j      ->   1110     ~14
			System.out.println("Bitwise XOR of i and j = "+k);
			
			
			
			//>>(right shift->value gets half)
			int l=13;                   //Binary of 13         ->  1101    ~13
			int m=l>>1 ;               //right shift by one    ->  0110     ~6
			                          //right shift by two    ->   0011     ~3
									 //	right shift by three   ->  0001     ~1
			System.out.println("Bitwise right shift by one of l = "+m);
			
			
			
			//<<(Left shift->value gets double)
			int n=13;               //Binary of 13         ->  1101    ~13
			int o=n<<1;             //left shift by 1                  ~26
			                       //left shift by 2                   ~52
			System.out.println("Bitwise left shift by 1= "+o);
	}

}


/*
Bitwise AND Of a And b = 4
Bitwise OR of d and e = 14
Bitwise NOT of g = -16
Bitwise XOR of i and j = 14
Bitwise right shift by one of l = 6
Bitwise left shift by 1= 26
*/