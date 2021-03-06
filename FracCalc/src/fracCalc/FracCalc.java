// FracCalc-Fractional Calculator
// Antonio Balagot
// APCS1
// 12/10/16
// Goal is to create a fractional calculator to compute arithmetic operations between integers
// and/or fractions and output the result as a reduced mixed fraction.

package fracCalc;
import java.util.*;

public class FracCalc {
	//main reads input from the user and calls produceAnswer with an equation
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Enter an expression, or type 'quit' to exit the program");
    	String equation=userInput.nextLine();
    	//To ask for input until quit is entered
    	while (equation.indexOf("quit")<0){
    	   equation=userInput.nextLine();
    	   System.out.println(produceAnswer(equation));
    	   System.out.println("Enter a new expression, or type 'quit' to exit the program");
    	}    
    	userInput.close();
    }

    // Parts 1 & 2: produceAnswer takes a String and splits into two operands and the operator. 
    //Then it parses each operand into a whole number, numerator, and denominator.
    //Finally it returns a string that describes each component of the second operator.
    //Part 3: produceAnswer calls methods to perform the calculation
    public static String produceAnswer(String expression) {
    	//splitUpParts contains split up parts such as numerators and denominators
    	//Split at spaces to get 2 operands and an operator
    	String[] splitUpParts=expression.split(" ");
    	String firstOperand=splitUpParts[0];
    	String operator=splitUpParts[1];
    	String secondOperand=splitUpParts[2];
    	parseOperand(firstOperand);
    	parseOperand(secondOperand);
    	String calculation = "";
    	
    	//Returns error message if there are multiple operators next to each other(ie. ++)
    	if(operator.length() != 1){
    		throw new IllegalArgumentException("ERROR: Input is in an invalid format");
    	}
    	// Determines which operator is in the expression and calls the right method to deal with it
    	if(operator.equals("+")){
    		calculation=simplify(addOrSubtractFrac(parseOperand(firstOperand), parseOperand(secondOperand), operator));
    	}else if(operator.equals("-")){
    		calculation=simplify(addOrSubtractFrac(parseOperand(firstOperand), parseOperand(secondOperand), operator));
    	}else if(operator.equals("*")){
    		calculation=simplify(multiplyFrac(parseOperand(firstOperand), parseOperand(secondOperand)));
    	}else if(operator.equals("/")){
    		calculation=simplify(divideFrac(parseOperand(firstOperand), parseOperand(secondOperand)));
    	}else{
    		calculation="Please enter a new expression. Your input is invalid.";
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
    	
    // If operator is "+" or "-"     	
    public static int[] addOrSubtractFrac(int[] firstOperand , int[]secondOperand, String operator){
    	int[] fraction = new int[2];
    	//fraction[0] is the numerator
    	fraction[0]=0;
    	//fraction[1] is the denominator
    	fraction[1]=1;
    	if(operator.equals("-")){
    		secondOperand[0] *= -1;
    	}
    	if(firstOperand[1] == secondOperand[1]){
    		fraction[0]=firstOperand[0] + secondOperand[0];
    		fraction[1]=firstOperand[1];
    	}else{
    		fraction[0]=(firstOperand[0] * secondOperand[1]) + (secondOperand[0] * firstOperand[1]);
    		fraction[1]=firstOperand[1]*secondOperand[1];
    	}
    	return(fraction);
    }
    	
    //If operator is "*"
    public static int[] multiplyFrac(int[] firstOperand , int[] secondOperand){
    	int[] fraction=new int[2];
    	fraction[0]=0;
    	fraction[1]=1;
    	fraction[0]=firstOperand[0]*secondOperand[0];
    	fraction[1]=firstOperand[1]*secondOperand[1];
    	return(fraction);
    }
    
    //If operator is "/"
    public static int[] divideFrac(int[] firstOperand , int[] secondOperand){
    	int[] fraction=new int[2];
    	fraction[0]=0;
    	fraction[1]=1;
    	fraction[0]=firstOperand[0]*secondOperand[1];
    	fraction[1]=firstOperand[1]*secondOperand[0];
    	if(fraction[0]>=0 && fraction[1]<0){
    		fraction[0] *=-1;
    		fraction[1] *=-1;
    	}
    	return(fraction);
    }
    
    //To simplify the fraction as much as possible (Final)
    public static String simplify(int[] fraction){
    	int wholeNum=0;
    	int numerator=0;
    	int denominator=1;
    	
    	if(absValue(fraction[0])>absValue(fraction[1])){
    		wholeNum=fraction[0]/fraction[1];
    		numerator=fraction[0]%fraction[1];
    		denominator=fraction[1];
    	}
    	if(absValue(fraction[0])<absValue(fraction[1])){
    		numerator=fraction[0];
    		denominator=fraction[1];
    	}
    	if(fraction[0]==fraction[1]){
    		wholeNum=1;
    	}
    	
    	int gcf=gcf(numerator, denominator);
    	numerator = numerator/gcf;
    	denominator=denominator/gcf;
    	if(numerator==0){
    		return(wholeNum + "");
    	}else if(wholeNum==0){
    		if(wholeNum==0 && denominator<0){
    			return(absValue(numerator) + "/" + absValue(denominator));
    		}else if(denominator<0){
    			return((numerator * -1) + "/" + absValue(denominator));
    		}else if(denominator !=1){
    			return(numerator + "/" + denominator);
    		}else if(denominator==0){
    			return("ERROR: Cannot divide by zero.");
    		}else{
    			return(numerator + "");
    		}
    	}else{
    		return(wholeNum + "_" + absValue(numerator) + "/" + absValue(denominator));
    		}
    	}
    
    
    
    
    // HELPER METHODS
    
    //To convert mixed numbers into improper fractions in order to ake it easier to multiply
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
      
    //To deal with negative numbers in the user's input
      public static int absValue(int number) {
  		if(number > 0){;
  		return number;
  		}else{
  			return (number * -1);
  		}
  	  }
      
      //To find the greatest common factor in the fraction in order to simplify it
      public static int gcf(int num1, int num2) {
  		if(num1 < 0 || num2 < 0) {
  			return gcf(absValue(num1), absValue(num2));
  		}if(num2 == 0) {
  			return num1;
  		} else {
  			return gcf(num2, num1 % num2);
  		}
  	}
}

  
