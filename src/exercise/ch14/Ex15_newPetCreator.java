package exercise.ch14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import exercise.ch14.ex11.Cat;
import exercise.ch14.ex11.Pet;
import exercise.ch14.ex11.Dog;

public class Ex15_newPetCreator {
	private static Random rand = new Random(47);
	static List<Factory<? extends Pet>> partFactories = new ArrayList<Factory<? extends Pet>>();
	static {
		partFactories.add(new Cat.Factory());
		partFactories.add(new Dog.Factory());
	}

	public Pet randomPet() {
		return partFactories.get(rand.nextInt(partFactories.size())).create();
	}

	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for (int i = 0; i < size; i++)
			result[i] = randomPet();
		return result;
	}

	public ArrayList<Pet> arrayList(int size) {
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}

}
