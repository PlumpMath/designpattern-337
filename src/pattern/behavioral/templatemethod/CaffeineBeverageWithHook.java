package pattern.behavioral.templatemethod;

public abstract class CaffeineBeverageWithHook {
	protected void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	protected abstract void brew();
	
	protected abstract void addCondiments();
	
	protected void boilWater() {
		System.out.println("Boiling water");
	}
	
	protected void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	protected boolean customerWantsCondiments() {
		return true;
	}
}
