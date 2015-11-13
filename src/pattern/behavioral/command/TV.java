package pattern.behavioral.command;

public class TV {
	private String location;
	
	public TV(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(this.location + " TV is on");
	}
	
	public void off() {
		System.out.println(this.location + " TV is off");
	}
}
