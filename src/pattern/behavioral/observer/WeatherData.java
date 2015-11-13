package pattern.behavioral.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = this.observers.indexOf(o);
		if (i >= 0) {
			this.observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i<this.observers.size(); i++) {
			Observer observer = this.observers.get(i);
			observer.udpate(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temparature, float humidity, float pressure) {
		this.temperature = temparature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
