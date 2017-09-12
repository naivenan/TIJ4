package exercise.ch13;

import java.util.Scanner;

public class Ex20 {
	private int n;
	private long m;
	private float f;
	private double d;
	private String s;
	public Ex20(String string) {
		Scanner in = new Scanner(string);
		n = in.nextInt();
		m = in.nextLong();
		f = in.nextFloat();
		d = in.nextDouble();
		s = in.next();
	}
	@Override
	public String toString() {
		return n+","+m+","+f+","+d+","+s;
	}
	public static void main(String[] args) {
		Ex20 ex20 = new Ex20("1000000001 1 1.0 1.0 abc");
		System.out.println(ex20);
	}

}
