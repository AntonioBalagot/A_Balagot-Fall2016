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
		String spreadsheet = "";
		String rows = "";
		//Adds the number for each row
		String numberRows = "";
		//Adds the letter for each column
		String addLetters = "  |";
		for(int i=0; i < 12; i++){
			addLetters = addLetters + ((char) ('A' + i)) + "         |";
		}
		spreadsheet = spreadsheet + addLetters + "\n";
		for(int i = 0; i<20;i++){
			//To get equal spacing for the labels
			if (i<9){
				rows = (i+1) + "  |";
			}else{
				rows = (i+1) + " |";
			}
			for(int k = 0; k < cells.length; k++){
				rows = rows + "         |";
			}
			numberRows = "\n";
			spreadsheet = spreadsheet + rows + numberRows;
		}
		return spreadsheet;
	}

}
