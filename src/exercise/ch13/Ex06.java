package exercise.ch13;

public class Ex06 {
	private int n=1;
	private long m=12345678901L;
	private float f=1.0f;
	private double d=1.0;
	@Override
	public String toString() {
		return String.format("%d,%d,%f,%f", n,m,f,d);
	}
	public static void main(String[] args) {
		System.out.println(new Ex06());
	}

}
