package pattern.behavioral.command;

public class TVOnCommand implements Command {
	private TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.on();
	}

	@Override
	public void undo() {
		this.tv.off();
	}

}
