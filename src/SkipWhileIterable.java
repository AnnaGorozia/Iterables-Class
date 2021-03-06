package HW2;

import java.util.Iterator;

public class SkipWhileIterable<T> implements Iterable<T> {
	Iterable<T> a;
	Predicate<T> predicate;
	public SkipWhileIterable(Iterable<T> a, Predicate<T> predicate){
		this.a = a;
		this.predicate = predicate;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new SkipWhileIterator(a, predicate);
	}
}

