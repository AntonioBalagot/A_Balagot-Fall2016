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
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		answer = (a * c) + "x^2" + "+" + ((d * a) + (b * c)) + "x" + (b * d);
		return answer;
	}
	public static boolean isDivisibleBy(int a, int b) {
		if(a % b == 0){;
		return true;
		}else{
			return false;
		}
	}
	public static double absValue(double a) {
		if(a > 0){;
		return a;
		}else{
			return (a * -1);
		}
	}
	public static int max(int a, int b) {
		if(a > b){
			return a;
		}else{
			return b;
		}
	}
	public static double max(double a, double b, double c) {
		if(a > b && a > c){
			return a;
		}else if(b > a && b > c){
			return b;
		}else if(c > a && c > b){
			return c;
		}
	}

	public static int min(int a, int b) {
		if(a < b){
			return a;
		}else{
			return b;
		}
	}		
	public static double round2(double a) {
		double x=a*1000;
		double y=x%10;
		if (y >=5){
			return (x-y+10)/1000;
		}else{
			return ()
		}
		}









		