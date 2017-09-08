package exercise.ch10;

public class Ex15 {

	A getA(){
		return new A(10){
			{
				System.out.println("anonymous class extends A.");
			}
		};
	}
	
	public static void main(String[] args) {
		Ex15 ex = new Ex15();
		ex.getA();
	}

}

class A{
	public A(int i) {
		System.out.println("A constructor(int i)");
	}
}