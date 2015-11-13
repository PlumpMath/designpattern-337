package pattern.creational.singleton;

public class MultiThreadSingleton {
	private static MultiThreadSingleton uniqueInstance;
	
	private MultiThreadSingleton() {}
	
	public synchronized MultiThreadSingleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new MultiThreadSingleton();
		}
		return uniqueInstance;
	}
}
