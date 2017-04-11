package textExcel;

public class ValueCell extends RealCell {
	public ValueCell(String input){
		super(input);
	}
	public double getDoubleValue(){
		String value = getNum();
		double number = Double.parseDouble(value);
		return number;
	}
	public String abbreviatedCellText(){
		String value = getNum();
		double decimal = Double.parseDouble(value);
		value = decimal + "";
		if(value.indexOf(".") == -1){
			value += ".0";
		}
		return (value + "             ").substring(0, 10);
	}
	public String fullCellText(){
		return super.fullCellText();
	}
	
}
