package exercise.ch10;

public class Ex09 {
	Itf f(){
		class Imp implements Itf{
			int i;
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return i;
			}
		}
		return new Imp();
	}
	
	void g(int n){
		if(n==0){
			class Imp implements Itf{
				private int i = n+5;
				@Override
				public int value() {
					return i;
				}
			}
			System.out.println((new Imp()).i);
		}
	}
	
	Itf h(){
		return new Itf(){
			private int n = 10;
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return n;
			}
		};
	}
	
	public static void main(String[] args) {
		Ex09 ex = new Ex09();
		ex.g(0);
	}
}

interface Itf{
	int value();
}