package pattern.behavioral.command;

public class Stereo {
	private int volume;
	private String roomName;
	
	public Stereo() {}
	
	public Stereo(String roomName) {
		this.roomName = roomName;
	}
	
	public void on() {
		System.out.println(this.roomName + " " +" Stereo is on");
	}
	
	public void off() {
		System.out.println(this.roomName + " " +" Stereo is off");
	}
	
	public void setCD() {
		System.out.println(this.roomName + " " +" Stereo is set for CD input");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(this.roomName + " " +" Stereo volume is set to " + this.volume);
	}
}
