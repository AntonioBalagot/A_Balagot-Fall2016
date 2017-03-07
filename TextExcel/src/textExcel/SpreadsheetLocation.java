package textExcel;
import java.util.Scanner;

public class SpreadsheetLocation implements Location{
	private String row;
	private char column;
    @Override
    public int getRow(){
    	return Integer.parseInt(row) -1;
    }

    @Override
    public int getCol(){
    	return ((int) column) - 65;
    }
    
    public SpreadsheetLocation(String cellName){
    	row = cellName.substring(1);
    	column = cellName.charAt(0);
    
    }

}