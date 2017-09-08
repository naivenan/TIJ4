package exercise.ch10;

public class Ex21 implements Imp{
	@Override
	public void f() {
		System.out.println("Ex21.f()");
	}
	public static void main(String[] args) {
		Imp.Test.show(new Ex21());
	}
	
}

interface Imp {
	void f();
	class Test implements Imp{
		@Override
		public void f() {
			System.out.println("Imp.Test.f()");
		}
		public static void show(Ex21 ex) {
			ex.f();
		}
	}
}