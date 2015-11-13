package pattern.behavioral.command;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private String location;
	private int speed;
	
	public CeilingFan(String roomName) {
		this.location = roomName;
		this.speed = OFF;
	}
	
	public void high() {
		this.speed = HIGH;
		System.out.println(this.location + " ceiling fan is on high");
	}
	
	public void medium() {
		this.speed = MEDIUM;
		System.out.println(this.location + " ceiling fan is on medium");
	}
	
	public void low() {
		this.speed = LOW;
		System.out.println(this.location + " ceiling fan is on low");
	}
	
	public void on() {
		System.out.println(location + " seiling fan is on");
	}
	
	public void off() {
		this.speed = OFF;
		System.out.println(location + " seiling fan is off");
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
