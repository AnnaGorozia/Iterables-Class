package HW2;

import java.util.Iterator;

public class SkipIterable<T> implements Iterable<T> {
	Iterable<T> a;
	int n;
	public SkipIterable(Iterable<T> a, int n){
		this.a = a;
		this.n = n;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new SkipIterator(a, n);
	}
}
