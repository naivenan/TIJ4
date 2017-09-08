package exercise.ch5;

public class Ex17 {
	public Ex17(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Ex17[] array;
		array = new Ex17[]{
			new Ex17("1"),
			new Ex17("2"),
			new Ex17("3"),
		};
	}

}
