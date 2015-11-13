package pattern.behavioral.command;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoWithCD, stereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);
		
		System.out.println("1-------------------------------");
		
		RemoteControlWithUndo remoteControl2 = new RemoteControlWithUndo();
		
		remoteControl2.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControl2.onButtonWasPressed(0);
		remoteControl2.offButtonWasPressed(0);
		remoteControl2.undoButtonWasPressed();
		
		System.out.println("2------------------------------");
		
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		
		remoteControl2.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl2.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		remoteControl2.onButtonWasPressed(0);
		remoteControl2.offButtonWasPressed(0);
		System.out.println(remoteControl2);
		remoteControl2.undoButtonWasPressed();
		remoteControl2.onButtonWasPressed(1);
		remoteControl2.undoButtonWasPressed();
		
		System.out.println("3-----------------------------");
		TV livingRoomTV = new TV("Living Room");
		Stereo livingRoomStereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		StereoOnCommand stereoOn = new StereoOnCommand(livingRoomStereo);
		TVOnCommand tvOn = new TVOnCommand(livingRoomTV);
		TVOffCommand tvOff = new TVOffCommand(livingRoomTV);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		HottubOffCommand huttubOff = new HottubOffCommand(hottub);
		
		Command[] partyOn = {livingRoomLightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = {livingRoomLightOff, stereoOff, tvOff, huttubOff};
		
		MacroCommand partyOnCommand = new MacroCommand(partyOn);
		MacroCommand partyOffCommand = new MacroCommand(partyOff);
		
		remoteControl = new RemoteControl();
		remoteControl.setCommand(0, partyOnCommand, partyOffCommand);
		
		System.out.println(remoteControl);
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
	}
}
