package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextExcel{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		String userCommand = userInput.nextLine();
		Spreadsheet spreadsheet = new Spreadsheet();
		System.out.println(spreadsheet.getGridText());
		while(!userCommand.equals("quit")){
			userCommand=userInput.nextLine();
			spreadsheet.processCommand(userCommand);
		}
		userInput.close();
	}
}
