// FracCalc-Fractional Calculator
// Antonio Balagot
// APCS1
// 12/9/16

package fracCalc;
import java.util.*;
public class FracCalc {
	
	//main reads input from the user and calls produceAnswer with an equation
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Enter a whole or mixed number, or type 'quit' to exit the program");
    	String equation=userInput.nextLine();
    	while (equation.indexOf("quit")<0){
    	   System.out.println(produceAnswer(equation));
    	   System.out.println("Enter a new whole or mixed number, or type 'quit' to exit the program");
    	   		equation=userInput.nextLine();
    	}    
    	userInput.close();
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
    	String[] splitString=expression.split(" ");
    	String firstOperand=splitString[0];
    	String secondOperand=splitString[2];
    	parseOperand(firstOperand);
    	parseOperand(secondOperand);
    	String operator=splitString[1];
    	String calculation = "";
    	if(operator.equals("+")){
    		calculation=addFrac(parseOperand(firstOperand), parseOperand(secondOperand));
    	}else if(operator.equals("-")){
    		calculation=subtractFrac(parseOperand(firstOperand), parseOperand(secondOperand));
    	}else if(operator.equals("*")){
    		calculation=multiplyFrac(parseOperand(firstOperand), parseOperand(secondOperand));
    	}else if(operator.equals("/")){
    		calculation=divideFrac(parseOperand(firstOperand), parseOperand(secondOperand));
    	}
    	return(calculation);
    }
    
    public static int[] parseOperand(String expression){
    	int[] splitOperand=new int[3];
    	int wholeNumber=splitOperand[0];
    	int numerator=splitOperand[1];
    	int denominator=splitOperand[2];
    	String[] split=expression.split(" ");
        String firstOperand=split[0];
        String secondOperand=split[2];
    	int firstWholeNum=0;
    	int secondWholeNum=0;
    	int firstNumerator=0;
    	int firstDenominator=0;
        int firstWholeNumber=0;
    	int secondWholeNumber=0;
    	String operator=split[1];
    	int[] operandSplit=new int[3];
    	int wholeNum=operandSplit[0];
    	 if (firstOperand.indexOf("_")>=0){
         	String[] separatedOperand1=firstOperand.split("_");
         	firstWholeNumber=Integer.parseInt(separatedOperand1[0]);
         	String firstFrac=separatedOperand1[1];
         	String[] separatedFraction1=firstFrac.split("/");
         	firstNumerator=Integer.parseInt(separatedFraction1[0]);
         	firstDenominator=Integer.parseInt(separatedFraction1[1]);
         }else if(firstOperand.indexOf("/")>=0){
         	String[] separatedFraction1=firstOperand.split("/");
         	firstNumerator=Integer.parseInt(separatedFraction1[0]);
         	firstDenominator=Integer.parseInt(separatedFraction1[1]);
         }else{
         	firstWholeNumber=Integer.parseInt(firstOperand);
         	firstDenominator=1;
         }
        int secondNumerator=0;
     	int secondDenominator=0;
         if (secondOperand.indexOf("_")>=0){
         	String[] separatedOperand2=secondOperand.split("_");
         	secondWholeNumber=Integer.parseInt(separatedOperand2[0]);
         	String secondFrac=separatedOperand2[1];
         	String[] separatedFraction2=secondFrac.split("/");
         	secondNumerator=Integer.parseInt(separatedFraction2[0]);
         	secondDenominator=Integer.parseInt(separatedFraction2[1]);
         }else if(secondOperand.indexOf("/")>=0){
         	String[] separatedFraction2=secondOperand.split("/");
         	secondNumerator=Integer.parseInt(separatedFraction2[0]);
         	secondDenominator=Integer.parseInt(separatedFraction2[1]);
         }else{
        	secondWholeNumber=Integer.parseInt(secondOperand);
           	secondDenominator=1;
          }
         return(improperFrac)
           return "whole:" + secondWholeNumber + " numerator:" + secondNumerator + " denominator:" + secondDenominator;
           
         }
         	
    public static String addFrac(int[] firstOperand , int[]secondOperand){
    	int addNumerator=0;
    	int addDenominator=0;
    	if(firstOperand[1] == secondOperand[1]){
    		addNumerator=firstOperand[0] + secondOperand[0];
    	}else{
    		addNumerator=(firstOperand[0] * secondOperand[1]) + (secondOperand[0] * firstOperand[1]);
    		addDenominator=firstOperand[1] * secondOperand[1];
    	}
    	return(addNumerator + "/" + addDenominator);
    }
    	
    public static String subtractFrac(int[] firstOperand , int[] secondOperand){
    	int subtractNumerator=0;
    	int subtractDenominator=0;
    	if(firstOperand[1] == secondOperand[1]){
    		subtractNumerator=firstOperand[0] - secondOperand[0];
    	}else{
    		subtractNumerator = (firstOperand[0] * secondOperand[1]) - (secondOperand[0] * firstOperand[1]);
    		subtractDenominator=firstOperand[1] * secondOperand[1];
    	}
    	return(subtractNumerator + "/" + subtractDenominator);
    }
    	
    public static String multiplyFrac(int[] firstOperand , int[] secondOperand){
    	int toMultiplyNumerator=0;
    	int toMultiplyDenominator=0;
    	toMultiplyNumerator=firstOperand[0] * secondOperand[0];
    	toMultiplyDenominator=firstOperand[1] * secondOperand[1];
    	return(toMultiplyNumerator + "/" + toMultiplyDenominator);
    }
    	
    public static String divideFrac(int[] firstOperand , int[] secondOperand){
    	int toDivideNumerator=0;
    	int toDivideDenominator=0;
    	toDivideNumerator=firstOperand[0] * secondOperand[1];
    	toDivideDenominator=firstOperand[1] * secondOperand[0];
    	return(toDivideNumerator + "/" + toDivideDenominator);
    }
    
    
    // TODO:Implement this function to produce the solution to the input
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String toImproperFrac(int wholenum, int numerator, int denominator) {
  		String answer;
  		answer = ((wholenum * denominator) + numerator + "/"  + denominator);
  		return answer;
  	}
      
      public static String toMixedNum(int numerator, int denominator) {
  		String answer;
  		answer = (numerator/denominator) + "_" + (numerator%denominator) + "/" + denominator;
  		return answer;
      }
      
      public static boolean isDivisibleBy(int number1, int number2) {
  		if (number1 < number2) {
  			throw new IllegalArgumentException("number1 must be greater than number2");
  		}
  		if(number1 % number2 == 0){
  		return true;
  		}else{
  			return false;
  		}
  		
  		
  	}
}
  
