package HW2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TakeIterator <T> implements Iterator<T> {
	Iterator<T> a;
	int n;
	T elem;
	boolean hasNext;
	public TakeIterator(Iterable<T> a, int n){
		this.a = a.iterator();
		this.n = n;
		this.elem = null;
		hasNext = false;
	}
	
	@Override
	public boolean hasNext() {
		if(a.hasNext() && n > 0){
			hasNext = true;
			elem = a.next();
			n--;
		}else
			hasNext = false;
		return hasNext;
	}

	@Override
	public T next() {
		if(hasNext){
			return elem;
		}else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
