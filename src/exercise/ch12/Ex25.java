package exercise.ch12;

public class Ex25 {

	public static void main(String[] args) {
		BaseA a = new SubC();
		try {
			a.f();
		} catch (ExceptionA e) {
			e.printStackTrace(System.out);
		}
	}

}

class ExceptionA extends Exception{}
class ExceptionB extends ExceptionA{}
class ExceptionC extends ExceptionB{}

class BaseA{
	void f() throws ExceptionA{
		throw new ExceptionA();
	}
}

class SubB extends BaseA{
	void f() throws ExceptionB{
		throw new ExceptionB();
	}
}

class SubC extends SubB{
	void f() throws ExceptionC{
		throw new ExceptionC();
	}
}