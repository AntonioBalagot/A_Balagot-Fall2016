public class AdvanceTicket extends Ticket{
		int daysBefore = 0;
		double price = 0.0;
		public AdvanceTicket(int ticketNumber, int daysBefore){
			this.ticketNumber=ticketNumber;
		}
		public int daysInAdvance;
		public void daysInAdvance(int daysBefore){
			if(daysBefore > 9){
				price = 30.0;
			}else{
				price = 40.0;
			}
		}
		public double getPrice(){
			return price;
		}
}
