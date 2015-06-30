package HW2;

import java.util.Iterator;

public class MapIterable<TFrom, TTo> implements Iterable<TTo> {
	Iterable<TFrom> iterable;
	Mapper<TFrom, TTo> mapper;
	public MapIterable(Iterable<TFrom> iterable,
			Mapper<TFrom, TTo> mapper){
		this.iterable = iterable;
		this.mapper = mapper;
	}
	@Override
	public Iterator<TTo> iterator() {
		// TODO Auto-generated method stub
		return new MapIterator(iterable, mapper);
	}
}
