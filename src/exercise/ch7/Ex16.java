package exercise.ch7;

import static exercise.util.Print.*;

public class Ex16 extends Amphibian{

	private final int i;
	public Ex16() {
		i = 10;
	}
	@Override
	public void cry() {
		print("Frog cry");
	}
	public static void main(String[] args) {
		Amphibian w = new Ex16();
		w.cry();
	}

}

class Amphibian{
	public void cry(){
		print("Amphibian cry");
	}
	final void f(){
		print("Amphibian f()");
	}
}