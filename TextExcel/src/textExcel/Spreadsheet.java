package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	EmptyCell[][] cells = new EmptyCell[20][12];

	@Override
	public String processCommand(String command){
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int getRows(){
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols(){
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText(){
		// TODO Auto-generated method stub
		return null;
	}

}
