package HW2;

import java.util.Iterator;

public class DistinctIterable<T> implements Iterable<T> {
	Iterable<T> a;
	public DistinctIterable(Iterable<T> a){
		this.a = a;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new DistinctIterator(a);
	}
}
