package HW2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class RepeatIterator<T> implements Iterator<T> {
	T a;
	T elem;
	boolean hasNext;
	int n;

	public RepeatIterator(T a, int n) {
		this.n = n;
		hasNext = false;
		this.elem = a;
	}

	@Override
	public boolean hasNext() {
		if(n > 0){
			hasNext = true;
			n--;
		}else if(n==0){
			hasNext = false;
		}
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
