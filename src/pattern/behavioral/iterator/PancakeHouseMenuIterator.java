package pattern.behavioral.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	private ArrayList items;
	private int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem)items.get(position);
		position = position + 1;
		return menuItem;
	}

}
