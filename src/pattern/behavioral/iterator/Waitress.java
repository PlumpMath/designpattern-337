package pattern.behavioral.iterator;

import java.util.Iterator;

public class Waitress {
	private MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetatianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nVEGETATIAN MENU\n----");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
				//System.out.println("UnsupportedOperationExcepiton caught");
			}
		}
	}
}
