package pattern.creational.singleton;

public class EagerlyCreationSingleton {
	private static EagerlyCreationSingleton uniqueInstance = new EagerlyCreationSingleton();
	
	private EagerlyCreationSingleton() {}
	
	public synchronized EagerlyCreationSingleton getInstance() {
		return uniqueInstance;
	}
}
