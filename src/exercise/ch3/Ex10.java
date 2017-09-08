package exercise.ch3;

import static exercise.util.Print.*;

public class Ex10 {

	public static void main(String[] args) {
		int n1 = 0xaaaa;
		int n2 = 0x5555;
		print(Integer.toBinaryString(n1&n2));
		print(Integer.toBinaryString(n1|n2));
		print(Integer.toBinaryString(n1^n2));
		print(Integer.toBinaryString(~n1));
		print(Integer.toBinaryString((int)'a'));
		print(Integer.toBinaryString((int)'b'));
		print(Integer.toBinaryString((int)'c'));
	}

}
