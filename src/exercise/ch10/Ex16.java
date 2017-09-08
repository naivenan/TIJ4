package exercise.ch10;

import static exercise.util.Print.print;

public class Ex16 {

	public static void move(CycleFactory factory){
		Cycle c = factory.getCycle();
		c.go();
	}
	
	public static void main(String[] args) {
		move(Unicycle.factory);
		move(Bicycle.factory);
		move(Tricycle.factory);
	}

}


interface Cycle{
	void go();
}
interface CycleFactory{
	Cycle getCycle();
}
class Unicycle implements Cycle{
	private Unicycle() {}
	@Override
	public void go() {
		print("Unicycle.go()");
	}
	public static CycleFactory factory = new CycleFactory() {
		
		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}

class Bicycle implements Cycle{
	private Bicycle(){}
	public static CycleFactory factory = new CycleFactory() {
		
		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
	@Override
	public void go() {
		print("Bicycle.go()");
	}
}

class Tricycle implements Cycle{
	private Tricycle() {}
	public static CycleFactory factory = new CycleFactory() {
		
		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
	@Override
	public void go() {
		print("Tricycle.go()");
	}
}