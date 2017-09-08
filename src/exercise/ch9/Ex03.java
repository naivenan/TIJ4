package exercise.ch9;

public class Ex03 {

	public static void main(String[] args) {
		PolyClass p = new PolyClass();
		p.print();
	}

}

abstract class BaseClass{
	public BaseClass() {
		print();
	}
	abstract void print();
}

class PolyClass extends BaseClass{
	private int i = 10;
	@Override
	void print() {
		System.out.println("i = "+i);
	}
	
}