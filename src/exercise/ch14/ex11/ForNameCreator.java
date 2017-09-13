//: typeinfo/pets/ForNameCreator.java
package exercise.ch14.ex11;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "exercise.ch14.ex11.Mutt",
    "exercise.ch14.ex11.Pug",
    "exercise.ch14.ex11.EgyptianMau",
    "exercise.ch14.ex11.Manx",
    "exercise.ch14.ex11.Cymric",
    "exercise.ch14.ex11.Rat",
    "exercise.ch14.ex11.Mouse",
    "exercise.ch14.ex11.Hamster",
    "exercise.ch14.ex11.Gerbil"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
