package exercise.ch12;

public class Ex02 {

	public void f(){}
	
	public static void main(String[] args) {
		Ex02 ex02 = null;
		try{
			ex02.f();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
