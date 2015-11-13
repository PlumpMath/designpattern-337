package pattern.behavioral.command;

public class GarageDoor {
	private String name;
	
	public GarageDoor() {}
	
	public GarageDoor(String name) {
		this.name = name;
	}
	
	public void open() {
		System.out.println(this.name + " " + "Garage Door is Open");
	}
	
	public void close() {
		System.out.println(this.name + " " + "Garage Door is Closed");
	}
	
	public void up() {
		System.out.println(this.name + " " + "Garage door is up");
	}
	
	public void down() {
		System.out.println(this.name + " " + "Garage door is down");
	}
}
