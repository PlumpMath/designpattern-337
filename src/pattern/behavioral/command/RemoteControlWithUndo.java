package pattern.behavioral.command;

public class RemoteControlWithUndo {
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	public RemoteControlWithUndo() {
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		this.onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		this.offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPressed() {
		this.undoCommand.undo();
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n ------ Remote Control ------ \n");
		for (int i=0; i<onCommands.length; i++){
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
					+"    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
