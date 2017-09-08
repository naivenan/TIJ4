package exercise.ch10;

public interface Ex20 {
	void f();
	class Test implements Ex20{
		@Override
		public void f() {
			System.out.println("Ex20.Test.f()");
		}
		public static void main(String[] args) {
			new Test().f();
		}
	}
}
