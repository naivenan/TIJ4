package exercise.ch21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex04 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i=1;i<6;i++)
			es.execute(new Ex02(i));
		es.shutdown();
		ExecutorService es1 = Executors.newFixedThreadPool(5);
		for(int i=6;i<11;i++)
			es1.execute(new Ex02(i));
		es1.shutdown();
		ExecutorService es2 = Executors.newSingleThreadExecutor();
		for(int i=11;i<16;i++)
			es2.execute(new Ex02(i));
		es2.shutdown();
	}

}
