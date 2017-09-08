package exercise.ch10.ex06_1;

import exercise.ch10.Ex06;

public class Ex06_1 {
	protected class Inner implements Ex06{
		int value;
		public Inner() {}
		@Override
		public int value() {
			return value;
		}
	}
}
