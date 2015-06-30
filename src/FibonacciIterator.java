package HW2;

import java.util.Iterator;

public class FibonacciIterator implements Iterator {
	int prev1;
	int prev2;
	int curr;
	public FibonacciIterator(){
		this.prev1 = 0;
		this.prev2 = 1;
		this.curr = 1;
	}
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		curr = prev1+prev2;
		prev1 = prev2;
		prev2 = curr;
		return prev1;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
