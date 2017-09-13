//: typeinfo/pets/Pets.java
// Facade to produce a default PetCreator.
package exercise.ch14.ex11;
import java.util.*;

import exercise.ch14.Ex15_newPetCreator;

public class Pets {
  public static final PetCreator creator =
    new LiteralPetCreator();
  public static final Ex15_newPetCreator CREATOR2 = 
		  new Ex15_newPetCreator();
  public static Pet randomPet() {
//    return creator.randomPet();
	  return CREATOR2.randomPet();
  }
  public static Pet[] createArray(int size) {
//    return creator.createArray(size);
	  return CREATOR2.createArray(size);
  }
  public static ArrayList<Pet> arrayList(int size) {
//    return creator.arrayList(size);
	  return CREATOR2.arrayList(size);
  }
} ///:~
