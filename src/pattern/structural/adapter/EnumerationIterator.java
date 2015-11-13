package pattern.structural.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {
	private Enumeration<?> aenum;
	
	public EnumerationIterator(Enumeration<?> aenum) {
		this.aenum = aenum;
	}

	@Override
	public boolean hasNext() {
		return aenum.hasMoreElements();
	}

	@Override
	public Object next() {
		return aenum.nextElement();
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
