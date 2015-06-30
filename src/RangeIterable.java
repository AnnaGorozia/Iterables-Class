package HW2;

import java.util.Iterator;

public class RangeIterable implements Iterable {
	int start;
	int end;
	public RangeIterable(int start, int end){
		this.start = start;
		this.end = end;
	}
	@Override
	public Iterator iterator() {
		
		return new RangeIterator(start, end);
	}
}