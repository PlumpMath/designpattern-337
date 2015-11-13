package pattern.structural.decorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	public Mocha (Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + this.beverage.cost();
	}

}
