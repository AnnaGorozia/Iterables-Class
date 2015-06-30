package HW2;

import java.util.Iterator;

public class ReverseIterable<T> implements Iterable<T> {
	Iterable<T> a;
	public ReverseIterable(Iterable<T> a){
		this.a = a;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ReverseIterator(a);
	}
}
