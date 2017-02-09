public abstract class Ticket {
	private int ticketNumber;
	double price = 50.0;
	public Ticket(int number){
		ticketNumber=getNextTicketNumber();
	}
	public abstract double getPrice();
	public String toString(){
		return "Number: " + ticketNumber + ", Price: " + price;
	}
	private int getNextTicketNumber(){
		return ticketNumber;
		
	}
}


public class WalkUpTicket extends Ticket{
	public double getPrice(){
		price = super.price;
	}
}
	

public class AdvanceTicket extends Ticket{
	int daysBefore = 0;
	double price = 0.0;
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


public class StudentAdvanceTicket extends AdvanceTicket{
	private double price;
	public void studentAdvanceTicket(int daysBefore){
		daysBefore=super.daysInAdvance;
	}
	public String toString(){
		return super.toString();
	}
	public double getPrice(){
		price=(super.getPrice())/2;
		return price;
	}
}