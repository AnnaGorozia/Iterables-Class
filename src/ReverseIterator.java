package HW2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseIterator<T> implements Iterator<T> {
	Iterator<T> a;
	boolean hasNext;

	public ReverseIterator(Iterable<T> a) {
		this.a = a.iterator();
		ArrayList<T> list = new ArrayList<T>();
		while(this.a.hasNext()){
			list.add(this.a.next());
		}
		Collections.reverse(list);
		this.a = list.iterator();
		hasNext = false;
	}

	@Override
	public boolean hasNext() {
		
		return a.hasNext();
	}

	@Override
	public T next() {
		if (a.hasNext())
			return a.next();
		else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
