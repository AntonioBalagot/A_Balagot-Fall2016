/**
 * 
 */

/**Program called ProcessingNumbers that accepts a string of numbers as user input, prints
 * the smallest and largest of the numbers entered, and prints the sum of all the even numbers
 * along with the largest even number typed.
 * 
 * @author Antonio Balagot APCS1  10/2/16
 *
 */
import java.util.*;
public class ProcessingNumbers {
	public static void main (String[] args){
		Scanner userInput=new Scanner(System.in);
		int max = 0;
		int min = 999999999;
		int evenSum= 0;
		int evenMax = 0;
		for (int i=0; i<5; i++) {
			int num;
			num = userInput.nextInt();
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
			if ( (num % 2)==0) {
				evenSum = evenSum + num;
				if(num>evenMax) {
					evenMax = num;
				}
			}
		}
		System.out.println("The max is " + max + " and the min is " + min + ".");
		System.out.println("The sum of the even numbers is " + evenSum + ". The max even number is " + evenMax + ".");
	}
}
