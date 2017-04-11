package textExcel;

public class TextCell implements Cell {
	private String text;
	public TextCell(String insertText){
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
