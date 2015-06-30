package HW2;

import java.util.Iterator;

public class RepeatIterable<T> implements Iterable<T> {
	T a;
	int n;
	public RepeatIterable(T a, int n){
		this.a = a;
		this.n = n;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new RepeatIterator(a, n);
	}
}