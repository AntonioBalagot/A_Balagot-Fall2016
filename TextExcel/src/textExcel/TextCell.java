package textExcel;

public class TextCell implements Cell {
	private String text;
	public TextCell(String insertText){
	//insertText = the text put into its cell
		text = insertText;
	}

	@Override
	public String abbreviatedCellText() {
		return (text + "                    ").substring(0,10);
	}

	@Override
	public String fullCellText() {
		return "\"" + text + "\"";
	}

}
