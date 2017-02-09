public abstract class Ticket {
	private int ticketNumber;
	double price = 50.0;
	public Ticket(int number){
		this.ticketNumber=ticketNumber;
	}
	public double getPrice(){
		return this.price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String toString(){
		return "Number: " + ticketNumber + ", Price: " + price;
	}
}