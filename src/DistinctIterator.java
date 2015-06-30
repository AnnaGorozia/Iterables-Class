package HW2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class DistinctIterator<T> implements Iterator<T> {
	Iterator<T> a;
	Set<T> elems;
	T elem;
	boolean hasNext;

	public DistinctIterator(Iterable<T> a) {
		this.a = a.iterator();
		this.elems = new HashSet<T>();
		hasNext = false;
		this.elem = null;
	}

	@Override
	public boolean hasNext() {
		if (a.hasNext()) {
			while (a.hasNext()) {
				elem = a.next();
				if (!elems.contains(elem)) {
					hasNext = true;
					elems.add(elem);
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
		if (hasNext){
			return elem;
		}else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
