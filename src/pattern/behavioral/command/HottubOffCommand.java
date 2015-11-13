package pattern.behavioral.command;

public class HottubOffCommand implements Command {
	private Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		this.hottub.off();
	}

	@Override
	public void undo() {
		this.hottub.on();
	}

}
