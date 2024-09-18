package Operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		/** Bitwise Operator
		 * &(single and), |(single or), ^(XOR), ~(complement) 
		 * >>(signed right shift), >>>(unsigned right shift)
		 * <<(signed left shift)
		 */
		
		// (&) single and 
		
		System.out.println("4 & 5 = " + (4 & 5)); // 4
		/*
		 * 1 0 0    // As we know in AND operator both the condition need to be true
		 * & & &    // then only output will also be true
		 * 1 0 1 
		 * ----- 
		 * 1 0 0 = 4
		 */
		
		// (|) single or
		
		System.out.println("4 | 5 = " + (4 | 5)); // 5
		/*
		 * 1 0 0    // As we know in OR operator any one condition is true the output 
		 * | | |    // will also be true
		 * 1 0 1 
		 * ----- 
		 * 1 0 1 = 5
		 */
		
		// (^) XOR
		
		System.out.println("4 ^ 5 = " + (4 ^ 5)); // 1
		/*
		 * 1 0 0 
		 * ^ ^ ^ 
		 * 1 0 1 
		 * ----- 
		 * 0 0 1 = 1
		 */
		
		// (~) Complement
		
		System.out.println("~7 = " + ~7);
		/*
		 * 
		
		 *   
		 * 0111
		 *    1 (add 1)
		 * ----
		 *  1000   
		 * 
		 *   1000 => -8 (negatiate it)
		 *      
		 */
		
		// >>, >>>, << (shift operators)

		System.out.println("8 >> 1 = " + (8 >> 1));// 0000 1000 ==> 0000 0100 
		System.out.println("8 << 1 = " + (8 << 1));// 0000 1000 ==> 0001 0000
		
		System.out.println("17 >> 3 = " + (17 >> 3));// 0000 0111 ==> 0000 0001 
		System.out.println("7 << 2 = " + (7 << 2));// 0000 0111 ==> 0001 1100
		
		System.out.println("5 >> 1 = " + (0b101 >> 1));//0101==> 0010
	
		System.out.println("15 >> 1 = " + (15 >> 1)); // 0000 1111 => 0000 0111
		System.out.println("15 >>> 1 = " + (15 >>> 1)); // 0000 1111
		
		System.out.println("16 in Binary Format : "+Integer.toBinaryString(16));
		System.out.println("15 in Binary Format : "+Integer.toBinaryString(15));
		System.out.println("-15 in Binary Format : "+Integer.toBinaryString(-15));
		
		System.out.println("-15 >> 1 = " + (-15 >> 1)); 
		System.out.println("-15 >>> 1 = " + (-15 >>> 1)); 

		int negativeByteValue = 0b1111111111111111111110000000;
		
		System.out.println("-128 = " + negativeByteValue); // 11111111111111111111111110000000
		System.out.println("-128 >>> 1 = " + (negativeByteValue >>> 1)); // 01111111111111111111111111000000
		System.out.println("-128 >> 1 = " + (negativeByteValue >> 1)); // 11111111111111111111111111000000




		System.out.println("20 * 2 = 20 << 1 = " + (20 << 1)); // x << y = x * (2 ^ y)
		System.out.println("20 / 2 = 17 >> 3 = " + (20 >> 1)); // x >> y = x / (2 ^ y)

		
		
		
		
		
		
		
		

	}

}
