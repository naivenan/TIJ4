package exercise.ch3;

import static exercise.util.Print.*;

public class Ex05 {

	public static void main(String[] args) {
		Dog dog1 = new Dog("spot", "Ruff! ");
		Dog dog2 = new Dog("scruffy", "Wurf! ");
		print(dog1.name+" says : "+dog1.says);
		print(dog2.name+" says : "+dog2.says);
		Dog dog3 = dog1;
		print(dog2.equals(dog1));
		print(dog2==dog1);
		print(dog3.equals(dog1));
		print(dog3==dog1);
		print(dog3.equals(dog2));
		print(dog3==dog2);
	}

}

class Dog{
	String name;
	String says;
	Dog(String name,String says){
		this.name=name;
		this.says=says;
	}
//	@Override
//	public boolean equals(Object obj) {
//		Dog dog = (Dog) obj;
//		if(this.name.equals(dog.name))
//			return true;
//		else
//			return false;
//	}
}