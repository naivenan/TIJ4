package exercise.ch14;

public class Ex01 {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Class ce = ex01.getClass();
		System.out.println(ce.getCanonicalName());
		Class c = null;
		try {
			c = Class.forName("exercise.ch14.Ex01");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Object o = null;
		try {
			o = c.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(o);
		
	}

}
