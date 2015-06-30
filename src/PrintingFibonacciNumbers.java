package HW2;

import java.util.Iterator;

public class PrintingFibonacciNumbers {
	public static void main(String[] args) {
		Iterator<Integer> list = Iterables.take(new FibonacciIterable(), 10)
				.iterator();
		System.out.println("First 10 Fibonacci numbers are:");
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		
		list = Iterables.take(Iterables.reverse(Iterables.take(new FibonacciIterable(), 15)),6).iterator();
		System.out.println("Fibonacci numbers from 15th to 10th");
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
