package exercise.ch7;

import static exercise.util.Print.*;

public class Ex05 extends A{
	private B b = new B(1);
	public Ex05() {
		super(1);
		print("Ex05 constructor");
	}
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
	}

}

class A{
	A(int i) {
		print("A constructor");
	}
}

class B{
	B(int i){
		print("B constructor");
	}
}