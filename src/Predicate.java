package HW2;

public interface Predicate<T>{
    /**
     * კრიტერიუმი
     * @param value
     * @param <T>
     * @return
     */
	public <T> boolean check(T value);

}