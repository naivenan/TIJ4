package exercise.ch12;

public class Ex04 extends Exception{
	private String s;
	public Ex04(String s) {
		this.s = s;
	}
	public void f(){
		System.out.println(s);
	}
	public static void g() throws Ex04{
		throw new Ex04("new Exception");
	}
	public static void main(String[] args) {
		try{
			g();
		}catch (Ex04 e) {
			e.f();
		}
	}

}
