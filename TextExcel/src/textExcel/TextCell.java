package textExcel;

public class TextCell implements Cell {
	String text;
	public TextCell(){}
	//textCell = the text put in a cell
	public void setText(String textCell){
		textCell = text;
	}

	@Override
	public String abbreviatedCellText() {
		String text = "";
		setText(text);
		return (text + "         ").substring(0,9);
	}

	@Override
	public String fullCellText() {
		String textCell = "";
		setText(textCell);
		return textCell;
	}

}
