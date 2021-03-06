package textExcel;

public class RealCell implements Cell {
	private String num;
	public RealCell(String input){
		num=input;
	}
	
	public String getNum(){
		return num;
	}

	@Override
	public String abbreviatedCellText() {
		return (num + "                   ").substring(0,10);
	}

	@Override
	public String fullCellText() {
		return num;
	}
	
	public double getDoubleValue(){
		return Double.parseDouble(num);
	}
}