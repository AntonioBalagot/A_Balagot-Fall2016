import java.io.*;
import java.util.*;
public class changeInTemp {
	public static void main(String[] args) throws FileNotFoundException {
		File weather= new File("weather.txt");
		Scanner input = new Scanner(weather);
		double oldTemp = input.nextDouble();
		for(int i=0; i<7; i++){
			double newTemp= input.nextDouble();
			System.out.println(oldTemp + "to " + newTemp + ", change: " + (newTemp-oldTemp));
			newTemp=oldTemp;
		}
	}

}