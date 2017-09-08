package exercise.ch9;

public class Ex14 extends Concrete implements Exitf{
	public static void t(Itf1 i) { i.f1();i.g1(); }
	public static void u(Itf2 i) { i.f2();i.g2(); }
	public static void v(Itf3 i) { i.f3();i.g3(); }
	public static void w(Exitf i) { i.f1();i.g1(); i.f2();i.g2(); i.f3();i.g3(); i.h(); }
	public static void main(String[] args) {
		Ex14 ex14 = new Ex14();
		t(ex14);
		System.out.println("----------------");
		u(ex14);
		System.out.println("----------------");
		v(ex14);
		System.out.println("----------------");
		w(ex14);
	}

	@Override
	public void h() {
		System.out.println("Ex14.h()");		
	}
	@Override
	void c() {
		System.out.println("Ex14.c()");			
	}
	@Override
	public void f1() {
		System.out.println("Ex14.f1()");			
	}
	@Override
	public void g1() {
		System.out.println("Ex14.g1()");			
	}
	@Override
	public void f2() {
		System.out.println("Ex14.f2()");
	}
	@Override
	public void g2() {
		System.out.println("Ex14.g2()");		
	}
	@Override
	public void f3() {
		System.out.println("Ex14.f3()");		
	}
	@Override
	public void g3() {
		System.out.println("Ex14.g3()");		
	}

}

interface Itf1{
	void f1();
	void g1();
}
interface Itf2{
	void f2();
	void g2();
}
interface Itf3{
	void f3();
	void g3();
}

interface Exitf extends Itf1,Itf2,Itf3{
	void h();
}

abstract class Concrete{
	abstract void c();
}