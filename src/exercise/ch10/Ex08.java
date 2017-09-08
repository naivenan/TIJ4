package exercise.ch10;

public class Ex08 {
	class Inner{
		private int i = 10;
	}
	int get(){
		return new Inner().i;
	}
	public static void main(String[] args) {
		Ex08 ex = new Ex08();
		System.out.println(ex.get());
	}

}
