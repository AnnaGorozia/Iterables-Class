package HW2;

import java.util.Iterator;

public class MapIterator<TTo, TFrom> implements Iterator<TTo> {
	Iterator<TFrom> iter;
	Mapper<TFrom, TTo> mapper;

	public MapIterator(Iterable<TFrom> iterable, Mapper<TFrom, TTo> mapper) {
		this.mapper = mapper;
		this.iter = iterable.iterator();
	}

	@Override
	public boolean hasNext() {
		return iter.hasNext();
	}

	@Override
	public TTo next() {
		return mapper.map(iter.next());
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
