package textExcel;

public class PercentCell extends RealCell {
	public PercentCell(String percent){
		super(percent);
	}
	
	
	public String abbreviatedCellText() {
		String num = getNum();
		if (num.indexOf(".") != -1){
			num = num.substring(0, num.indexOf(".")) + "%                    ";
		}
		return num.substring(0,10);
	}
	
	
	public String fullCellText() {
		return getDoubleValue() + "";
	}
	public double getDoubleValue(){
		String num = getNum();
		double percent = Double.parseDouble(num.substring(0,num.length()-1));
		return percent/100;
	}

}
