//: interfaces/music5/Music5.java
// Interfaces.
package exercise.ch9;
import exercise.ch8.Note;
import static exercise.util.Print.*;

interface Instrument {
  // Compile-time constant:
  int VALUE = 5; // static & final
  // Cannot have method definitions:
  void adjust();
}

interface Playable{
	void play(Note n); // Automatically public
}

abstract class CommonMethod implements Instrument,Playable{
	public void play(Note n){
		print(this + ".play() " + n);
	}
	public void adjust(){
		print(this + ".adjust()");
	}
}

class Wind extends CommonMethod {
  public String toString() { return "Wind"; }
}

class Percussion extends CommonMethod {
  public String toString() { return "Percussion"; }
}

class Stringed extends CommonMethod {
  public String toString() { return "Stringed"; }
}

class Brass extends Wind {
  public String toString() { return "Brass"; }
}	

class Woodwind extends Wind {
  public String toString() { return "Woodwind"; }
}

public class Music5 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  static void tune(CommonMethod i) {
    // ...
	i.adjust();
    i.play(Note.MIDDLE_C);
  }
  static void tuneAll(CommonMethod[] e) {
    for(CommonMethod i : e)
      tune(i);
  }	
  public static void main(String[] args) {
    // Upcasting during addition to the array:
	 CommonMethod[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind()
    };
    tuneAll(orchestra);
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
