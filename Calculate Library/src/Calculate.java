/**
 * 
 */

/** Program called Calculate used to solve different equations or calculate mathematical values
 * @author APCS1 Antonio Balagot
 * 8/30/16
 */ 
public class Calculate {
	//Part 1
	//Finds the square of a number
	public static int square(int number) {
		int answer;
		answer = (number * number);
		return answer;
	}
	
	//Finds the cube of a number
	public static int cube(int number) {
		int answer;
		answer = (number * number * number);
		return answer;
	}
	
	//Finds the average of two numbers
	public static double average(double number1, double number2) {
		double answer;
		answer = (number1 + number2) / 2;
		return answer;
	}
	
	//Finds the average of three numbers
	public static double average(double number1, double number2, double number3) {
		double answer;
		answer = (number1 + number2 + number3) / 2;
		return answer;
	}
	
	//Converts a value in radians to a value in degrees
	public static double toDegrees(double radius) {
		double answer;
		answer = (radius * 3.14159) / 180;
		return answer;
	}
	
	//Converts a value in degrees to a value in radians
	public static double toRadians(double degrees) {
		double answer;
		answer = (degrees * 180) / 3.14159;
		return answer;
	}
	
	//Calculates the discriminant from the coefficients of a quadratic equation
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b * b) - (4 * a * c);
		return answer;
	}
	
	//Converts an mixed number to an improper fraction
	public static String toImproperFrac(int wholenum, int numerator, int denominator) {
		String answer;
		answer = ((wholenum * denominator) + numerator + "/"  + denominator);
		return answer;
	}
	
	//Converts an improper fraction to a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator/denominator) + "_" + (numerator%denominator) + "/" + denominator;
		return answer;
	}
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a * c) + "x^2 + " + ((d * a) + (b * c)) + "x + " + (b *d);
		return answer;
	}
	//Part 2
	//Determines whether or not one integer is evenly divisible by another
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
	
	//Finds the absolute value of a number
	public static double absValue(double number) {
		if(number > 0){;
		return number;
		}else{
			return (number * -1);
		}
	}
	
	//Returns the larger of the two numbers
	public static double max(int number1, int number2) {
		if(number1 > number2){
			return number1;
		}else{
			return number2;
		}
	}
	
	//Returns the largest of the three numbers
	public static double max(double num1, double num2, double num3) {
		if(num1 > num2 && num1 > num3){
			return num1;
		}else if(num2 > num1 && num2 > num3){
			return num2;
		}else{
			return num3;
		}
	}

	//Returns the smaller of the two numbers
	public static double min(int number1, int number2) {
		if(number1 < number2){
			return number1;
		}else{
			return number2;
		}
	}	
	
	//Rounds a number to two decimal places
	public static double round2(double number) {
		double x=number*1000;
		double y=x%10;
		if (y >=5){
			return (x-y+10)/1000;
		}else{
			return (x - y)/1000;
		}
	}
	//Part 3
	//Raises a value to a positive integer power
	public static double exponent(double base, int exponent) {
		if(exponent < 0){
			throw new IllegalArgumentException("exponent must be greater than or equal to 0");
		}
		double answer = 1;
		for(int i = 0; i < exponent; exponent--){
			answer = answer * base;
		}
		return answer;
	}
	
	//Returns the factorial of the number
	public static int factorial(int number) {
		if(number < 0) {
			throw new IllegalArgumentException("number must be greater than or equal to 0");
		}
		int product = 1;
		for (int i = 2; i<= number; i++) {
			product = product * i;
		}
		return product;
	}
	
	//Determines whether or not an integer is prime
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		for(int i = 3; i < number; i++){
			if (Calculate.isDivisibleBy(number, 2)){
				return false;
			}
		}
		return true;
	}
	
	//Finds the greatest common factor of two numbers
	public static double gcf(double num1, double num2) {
		if(num1 < 0 || num2 < 0) {
			return gcf(Calculate.absValue(num1), Calculate.absValue(num2));
		}if(num2 == 0) {
			return num1;
		} else {
			return gcf(num2, num1 % num2);
		}
	}
	
	//Returns an approximation of the square root of the value passed, accurate to two decimal places
	public static double sqrt(double num1) {
		if(num1 < 0) {
			throw new IllegalArgumentException("number must be greater than or equal to 0");
		}
		for(double k = 0.1; k <= num1; k = k + 0.1){
			double multiply = k * k;
				if (Calculate.absValue(multiply - num1) <= .1){
					return Calculate.round2(k);
				} 
		}
		return num1;
	}
	
	//Part 4
	//Uses the coefficients of a quadratic equation to approximate the real roots using the quadratic formula
	public static String quadForm(int a, int b, int c) {
		double root1;
		double root2;
		double discriminant = Calculate.discriminant(a, b, c);
		if (discriminant < 0) {
			return ("no real roots");
		}
		if (discriminant == 0) {
			root1= (b * (-1)) / (a * 2);
			root1= Calculate.round2(root1);
			return ("" + root1);
		}
		if (discriminant > 0) {
			root1 = ((b * (-1)) + sqrt(discriminant)) / (2 * a);
			root1 = Calculate.round2(root1);
			root2 = ((b * (-1)) - sqrt(discriminant)) / (2 * a);
			root2 = Calculate.round2(root2);
			double max = Math.max(root1, root2);
			double min = Math.min(root1, root2);
			return (min + " and " + max);
		}
		return ("");
	}
}