package HW2;

public interface Mapper<TFrom,TTo> {
    /**
     * ასახვა
     * @param from
     * @return
     */
    public TTo map(TFrom from);
}

