package HW2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class RangeIterator implements Iterator {
	int start;
	int end;
	int elem;
	int range;
	boolean hasNext;
	public RangeIterator(int start, int end) {
		this.hasNext = false;
		this.start = start;
		this.end = end;
		
		if(end < start){
			this.start = end;
			this.end = start;
		}
		this.elem = this.start-1;
		this.range = Math.abs(this.start - this.end)+1;
	}

	@Override
	public boolean hasNext() {
		if(range != 0){
			elem++;
			range--;
			hasNext = true;
		}else{
			hasNext = false;
		}
		return hasNext;
	}

	@Override
	public Integer next() {
		if (hasNext){
			return elem;
		}else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
