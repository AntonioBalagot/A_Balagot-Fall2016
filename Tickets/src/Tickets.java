
public abstract class Tickets {
	int number;
	double price = 50.0;
	public void Ticket(int number){
		this.number=number;
	}
	public double getPrice(){
		return this.price;
	}
	public String toString(){
		return "Number: " + number + ", Price: " + price;
	}
	
	

}