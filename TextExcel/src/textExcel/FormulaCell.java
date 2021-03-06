package textExcel;

public class FormulaCell extends RealCell {
	private String formula;
	public FormulaCell (String input){
		super(input);
		formula = input;
	}
	
	public double getDoubleValue(){
		int operator = 2;
		String[] split = formula.split(" ");
		double result = Double.parseDouble(split[1]);
		for(int i = 1; i<split.length-1; i+=2){
			if(operator < split.length){
				if(split[operator].equals(("+"))){
					double operand = Double.parseDouble(split[i+2]);
					result = result + operand;
					operator = operator + 2;
				}else if(split[operator].equals(("-"))){
					double operand = Double.parseDouble(split[i+2]);
					result = result - operand;
					operator = operator + 2;
				}else if(split[operator].equals(("*"))){
					double operand = Double.parseDouble(split[i+2]);
					result = result * operand;
					operator = operator + 2;
				}else if(split[operator].equals(("/"))){
					double operand = Double.parseDouble(split[i+2]);
					result = result / operand;
					operator = operator + 2;
				}
			}
		}
		return result;
	}
		
	
	public String abbreviatedCellText(){
		return (getDoubleValue() + "               ").substring(0,10);
		
	}
	
	public String fullCellText(){
		return formula;
}
}
