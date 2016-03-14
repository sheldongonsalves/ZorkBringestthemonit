
public class Room {

	public Room() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private double money;
	private String Message;
	private String things;
	public String getThings() {
		return things;
	}
	public void setThings(String things) {
		this.things = things;
	}
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		this.name = name1;
	}
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money1) {
		this.money = money1;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message1) {
		Message = message1;
	}
	public Room(String name1 ,double money1 ,String message1 ,String things1) {
		this.name = name1;
		this.money = money1;
		this.Message =message1;
		this.things = things1;
	}
	@Override
	public String toString() {
		return "Room [name=" + name + ", money=" + money + ", Message=" + Message
				+ ", things=" + things + "]";
	}
	
	

}
