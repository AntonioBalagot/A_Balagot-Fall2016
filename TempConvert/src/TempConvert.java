/**Program called TempConvert used to convert temperatures in Fahrenheit to temperatures in Celsius 
 * 
 */

/** 8/30/16
 * Antonio Balagot APCS1
 *
 */
public class TempConvert {
	public static void main(String[] args) {
		//declare variables
				double Fahrenheit;
				double Celsius;
		//compute Celsius
				Fahrenheit = 32; 
				Celsius = (Fahrenheit - 32) * (5.0/9.0);
		//print results
				System.out.println("Degrees Celsius:");
				System.out.println(Celsius);
	}

}
