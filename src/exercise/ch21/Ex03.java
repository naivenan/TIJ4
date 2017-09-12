package exercise.ch21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex03 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			es.execute(new Ex01());
		es.shutdown();
		ExecutorService es1 = Executors.newFixedThreadPool(5);
		for(int i=0;i<5;i++)
			es1.execute(new Ex01());
		es1.shutdown();
		ExecutorService es2 = Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++)
			es2.execute(new Ex01());
		es2.shutdown();
	}

}
