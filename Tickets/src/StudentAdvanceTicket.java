public class StudentAdvanceTicket extends AdvanceTicket{
	public StudentAdvanceTicket(int ticketNumber, int daysBefore){
		super(ticketNumber, daysBefore);
		super.setPrice(25.0);
		if(daysBefore >= 10){
			super.setPrice(15.0);
		}else{
			super.setPrice(20.0);
		}
	}
}
