package HW2;

import java.util.Iterator;

public class TakeIterable<T> implements Iterable<T>{
	Iterable<T> a;
	int n;
	public TakeIterable(Iterable<T> a, int n){
		this.a = a;
		this.n = n;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new TakeIterator(a, n);
	}

}
