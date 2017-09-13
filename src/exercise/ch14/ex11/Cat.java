//: typeinfo/pets/Cat.java
package exercise.ch14.ex11;

public class Cat extends Pet {
	public Cat(String name) {
		super(name);
	}

	public Cat() {
		super();
	}

	public static class Factory implements exercise.ch14.Factory<Cat> {

		@Override
		public Cat create() {
			return new Cat();
		}
	}
} /// :~
