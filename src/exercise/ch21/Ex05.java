package exercise.ch21;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex05 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		ArrayList<Future<Integer>> results = new ArrayList<>();
		for(int i=1;i<=10;i++)
			results.add(es.submit(new Fibonacci(i)));
		for(Future<Integer> r : results){
			try{
				System.out.println(r.get());
			}catch (InterruptedException e) {
				System.out.println(e);
				return;
			}catch (ExecutionException e) {
				System.out.println(e);
			}finally {
				es.shutdown();
			}
		}
	}

}
