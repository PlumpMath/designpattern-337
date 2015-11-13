package pattern.behavioral.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		LightOnCommand lighOn = new LightOnCommand(light);
		remote.setCommand(lighOn);
		remote.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
	}
}
