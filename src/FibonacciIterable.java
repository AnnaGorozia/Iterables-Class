package HW2;

import java.util.Iterator;

public class FibonacciIterable implements Iterable {
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new FibonacciIterator();
	}
}
