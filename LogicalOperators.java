package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		/** Logical Operators
		 * &(single and), &&(double and), |(single or), ||(double or)
		 * !(NOT), ^(XOR)
		 */

		byte a=10; // EXAMPLES common for all operators mentioned below
		byte b=15;
		
		/**
		 * (single and),(double and) operator
		 */
		
		// true & true = true
		// true & false = false
		// false & true = false
		// false & false = false
		
		
		
	    System.out.println((a==b)&(a!=b)); // check both condition and return result
	    
	 // In java, any number dividing by 0 is a dead code and hence throws runtime
	 // exception if its not handled properly.
	    
	 // System.out.println((a!=b)&(6/0==0)); // throws runtime exception "Divide by zero" as it checks both the condition
	//  System.out.println((a==b)&(6/0==0)); // throws runtime expection "divide by zero" as it checks both the condition
	                                         // even 1st condition is false
		
	    
	    System.out.println((a==b)&&(2/0==0)); // if the first condition is true then only it check the second condition(in this first condition is false so it does not check the second condition so it does not show any expection error)
	 // System.out.println((a!=b)&&(2/0==0)); // in this first condition is true so it checked the second one and shows expection error
	    
	    System.out.println((a==b)&&(a!=b));
	    
	    /**
	     *  (single or) (double or) operator
	     */
	    
	    // true | true =  true
	    // true | false = true
	    // false | true = true
	    // false | false = false
	    
	   System.out.println((a>=b)|(a!=b)); // check both the condition and return result
	 // System.out.println((a>=b)|(9/0==1));//throws runtime exception "Divide by zero" as it checks both the condition
		
	   System.out.println((a<=b)||(9/0==1));// checks both the condition only if the first condition is false
		// so the 2nd condition is not checked and no exception thrown
	   
	   // System.out.println((a>=b)||(9/0==1)); // throws runtime exception "Divide by zero" as it checks both the condition
		// because the 1st condition is false
	   
	   /**
	    * NOT operator (!)
	    */
	  
	    System.out.println("not 1:"+!true); // !true=false
	    System.out.println("not 2:"+!false);// !false=true
	    
	    /**
	     * XOR operator
	     */
	    
	    // true ^ true = false
	    // false ^ false = false
	    // true ^ false = true
	    // false ^ true = true
	    
	    System.out.println((a!=b)^(a<=b));
	    System.out.println((a==b)^(a>=b));
	    System.out.println((a!=b)^(a>=b));
	    System.out.println((a>=b)^(a!=b));
	    
	}

}
