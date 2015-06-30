package HW2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SkipIterator<T> implements Iterator<T> {
	Iterator<T> a;
	int n;
	T elem;
	boolean hasNext;
	public SkipIterator(Iterable<T> a, int n){
		this.a = a.iterator();
		this.elem = null;
		while(this.a.hasNext() && n != 0){
			this.a.next();
			n--;
		}
		hasNext = false;
	}
	
	@Override
	public boolean hasNext() {
		if(a.hasNext()){
			hasNext = true;
			elem = a.next();
		}else
			hasNext = false;
		return hasNext;
	}

	@Override
	public T next() {
		if(hasNext)
			return elem;
		else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
