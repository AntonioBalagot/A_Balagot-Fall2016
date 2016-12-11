// FracCalc-Fractional Calculator
// Antonio Balagot
// APCS1
// 12/10/16

package fracCalc;
import java.util.*;
public class FracCalc {
	
	//main reads input from the user and calls produceAnswer with an equation
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Enter an expression, or type 'quit' to exit the program");
    	String equation=userInput.nextLine();
    	while (equation.indexOf("quit")<0){
    	   equation=userInput.nextLine();
    	   System.out.println(produceAnswer(equation));
    	   System.out.println("Enter a new expression, or type 'quit' to exit the program");
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
    	//Contains split up parts such as numerators and denominators
    	String[] splitUpParts=expression.split(" ");
    	String firstOperand=splitUpParts[0];
    	String operator=splitUpParts[1];
    	String secondOperand=splitUpParts[2];
    	
    	parseOperand(firstOperand);
    	parseOperand(secondOperand);
    	String calculation = "";
    	
    	if(operator.equals("+")){
    		calculation=(addFrac(parseOperand(firstOperand), parseOperand(secondOperand), operator));
    	}else if(operator.equals("-")){
    		calculation=(addFrac(parseOperand(firstOperand), parseOperand(secondOperand), operator));
    	}else if(operator.equals("*")){
    		calculation=(multiplyFrac(parseOperand(firstOperand), parseOperand(secondOperand)));
    	}else if(operator.equals("/")){
    		calculation=(divideFrac(parseOperand(firstOperand), parseOperand(secondOperand)));
    	}
    	return(calculation);
    }
    
    public static int[] parseOperand(String operand){
    	int[] separatedOperand=new int[3];
    	
    	if (operand.indexOf("_")>=0){
         	String[] splitOperand=operand.split("_");
         	separatedOperand[0]=Integer.parseInt(splitOperand[0]);
         	String firstFrac=splitOperand[1];
         	String[] separateFraction=firstFrac.split("/");
         	separatedOperand[1]=Integer.parseInt(separateFraction[0]);
         	separatedOperand[2]=Integer.parseInt(separateFraction[1]);
         }else if(operand.indexOf("/")>=0){
         	String[] splitOperand=operand.split("/");
         	separatedOperand[1]=Integer.parseInt(splitOperand[0]);
         	separatedOperand[2]=Integer.parseInt(splitOperand[1]);
         }else{
        	 String[] splitOperand=operand.split("_");
        	 separatedOperand[0]=Integer.parseInt(splitOperand[0]);
        	 separatedOperand[2]=1;
         }
    	 return(toImproperFrac(separatedOperand));
    }
    	
         	
    public static String addFrac(int[] firstOperand , int[]secondOperand, String operator){
    	int addNumerator=0;
    	int addDenominator=0;
    	if(operator.equals("-")){
    		secondOperand[0] *= -1;
    	}
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
    
   
    
    
    
    // HELPER METHODS
    public static int[] toImproperFrac(int[] separatedOperand) {
  		//Array to store the parts of an improper fraction
    	int[]separatedImproper=new int[2];
  		separatedImproper[1]=separatedOperand[2];
  		if(separatedOperand[0] > 0){
  			//For the whole number times the denominator, plus the numerator
  			separatedImproper[0]=separatedOperand[0]*separatedOperand[2]+separatedOperand[1]; 
  		}else if(separatedOperand[0] < 0){
  			separatedImproper[0]=separatedOperand[0]*separatedOperand[2]+separatedOperand[1]*-1;
  		}else{
  			separatedImproper[0]=separatedOperand[1];
  		}
  		return(separatedImproper);
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
  
