package HW2;

import java.util.Iterator;

public class ChainIterator<T> implements Iterator<T> {
	Iterator<T> a;
	Iterator<T> b;
	boolean hasNext;
	public ChainIterator(Iterable<T> a, Iterable<T> b){
		this.a = a.iterator();
		this.b = b.iterator();
		hasNext = false;
	}
	
	@Override
	public boolean hasNext() {
		if(a.hasNext() || b.hasNext())
			hasNext = true;
		else
			hasNext = false;
		return hasNext;
	}

	@Override
	public T next() {
		T elem = null;
		if(a.hasNext()){
			elem = a.next();
		}else if(b.hasNext()){
			elem = b.next();
		}
		return elem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
