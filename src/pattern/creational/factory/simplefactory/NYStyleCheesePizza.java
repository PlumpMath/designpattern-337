package pattern.creational.factory.simplefactory;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NYStyle Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Souce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
