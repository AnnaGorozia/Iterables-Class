package HW2;

import java.util.Iterator;

public class ChainIterable<T> implements Iterable<T>{
	Iterable<T> a;
	Iterable<T> b;
	public ChainIterable(Iterable<T> a, Iterable<T> b){
		this.a = a;
		this.b = b;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ChainIterator(a,b);
	}

}
