package exercise.ch2;

public class Ex09 {

	public static void main(String[] args) {
		Boolean boolean1 = false;
		boolean b = boolean1;
		System.out.println(b);
		
		Character character = 'x';
		char c = character;
		System.out.println(c);
		
		Byte byte1 = 0x33;
		byte by = byte1;
		System.out.println(by);
		
		Short short1 = 0x0001;
		short s = short1;
		System.out.println(s);
		
		Integer integer = 100;
		int i = integer;
		System.out.println(i);
		
		Long long1 = 200L;
		long l = long1;
		System.out.println(l);
		
		Float float1 = 0.1f;
		float f = float1;
		System.out.println(f);
		
		Double double1 = 0.1;
		double d = double1;
		System.out.println(d);
		
		Void void1 = null;
		System.out.println(void1);
		
		long long2 = 0x00fe0f0fadcbfL;
		long long3 = 000721333453436L;
		System.out.println(Long.toBinaryString(long2)+","+Long.toBinaryString(long3));
		
		System.out.println(Float.MAX_VALUE+","+Double.MAX_VALUE);
	}

}
