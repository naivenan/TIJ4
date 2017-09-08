package exercise.ch5;

public class Ex15 {
	String s;
	{
		s = "initialized";
		System.out.println(s);
	}
	public Ex15() {}
	public Ex15(String s) {this.s = s;}
	public static void main(String[] args) {
		Ex15 ex15 = new Ex15("sss");
		System.out.println(ex15.s);
	}

}
