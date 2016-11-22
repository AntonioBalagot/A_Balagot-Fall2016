package fracCalc;
import java.util.*;
public class FracCalc {
	
	//main reads input from the user and calls produceAnswer with an equation
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Enter a number, or enter 'quit' to quit the program");
    	String equation=userInput.nextLine();
    	while (equation.indexOf("quit")<0){
    	   System.out.println(produceAnswer(equation));
    	   System.out.println("Please enter a new number, or enter 'quit' to quit the program");
    	   		equation=userInput.nextLine();
    	}
    	    		
    }

    public static boolean isDivisibleBy(int number1, int number2) {
		if (number1 < number2) {
			throw new IllegalArgumentException("number1 must be greater than number2");
		}
		if(number1 % number2 == 0){;
		return true;
		}else{
			return false;
		}
	}
    
    public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		for(int i = 3; i < number; i++){
			if (isDivisibleBy(number, 2)){
				return false;
			}
		}
		return true;
	}
    public static double gcf(double num1, double num2) {
		if(num1 < 0 || num2 < 0) {
			return gcf((num1 * -1), (num2 * -1));
		}if(num2 == 0) {
			return num1;
		} else {
			return gcf(num2, num1 % num2);
		}
	}
    	   
    
    
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    // Parts 1 & 2: produceAnswer takes a String and splits into two operands and the operator. 
    //Then it parses each operand into a whole number, numerator, and denominator.
    //Finally it returns a string that describes each component of the second operator.
    //Part 3:
    public static String produceAnswer(String expression) {
    	int wholeNum=0;
    	int numerator=0;
    	int denominator=0;
    	int firstWholeNum=0;
    	int secondWholeNum=0;
    	int firstNumerator=0;
    	int firstDenominator=0;
    	int secondNumerator=0;
    	int secondDenominator=0;
    	String[] split=expression.split(" ");
        String firstOperand=split[0];
        String operator=split[1];
        String secondOperand=split[2];
        if (firstOperand.indexOf("_")>=0){
        	String[] firstOperandSeparated=firstOperand.split("_");
        	firstWholeNum=Integer.parseInt(firstOperandSeparated[0]);
        	String firstFrac=firstOperandSeparated[1];
        	String[] firstFracSeparated=firstFrac.split("/");
        	firstNumerator=Integer.parseInt(firstFracSeparated[0]);
        	firstDenominator=Integer.parseInt(firstFracSeparated[1]);
        }else if(firstOperand.indexOf("/")>=0){
        	String[] firstFracSeparated=firstOperand.split("/");
        	firstNumerator=Integer.parseInt(firstFracSeparated[0]);
        	firstDenominator=Integer.parseInt(firstFracSeparated[1]);
        }else{
        	firstWholeNum=Integer.parseInt(firstOperand);
        	firstDenominator=1;
        }
        if (secondOperand.indexOf("_")>=0){
        	String[] secondOperandSeparated=secondOperand.split("_");
        	secondWholeNum=Integer.parseInt(secondOperandSeparated[0]);
        	String secondFrac=secondOperandSeparated[1];
        	String[] secondFracSeparated=secondFrac.split("/");
        	secondNumerator=Integer.parseInt(secondFracSeparated[0]);
        	secondDenominator=Integer.parseInt(secondFracSeparated[1]);
        }else if(secondOperand.indexOf("/")>=0){
        	String[] secondFracSeparated=secondOperand.split("/");
        	secondNumerator=Integer.parseInt(secondFracSeparated[0]);
        	secondDenominator=Integer.parseInt(secondFracSeparated[1]);
        }else{
        	secondWholeNum=Integer.parseInt(secondOperand);
        	secondDenominator=1;
        }
        return "whole:" + secondWholeNum + " numerator:" + secondNumerator 
        			+ " denominator:" + secondDenominator;
		
        /*if (operator.indexOf("+")>=0){
			wholeNum=firstWholeNum+secondWholeNum;
			numerator=firstNumerator*secondDenominator+secondNumerator*firstDenominator;
			denominator=firstDenominator*secondDenominator;
			if (numerator%denominator==0){
				wholeNum=wholeNum+numerator/denominator;
			}else if(numerator>denominator){
				wholeNum++;
				numerator=numerator-denominator;
			}else{
				int gcf=gcf(numerator, denominator);
				numerator=numerator/gcf;
			}*/
			
			//return "" + wholeNum
        //}else if (operator.indexOf("-")>=0){
        //}else if (operator.indexOf("+")>=0){	
        //}else{
        	
    }
        // TODO: Implement this function to produce the solution to the input
        
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
