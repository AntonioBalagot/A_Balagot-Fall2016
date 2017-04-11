package textExcel;
import java.util.Scanner;

public class SpreadsheetLocation implements Location{
	private int row;
	private int column;
	public SpreadsheetLocation(String cellName){
	    	if(cellName.charAt(0) > 'Z'){
	    		column = cellName.charAt(0) - 'a';
	    	}else{
	    		column = (int)cellName.charAt(0) - (int)'A';
	    	}
	    	row = Integer.parseInt(cellName.substring(1))-1;
	    	}
	@Override
    public int getRow(){
    	return row;
    }

    @Override
    public int getCol(){
    	return column;
    }
    
   
    
    }