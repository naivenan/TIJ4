package exercise.ch7;

public class Ex01 {
	private Simple s;
	public String toString(){
		if(s==null)
			s = new Simple();
		return "s = " + s;
	}
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		System.out.println(ex01);
	}

}

class Simple{
	
}