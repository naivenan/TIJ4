package exercise.ch5;

public class Ex09 {

	String s;
	public Ex09() {
		this("initialized");
		System.out.println("default constructor");
	}
	public Ex09(String s) {
		this.s=s;
		System.out.println("constructor with String arg");
	}
	public static void main(String[] args) {
		Ex09 ex09 = new Ex09();
		System.out.println(ex09.s);
	}

}
