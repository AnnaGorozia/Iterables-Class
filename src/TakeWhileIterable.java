package HW2;

import java.util.Iterator;

public class TakeWhileIterable<T> implements Iterable<T> {
	Iterable<T> a;
	Predicate<T> predicate;
	public TakeWhileIterable(Iterable<T> a, Predicate<T> predicate){
		this.a = a;
		this.predicate = predicate;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new TakeWhileIterator(a, predicate);
	}
}
