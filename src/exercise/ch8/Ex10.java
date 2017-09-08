package exercise.ch8;

public class Ex10 {

	public static void main(String[] args) {
		A a = new B();
		a.f();
	}

}

class A{
	void f(){
		System.out.println("A.f()");
		g();
	}
	void g(){
		System.out.println("A.g()");
	}
}

class B extends A{
	@Override
	void g() {
		System.out.println("B.g()");
	}
}