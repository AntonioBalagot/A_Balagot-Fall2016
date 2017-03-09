package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	Cell[][] cells = new EmptyCell[20][12];
	String printSpreadsheet="";

	@Override
	public String processCommand(String command){
		return "";
	}

	@Override
	public int getRows(){
		return 20;
	}

	@Override
	public int getCols(){
		return 12;
	}

	@Override
	public Cell getCell(Location loc){
		return null;
	}

	@Override
	public String getGridText(){
		for(int i=0; i< cells.length; i++){
			if(i==0){
				printSpreadsheet = printSpreadsheet + "   ";
				for(int j=0; j<cells[0].length; j++){
					printSpreadsheet = printSpreadsheet + ("|" + (char)(j+65) + "");
				}
			}
		}
		return null;
	}

}
