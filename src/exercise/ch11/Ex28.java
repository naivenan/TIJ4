package exercise.ch11;

import java.util.PriorityQueue;
import java.util.Random;

public class Ex28 {

	public static void main(String[] args) {
		Random random = new Random(47);
		PriorityQueue<Double> pq = new PriorityQueue<>();
		for(int i=0;i<10;i++){
			pq.offer(random.nextDouble()*10);
		}
		while(pq.peek()!=null){
			System.out.printf("%.3f ", pq.poll());
		}
	}

}