package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	private Cell[][] cells;
	public Spreadsheet(){
		cells = new Cell [20][12];
		for(int i=0; i<20; i++){
			for(int j=0; j<12;j++){
				cells[i][j] = new EmptyCell();
			}
		}
		
	}

	@Override
	public String processCommand(String command){
		if (command.equals("")) {
			return "";
		}else if(command.indexOf(" ") > 0){
			String[] input = command.split(" ", 3);
			if (input.length > 1){
				if(input[1].equals("=")){
					String cellLocation = input[0];
					SpreadsheetLocation location = new SpreadsheetLocation(cellLocation);
					int column = location.getCol();
					int row = location.getRow();
					if (input[2].charAt(0) == '"' && input[2].charAt(input[2].length()-1) == '"'){
						cells[row][column] = new TextCell(input[2].substring(1, input[2].length()-1));
					} else if (input[2].charAt(0) == '(' && input[2].charAt(input[2].length()-1) == ')'){
						cells[row][column] = new FormulaCell(input[2]);
					} else if(input[2].substring(input[2].length()-1).equals("%")){
						cells[row][column] = new PercentCell(input[2]);
					} else
						cells[row][column] = new ValueCell(input[2]);
				}else if (input[0].equalsIgnoreCase("clear")){
					SpreadsheetLocation location = new SpreadsheetLocation(input[1]);
					cells[location.getRow()][location.getCol()] = new EmptyCell();
					return getGridText();
				}
			}
		return getGridText();
		} else if (command.equalsIgnoreCase("clear")){
			for( int i = 0; i < cells.length; i++){
				for (int j = 0; j < cells[i].length; j++){
					cells[i][j] = new EmptyCell();
				}
			}
			return getGridText();
		}
		else if(command.length() < 5){
			SpreadsheetLocation location = new SpreadsheetLocation(command);
			return (getCell(location).fullCellText());
		} 
		return getGridText();
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
	public Cell getCell(Location location){
		return cells [location.getRow()][location.getCol()];
	}

	@Override
	public String getGridText(){
		String spreadsheet = "   |";
		char letter = 'A';
		for(int i=0; i < 12; i++){
			spreadsheet = spreadsheet + ((char)(letter)) + "         |";
			letter++;
		}
		spreadsheet = spreadsheet + "\n";
		for(int i = 0; i<20;i++){
			if (i<9){
				spreadsheet += (i+1) + "  |";
			}else{
				spreadsheet += (i+1) + " |";
			}
			for(int j = 0; j < 12; j++){
				spreadsheet += cells[i][j].abbreviatedCellText() + "|";
			}
			spreadsheet += "\n";
		}
		return spreadsheet;
	}

}
