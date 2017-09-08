package exercise.ch7;

import static exercise.util.Print.*;

public class Ex13 extends Load{
	
	public void load(String s){
		print("load(String s)");
	}
	
	public static void main(String[] args) {
		Ex13 ex13 = new Ex13();
		ex13.load(1);
		ex13.load(1.0f);
		ex13.load(1.0);
		ex13.load("s");
	}

}

class Load{
	public void load(int i){
		print("load(int i)");
	}
	public void load(float i){
		print("load(float i)");
	}
	public void load(double i){
		print("load(double i)");
	}
}