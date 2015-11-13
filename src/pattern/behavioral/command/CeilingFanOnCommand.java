package pattern.behavioral.command;

public class CeilingFanOnCommand implements Command {
	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanOnCommand(CeilingFan seilingFan) {
		this.ceilingFan = seilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		this.ceilingFan.on();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
