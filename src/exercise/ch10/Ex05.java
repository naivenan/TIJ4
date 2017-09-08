package exercise.ch10;

public class Ex05 {

	public static void main(String[] args) {
		Ex05Outer o = new Ex05Outer("outer");
		Ex05Outer.Inner i = o.new Inner();		//用外部类的实例创建内部类的实例
		Ex05Outer.Inner i2 = o.inner();			//在外部类中创建方法获得内部类的实例
		System.out.println(i.toString());
	}

}

class Ex05Outer{
	private String name;
	public Ex05Outer(String name) {
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