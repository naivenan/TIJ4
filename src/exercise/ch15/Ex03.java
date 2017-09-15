package exercise.ch15;

public class Ex03<A,B,C,D,E,F> {

	public final A a;
	public final B b;
	public final C c;
	public final D d;
	public final E e;
	public final F f;
	
	public Ex03(A a,B b,C c,D d,E e,F f){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	@Override
	public String toString() {
		return "("+a+", "+b+", "+c+", "+d+", "+e+", "+f+")";
	}
	
	public static void main(String[] args) {
		System.out.println(new Ex03
				<Integer, Integer, Integer, Integer, Integer, Integer>
				(1, 2, 3, 4, 5, 6));
	}

}
