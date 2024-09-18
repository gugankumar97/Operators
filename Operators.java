package Operators;

public class Operators {

	public static void main(String[] args) {
		/*
		 * Unary Arithmetic Operators
		 * 
		 * +,-,++,--
		 */
		
		int summation = +10;// summation=summation+10; //summation=10
		System.out.println("Value of Summation = " + summation);
		
		int sum2 = -10;// sum2=sum2-10; // sum2 =-10
		System.out.println("Value of Sum2 = " + sum2);
		
		int sum3 = ++sum2;// pre increment //sum3 = -9, sum2 =-9
		System.out.println("Value of Sum3 = " + sum3);
		System.out.println("PreIncrement : Value of Sum2 = " + sum2);
		
		int sum4 = summation++;// postincrement //sum4 = 10, summation = 11
		System.out.println("Value of Sum4 = " + sum4);
		System.out.println("PostIncrement : Value of Summation = " + summation);

		int sum5 = --summation; // sum 5=10, summation =10
		System.out.println("Value of Sum5 = " + sum5);
		System.out.println("PreDecrement : Value of Summation = " + summation);

		int sum6 = summation--; // sum6=10, summation = 9
		System.out.println("Value of Sum6 = " + sum6);
		System.out.println("PostDecrement : Value of Summation = " + summation);
		
		

		/*
		 * Binary Arithmentic Operator
		 * 
		 * +,-,*,/, %
		 */

		int sum7 = sum3 + 10; // sum7=1
		int sum8 = sum4 - 5; // sum8 = 6
		int f1 =5,f2=2;
		
		float sum9 = f1/f2; 
		int sum11 = sum2 * 2;
		int sum12 = 10 % 3;

		int x = 4 + 2;
		System.out.println(x);

		System.out.println("Value of Sum7 = " + sum7);
		System.out.println("Value of Sum8 = " + sum8);
		System.out.println("Value of Sum 9= " + sum9);
		System.out.println("Value of Sum11 = " + sum11);
		System.out.println("Value of Sum12 = " + sum12);

		
		/*
		 * Assignment Operators
		 * 
		 * =,+=,*=,-=,/=,%=
		 */
		int sum13 = 5;
		sum13 += 4;// sum13=sum13+4
		System.out.println("Value of Sum13 = " + sum13);
		
		int price1 = 8;
		price1 -= 4; // price1=price1-4
		System.out.println("Value of price1 = " + price1);
		
		int price2 = 10;
		price2 %= 4; //price2=price5%2
		System.out.println("Value of price2 = " + price2);
				
		
		
		/*
		 * Relational Operator
		 * 
		 * ==, !=, <=,>=,>, <
		 */

		int a = 12, b = 15;

		System.out.println((a == b ));
		System.out.println((a != b ));
		System.out.println((a >= b));
		System.out.println((a <= b));
		System.out.println((a > b));
		System.out.println((a < b));

		

	}

}
