/**
 * 
 */

/**
 * @author APCS1 Antonio Balagot
 *
 */
public class Calculate {
	//Part 1
	public static double square(double number) {
		double answer;
		answer = (number * number);
		return answer;
	}
	public static double cube(double number) {
		double answer;
		answer = (number * number * number);
		return answer;
	}
	public static double average(double number1, double number2) {
		double answer;
		answer = (number1 + number2) / 2;
		return answer;
	}
	public static double average(double number1, double number2, double number3) {
		double answer;
		answer = (number1 + number2 + number3) / 2;
		return answer;
	}
	public static double toDegrees(double radius) {
		double answer;
		answer = (radius * 3.14159) / 180;
		return answer;
	}
	public static double toRadians(double degrees) {
		double answer;
		answer = (degrees * 180) / 3.14159;
		return answer;
	}
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b * b) - (4 * a * c);
		return answer;
	}
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
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a * c) + "x^2 + " + ((d * a) + (b * c)) + "x +  " + (b *d);
		return answer;
	}
	//Part 2
	public static boolean isDivisibleBy(int number1, int number2) {
		if (number1 || number2 < 0) {
			throw new IllegalArgumentException("both numbers must be greater than 0");
		}
		if(number1 % number2 == 0){;
		return true;
		}else{
			return false;
		}
	}
	public static double absValue(double number) {
		if(number > 0){;
		return number;
		}else{
			return (number * -1);
		}
	}
	public static int max(int number1, int number2) {
		if(number1 > number2){
			return number1;
		}else{
			return number2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		if(num1 > num2 && num1 > num3){
			return num1;
		}else if(num2 > num1 && num2 > num3){
			return num2;
		}else{
			return num3;
		}
	}

	public static int min(int number1, int number2) {
		if(number1 < number2){
			return number1;
		}else{
			return number2;
		}
	}		
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
	public static double exponent(double a, int b) {
		double result = 1;
		for(int i = 0; i < b; i--){
			result *= a;
		}
		return result;
	}
	public static int factorial(int number) {
		if(number < 0) {
			throw new IllegalArgumentException("number must be greater than or equal to 0");
		int product = 1;
		for (int i = 2; i<= number; i++) {
			product = product * i;
		}
		return product;
		}
	public static boolean isPrime(int number) {
		boolean y = true;
		for(int i=number; i >1; i--){
		y = Calculate.isDivisibleBy(number, i);
		}
		return y;
	}
	public static double gcf(int num1, int num2) {
		while(num2 != 0){
			int num3 = num1;
			num1 = num2;
			num2 = num2 % num3;
		}
		return (num1);
	}
	public static double sqrt(double num1) {
		for(double k = 0.1; k <= num1; k += 0.1){
			double multiply = k * k;
				if (Calculate.absValue(multiply - num1) <= .1){
					return Calculate.round2(k);
				} 
		}
		return num1;
	}
}


		