package exercise.ch21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex06 implements Runnable{
	
	private static int taskcount = 0;
	private final int taskid = taskcount++;
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++)
			es.execute(new Ex06());
		es.shutdown();
	}

	@Override
	public void run() {
		Random random = new Random();
		int second = random.nextInt(9)+1;
		try{
//			System.out.println("task "+taskid+" sleep for "+second+" seconds.");
			TimeUnit.MILLISECONDS.sleep(second*1000);
		}catch (InterruptedException e) {
			System.err.println(e);
		}
		System.out.println("task "+taskid+" sleep for "+second+" seconds over.");
	}

}
