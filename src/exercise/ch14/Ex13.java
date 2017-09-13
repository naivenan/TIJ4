package exercise.ch14;

import static exercise.util.Print.*;
import exercise.util.TypeCounter;

public class Ex13 {

	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Part.class);
		for(int i=0;i<10;i++){
			Part p = Part.createRandom();
			printnb(p.getClass().getSimpleName()+" ");
			counter.count(p);
		}
		print();
		print(counter);
	}

}
