package exercise.ch8;

public class Ex17 {

	public static void main(String[] args) {
		Cycle[] array = {new Unicycle(),new Bicycle(),new Tricycle()};
		for(Cycle c : array)
			c.balance();
		((Unicycle)array[0]).balance();
		((Bicycle)array[1]).balance();
		((Tricycle)array[2]).balance();
		
	}

}

class Cycle{
	void balance(){
		System.out.println("Cycle.balance()");
	}
}

class Unicycle extends Cycle{
	void balance(){
		System.out.println("Unicycle.balance()");
	}
}

class Bicycle extends Cycle{
	void balance(){
		System.out.println("Bicycle.balance()");
	}
}

class Tricycle extends Cycle{}