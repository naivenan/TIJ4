package exercise.ch3;

import java.util.Random;

import static exercise.util.Print.*;

public class Ex07 {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i=0;i<100;i++){
			int d = random.nextInt(100);
			printnb((d<50?"正面":"反面")+";");
		}
	}

}
