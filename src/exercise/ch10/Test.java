package exercise.ch10;

public class Test {
	public Ex06 getInner(int n,Ex01 ex01){
		return new Ex06(){
			private int i = n;
			private Ex01 ex = ex01;
//			{	//Local variable ex01 defined in an enclosing scope must be final or effectively final
//				ex01 = new Ex01();
//			}
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return i;
			}
		};
	}
	public static void main(String[] args) {
		Test t = new Test();
		Ex06 ex = t.getInner(4,new Ex01());
		System.out.println(ex.value());
	}

}
