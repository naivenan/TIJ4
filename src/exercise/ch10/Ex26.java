package exercise.ch10;

public class Ex26 {}

class WithInner1{
	class Inner1{
		Inner1(int i){}
	}
}

class WithInner2{
	class Inner2 extends WithInner1.Inner1{
		public Inner2(WithInner1 w,int i) {
			w.super(i);
		}
	}
}