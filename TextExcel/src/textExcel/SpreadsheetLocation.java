package textExcel;
import java.util.Scanner;

public class SpreadsheetLocation implements Location{
	private String row;
	private char column;
    @Override
    public int getRow(){
    	return Integer.parseInt(row) -1;
       //Scanner row = new Scanner(System.in);
       //int whichRow=row.nextInt();
        //return whichRow;
    }

    @Override
    public int getCol(){
    	return ((int) column)
    	//Scanner column = new Scanner(System.in);
    	//int whichColumn=column.nextInt();   
        //return whichColumn;
    }
    
    public SpreadsheetLocation(String cellName){
    	row = cellName.substring(1);
    	column = cellName.charAt(0);
    
    }

}


//Integer.parseInt(row)-1
//((int) col) -65;