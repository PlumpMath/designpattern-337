package pattern.creational.singleton;

public class LockWithDoubleCheckSingleton {
	private volatile static LockWithDoubleCheckSingleton uniqueInstance;
	
	private LockWithDoubleCheckSingleton() {}
	
	public static LockWithDoubleCheckSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (LockWithDoubleCheckSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new LockWithDoubleCheckSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
// volatile 关键字对于Java1.4及更早的版本不适用