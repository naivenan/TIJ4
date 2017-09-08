package exercise.ch9;

import static exercise.util.Print.*;

public class Ex18 {

	public static void move(CycleFactory cf){
		cf.getCycle().go();
	}
	
	public static void main(String[] args) {
		move(new UnicycleFactory());
		move(new BicycleFactory());
		move(new TricycleFactory());
		
	}

}

interface Cycle{
	void go();
}
interface CycleFactory{
	Cycle getCycle();
}
class Unicycle implements Cycle{
	@Override
	public void go() {
		print("Unicycle.go()");
	}
}
class UnicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
}
class Bicycle implements Cycle{
	@Override
	public void go() {
		print("Bicycle.go()");
	}
}
class BicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}
}
class Tricycle implements Cycle{
	@Override
	public void go() {
		print("Tricycle.go()");
	}
}
class TricycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}
}