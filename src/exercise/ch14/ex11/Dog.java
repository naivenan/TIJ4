//: typeinfo/pets/Dog.java
package exercise.ch14.ex11;

public class Dog extends Pet {
	public Dog(String name) {
		super(name);
	}

	public Dog() {
		super();
	}
	
	public static class Factory implements exercise.ch14.Factory<Dog> {

		@Override
		public Dog create() {
			return new Dog();
		}
	}
} /// :~
