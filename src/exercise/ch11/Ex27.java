package exercise.ch11;

import java.util.LinkedList;
import java.util.Queue;

public class Ex27 {

	public static void main(String[] args) {
		Queue<Command> q = new LinkedList<>();
		for(int i=0;i<10;i++){
			Fill.fill(q, new Command(String.valueOf(i)));
		}
		Empty.empty(q);
	}

}

class Command{
	private String s;
	public Command(String string) {
		s = string;
	}
	public void operation(){
		System.out.print(s+" ");
	}
}

class Fill{
	public static Command fill(Queue<Command> q,Command c){
		q.offer(c);
		return c;
	}
}

class Empty{
	public static void empty(Queue<Command> q){
		while(q.peek() != null){
			q.remove().operation();
		}
	}
}