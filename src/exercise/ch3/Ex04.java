package exercise.ch3;

import java.util.Random;
import static exercise.util.Print.*;

public class Ex04 {

	public static void main(String[] args) {
		Random random = new Random(37);
		int distance,time;
		double speed;
		distance = random.nextInt(1000);
		time = random.nextInt(1000)+1;
		speed = distance*1.0/time;
		print("距离 : "+distance);
		print("时间 : "+time);
		print("速度 : "+speed);
	}

}
