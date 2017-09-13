//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package exercise.ch14.ex11;
import java.util.*;

public class LiteralPetCreator extends PetCreator {
  // No try block needed.
  @SuppressWarnings("unchecked")
  public static final List<Class<? extends Pet>> allTypes =
    Collections.unmodifiableList(Arrays.asList(
      Pet.class, Dog.class, Cat.class,  Rodent.class,
      Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
      Cymric.class, Rat.class, Mouse.class,Hamster.class,Gerbil.class));
  // Types for random creation:
  private static final List<Class<? extends Pet>> types =
    allTypes.subList(allTypes.indexOf(Mutt.class),
      allTypes.size());
  public List<Class<? extends Pet>> types() {
    return types;
  }	
  public static void main(String[] args) {
    System.out.println(types);
  }
} /* Output:
[class exercise.ch14.ex11.Mutt, class exercise.ch14.ex11.Pug, class exercise.ch14.ex11.EgyptianMau, class exercise.ch14.ex11.Manx, class exercise.ch14.ex11.Cymric, class exercise.ch14.ex11.Rat, class exercise.ch14.ex11.Mouse, class exercise.ch14.ex11.Hamster]
*///:~
