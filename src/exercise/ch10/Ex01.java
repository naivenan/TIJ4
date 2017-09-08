package exercise.ch10;

public class Ex01 {

	public static void main(String[] args) {
		Outer o = new Outer("outer");
		Outer.Inner i = o.inner();
		System.out.println(i.toString());
	}

}

class Outer{
	private String name;
	public Outer(String name) {
		this.name=name;
	}
	class Inner{
		@Override
		public String toString() {
			return name;
		}
	}
	public Inner inner(){
		return new Inner();
	}
}