package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	
    	Scanner scn = new Scanner(System.in);
    	String input = String.valueOf(scn.next());
    	while(!input.equals("quit")) {
    		System.out.println(input);
    		System.out.println("Is Integer: " + isInteger(input.charAt(0)));
    		System.out.println("Is Fraction form: " + isFractionForm(input));
    		produceAnswer(input);
    		input = String.valueOf(scn.next());
    		
    	}
    	scn.close();
    	System.exit(1);
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    {
    	String firstFraction = new String();
    	String secondFraction = new String();
    	String operator = new String();
    	int dividerLocation = 0;
    	
    	//find the operator
    	for (int i = 0; i < input.length(); i++) {
    	    char c = input.charAt(i);        
    	    if(isOperator(c)) {
    	    	operator = String.valueOf(c);
    	    }
    	}
    	
    	//find the first fraction
    	for (int i = 0; i < input.length(); i++) {
    	    char c = input.charAt(i);        
    	    while(c != ' ') {
    	    	firstFraction = firstFraction += c;
    	    }
    	    
    	}
    	
    	//find the second fraction
    	for (int i = dividerLocation + 1; i < input.length(); i++) {
    	    char c = input.charAt(i);
    	    while(i != input.length() - 1) {
    	    	secondFraction = secondFraction += c;
    	    }
    	}
    	
    	System.out.println("Operator: " + operator);
    	System.out.println("First Fraction: " + firstFraction);
    	System.out.println("Second Fraction: " + secondFraction);
    	
    	
        // TODO: Implement this function to produce the solution to the input
        return "";
    }
//'' (vertical bar) character mean in a ...
    // TODO: Fill in the space below with any helper methods that you think you will need
    static boolean isInteger(char c) {
    	if(c == '1' ||  c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' ||
    			c == '8' || c == '9' || c == '0') {
    		return true;
    	}
    	return false;
    }
    
    static boolean isOperator(char c) {
    	if(c == '+' ||  c == '-' || c == '*' || c == '/') {
    		return true;
    	}
    	return false;
    }
    
    static boolean isFractionForm(String input) {
    	try {
	    	if(input.length() >= 3) {
		    	if(input.charAt(1) == '/') {
					//if the first and third characters in the String are integers
		    		if(isInteger(input.charAt(0)) && isInteger(input.charAt(2))) {
		    			return true;
		    		}
		    		return false;
				}
		    	return false;
	    	}
	    	return false;
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return false;
    }
}
