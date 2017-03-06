package textExcel;
import java.util.Scanner;

public class SpreadsheetLocation implements Location{
	
    @Override
    public int getRow(){
       Scanner row = new Scanner(System.in);
       int whichRow=row.nextInt();
        return whichRow;
    }

    @Override
    public int getCol(){
    	Scanner column = new Scanner(System.in);
    	int whichColumn=column.nextInt();   
        return whichColumn;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    }

}
