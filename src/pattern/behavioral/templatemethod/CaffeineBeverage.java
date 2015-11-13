package pattern.behavioral.templatemethod;

public abstract class CaffeineBeverage {
	protected final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	protected void boilWater() {
		System.out.println("Boiling water");
	}
	
	protected void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
