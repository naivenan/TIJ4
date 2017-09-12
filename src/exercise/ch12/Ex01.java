package exercise.ch12;

public class Ex01 {

	public static void f() throws MyException{
		throw new MyException("Exception in Ex01.f()");
	}
	
	public static void main(String[] args) {
		try{
			f();
		}catch (MyException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Ö´ÐÐfinally");
		}
	}

}

class MyException extends Exception{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String s){
		super(s);
	}
}