/**
 * 
 */

/**
 * @author APCS1
 *
 */
public class Calculate {
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
	public static double toDegrees(double number) {
		double answer;
		answer = (number * 3.14159) / 180;
		return answer;
	}
	public static double toRadians(double number) {
		double answer;
		answer = (number * 180) / 3.14159;
		return answer;
	}
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b * b) - (4 * a * c);
		return answer;
	}
	public static String toImproperFrac(int a, int b, int c) {
		String answer;
		answer = ((a * c) + b + "/"  + c);
		return answer;
	}
	public static String toMixedNum(int a, int b) {
		String answer;
		answer = (a/b) + "_" + (a%b) + "/" + b;
		return answer;
	}
	
		
}

