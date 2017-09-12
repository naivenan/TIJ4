//: generics/Fibonacci.java
// Generate a Fibonacci sequence.
package exercise.ch21;

import java.util.concurrent.Callable;

import exercise.util.*;

public class Fibonacci implements Generator<Integer>, Callable<Integer> {
	private int count = 0;
	private int n;

	public Fibonacci(int n) {
		this.n = n;
	}

	public Integer next() {
		return fib(count++);
	}

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += next();
		return sum;
	}
} /*
	 * Output: 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
	 */// :~
