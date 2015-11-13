package pattern.creational.factory.factorymethod;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Souce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
