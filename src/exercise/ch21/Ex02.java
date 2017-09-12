package exercise.ch21;

import java.util.Arrays;

import exercise.util.Generator;

public class Ex02 implements Generator<Integer>, Runnable{
	private int n;
	private int count = 0;
	
	public Ex02(int n) {
		this.n = n;
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
			new Thread(new Ex02(i)).start();
	}

	@Override
	public void run() {
		Integer[] array = new Integer[n];
		for(int i=0;i<n;i++)
			array[i] = next();
		System.out.println("sequence "+n+" : "+Arrays.asList(array));
	}

	@Override
	public Integer next() {
		return fib(count++);
	}

	private int fib(int n) {
	    if(n < 2) return 1;
	    return fib(n-2) + fib(n-1);
	}
	
}
