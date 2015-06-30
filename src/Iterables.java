package HW2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Iterables
 */
public class Iterables {
	/**
	 * უზრუნველყოფს a და b მიმდევრობების გადაბმას, შედეგად უნდა მიიღოთ ახალი
	 * მიმდევრობა, რომელიც იწყება a და სრულდება b-ს მიმდევრობის ელემენტებით
	 * 
	 * @param a
	 *            მიმდევრობა
	 * @param b
	 *            მიმდევრობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> chain(Iterable<T> a, Iterable<T> b) {

		return new ChainIterable<T>(a, b);
	}

	/**
	 * დააბრუნებს მიმდევრობის პირველ n ელემენტს
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param n
	 *            ელემენტების რაოდენობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> take(Iterable<T> iterable, int n) {

		return new TakeIterable<T>(iterable, n);
	}

	/**
	 * დააბრუნებს მიმდევრობის ყველა ელემენტებს გარდა პირველი n ელემენტისა
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param n
	 *            გამოსატოვებელი ელემენტების რაოდენობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> skip(Iterable<T> iterable, int n) {
		return new SkipIterable<T>(iterable, n);
	}

	/**
	 * დააბრუნებს მიმდევრობის საწყის ელემენტებს, მანამ სანამ სრულდება predicate
	 * პირობა
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param predicate
	 *            პირობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მირებული მიმდევრობა
	 */
	public static <T> Iterable<T> takeWhile(Iterable<T> iterable,
			Predicate<T> predicate) {
		return new TakeWhileIterable<T>(iterable, predicate);
	}

	/**
	 * გამოტოვებს მიმდევრობის საწყის ელემენტებს, მანამ სანამ სრულდება predicate
	 * პირობა და დააბრუნებს დარჩენილ ელემენტებს
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param predicate
	 *            პირობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> skipWhile(Iterable<T> iterable,
			Predicate<T> predicate) {
		return new SkipWhileIterable<T>(iterable, predicate);
	}

	/**
	 * დააბრუნებს მიმდევრობის იმ ელემენტებს, რომლებიც აკმაყოფილებს predicate-ს
	 * პირობას
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param predicate
	 *            პირობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> filter(Iterable<T> iterable,
			Predicate<T> predicate) {
		return new FilterIterable<T>(iterable, predicate);
	}

	/**
	 * უზრუნველყოფს მოცემული მიმდევრობის ელემენტების ასახავს (mapper-ს
	 * გამოყენებით) და მიღებული შედეგების მიმდევრობის დაბრუნებას
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param mapper
	 *            ასახვა
	 * @param <TFrom>
	 *            საწყისი მიმდევრობის ელემენტების ტიპი
	 * @param <TTo>
	 *            მიღებული მიმდევრობის ელემენტის ტიპი
	 * @return მიმრებული მიმდევრობა
	 */
	public static <TFrom, TTo> Iterable<TTo> map(Iterable<TFrom> iterable,
			Mapper<TFrom, TTo> mapper) {
		
		return new MapIterable(iterable, mapper);
	}

	/**
	 * უზრუნველყოფს მიმდევრობის ელემენტების შებრუნებული რიგით დაბრუნებას
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> reverse(Iterable<T> iterable) {
		return new ReverseIterable<T>(iterable);
	}

	/**
	 * დააბრუნებს მიმდევრობის განსხვავებულ ელემენტებს
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> distinct(Iterable<T> iterable) {
		return new DistinctIterable<T>(iterable);
	}

	/**
	 * დააბრუნებს ორი მიმდევრობის ელემენტებისგან შედგენილი სიმრავლეების
	 * გაერთიანებას მიმდევრობის სახით
	 * 
	 * @param a
	 *            მიმდევრობა
	 * @param b
	 *            მიმდევრობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> union(Iterable<T> a, Iterable<T> b) {
		return new DistinctIterable(new ChainIterable(a, b));
	}

	/**
	 * დააბრუნებს ორი მიმდევრობის ელემენებისგან შედგენილი სიმრავლეების
	 * თანაკვეთას მიმდევრობის სახით
	 * 
	 * @param a
	 *            მიმდევრობა
	 * @param b
	 *            მიმდევრობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> intersect(Iterable<T> a, Iterable<T> b) {
		Iterator<T> first = new DistinctIterable(a).iterator();
		Iterator<T> second = new DistinctIterable(b).iterator();
		Set<T> s1 = new HashSet<T>();
		Set<T> s2 = new HashSet<T>();
		while(first.hasNext()){
			s1.add(first.next());
		}
		while(second.hasNext()){
			s2.add(second.next());
		}
		s1.retainAll(s2);
		return s1;
	}

	/**
	 * დააბრუნებს a მიმდევრობის იმ ელემენტებისგან შედგენილ მიმდევრობას, რომლებიც
	 * არ გვხვდება b-ში
	 * 
	 * @param a
	 *            მიმდევრობა
	 * @param b
	 *            მიმდევრობა
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> except(Iterable<T> a, Iterable<T> b) {
		Iterator<T> first = new DistinctIterable(a).iterator();
		Iterator<T> second = new DistinctIterable(b).iterator();
		Set<T> s1 = new HashSet<T>();
		Set<T> s2 = new HashSet<T>();
		while(first.hasNext()){
			s1.add(first.next());
		}
		while(second.hasNext()){
			s2.add(second.next());
		}
		s1.removeAll(s2);
		return s1;
	}

	/**
	 * დააბრუნებს მთელი რიცხვების ზრდად (ბიჯი 1) მიმდევრობას რომელიც დაიწყება
	 * start-ით და დასრულდება end -ით. იმ შემთხვევაში თუ end < start-ზე უნდა
	 * დაბრუნდეს კლებადი მიმდევრობა (ბიჯი -1)
	 * 
	 * @param start
	 *            საწყისი ელემენტი
	 * @param end
	 *            ბოლო ელემენტი
	 * @return მიღებული მიმდევრობა
	 */
	public static Iterable<Integer> range(int start, int end) {
		Iterable<Integer> res = new RangeIterable(start, end);
		if(start > end){
			return reverse(res);
		}else
			return res;
	}

	/**
	 * დააბრუნებს მიმდევრობას რომელიც მიიღება value-ს n-ჯერ გამეორებით
	 * 
	 * @param value
	 * @param count
	 * @param <T>
	 * @return
	 */
	public static <T> Iterable<T> repeat(T value, int n) {
		return new RepeatIterable(value, n);
	}

	/**
	 * დააბრუნებს მიმდევრობას რომლიც იწყება iterable მიმდევრობის ელემენტებით და
	 * ბოლოვდება value-თი
	 * 
	 * @param iterable
	 *            მიმდევრობა
	 * @param value
	 *            შედეგის ბოლო ელემენტი
	 * @param <T>
	 *            მიმდევრობის ელემენტების ტიპი
	 * @return მიღებული მიმდევრობა
	 */
	public static <T> Iterable<T> follow(Iterable<T> iterable, T value) {
		ArrayList<T> values = new ArrayList<T>();
		values.add(value);
		return chain(iterable, values);
	}

}