public class AdvanceTicket extends Ticket{
	int daysBefore = 0;
	double price = 0.0;
	public AdvanceTicket(int ticketNumber, int daysBefore){
		super(ticketNumber);
		if(daysBefore >= 10){
			price = 30.0;
		}else{
			price = 40.0;
		}
	}
}
	
