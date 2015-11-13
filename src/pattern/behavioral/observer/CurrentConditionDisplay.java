package pattern.behavioral.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current condition: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void udpate(float temperature, float humidity, float presure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
