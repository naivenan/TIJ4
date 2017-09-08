package exercise.ch10;

public class Ex18 {
	
	private static class Nest{
		private int i = 10;
		public int value(){
			return i;
		}
	}
	
	public static Nest nest(){
		return new Nest();
	}
	public static void main(String[] args) {
		Nest n = nest();
		System.out.println(n.value());
	}

}
