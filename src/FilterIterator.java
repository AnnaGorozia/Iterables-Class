package HW2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FilterIterator<T> implements Iterator<T> {
	Iterator<T> a;
	Predicate<T> predicate;
	T elem;
	boolean hasNext;

	public FilterIterator(Iterable<T> a, Predicate<T> predicate) {
		this.a = a.iterator();
		this.predicate = predicate;
		this.elem = null;
		hasNext = false;
	}

	@Override
	public boolean hasNext() {
		if (a.hasNext()) {
			while (a.hasNext()) {
				elem = a.next();
				if (predicate.check(elem)) {
					hasNext = true;
					break;
				} else {
					hasNext = false;
				}
			}
		} else
			hasNext = false;
		return hasNext;
	}

	@Override
	public T next() {
		if (hasNext)
			return elem;
		else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
