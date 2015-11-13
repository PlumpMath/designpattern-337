package pattern.behavioral.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu{
	private Hashtable menuItems = new Hashtable();
	
	public CafeMenu(){
		addItem("Veggie Burger and Air Fries", "Veggie burger on a whole bun, lettuce, tomato, and fries",true, 3.69);
		addItem("Soup of the day", "A cup of the soup of the day, with a side salad",false, 3.69);
		addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole",true, 4.29);
	}
	
	public void addItem(String name, String description, 
			boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	/*  有了迭代器，这个方法就不需要了
	public Hashtable getItems() {
		return menuItems;
	}*/
	
}
