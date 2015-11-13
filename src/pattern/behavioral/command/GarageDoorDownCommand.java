package pattern.behavioral.command;

public class GarageDoorDownCommand implements Command {
	private GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.down();
	}

	@Override
	public void undo() {
		this.garageDoor.up();
	}

}
