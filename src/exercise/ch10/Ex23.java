package exercise.ch10;

public class Ex23{
	public static void main(String[] args) {
		Ex23_A a = new Ex23_A();
		Ex23_B b = new Ex23_B();
		for(int i=0;i<10;i++){
			b.restoreU(a.makeU());
		}
		b.showU();
		b.cleanU(1);
	}
}

interface U {
	void f();
	void g();
	void h();
}

class Ex23_A{
	private int num;
	U makeU(){
		return new U() {
			private int n=num++;
			@Override
			public void h() {
				System.out.print("U"+n+".h() ");
			}
			
			@Override
			public void g() {
				System.out.print("U"+n+".g() ");
			}
			
			@Override
			public void f() {
				System.out.print("U"+n+".f() ");
			}
		};
	}
}

class Ex23_B{
	private U[] array = new U[10];
	private int i;
	void restoreU(U u){
		if(i<array.length){
			array[i++] = u;
		}
	}
	void cleanU(int i){
		if(i<array.length){
			array[i] = null;
		}
	}
	void showU(){
		for(int i=0;i<array.length;i++){
			array[i].f();
			array[i].g();
			array[i].h();
			System.out.println();
		}
	}
	  
}