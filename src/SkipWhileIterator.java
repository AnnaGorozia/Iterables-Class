package HW2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SkipWhileIterator<T> implements Iterator<T> {
	Iterator<T> a;
	Predicate<T> predicate;
	T elem;
	boolean hasNext;
	boolean firstIt;

	public SkipWhileIterator(Iterable<T> a, Predicate<T> predicate) {
		this.a = a.iterator();
		this.predicate = predicate;
		this.elem = null;
		hasNext = false;
		firstIt = true;
	}

	@Override
	public boolean hasNext() {
		if (firstIt) {
			while (a.hasNext()) {
				elem = a.next();
				if (!predicate.check(elem)) {
					hasNext = true;
					firstIt = false;
					break;
				} 
			}
		} else {
			if (a.hasNext()){
				elem = a.next();
				hasNext = true;
			}else
				hasNext = false;
		}
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
