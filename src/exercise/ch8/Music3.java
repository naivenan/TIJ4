//: polymorphism/music3/Music3.java
// An extensible program.
package exercise.ch8;
import static exercise.util.Print.*;

import java.util.Random;

class Instrument {
  void play(Note n) { print("Instrument.play() " + n); }
  public String toString() { return "Instrument"; }
  void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
  void play(Note n) { print("Wind.play() " + n); }
  public String toString() { return "Wind"; }
  void adjust() { print("Adjusting Wind"); }
}	

class Percussion extends Instrument {
  void play(Note n) { print("Percussion.play() " + n); }
  public String toString() { return "Percussion"; }
  void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
  void play(Note n) { print("Stringed.play() " + n); }
  public String toString() { return "Stringed"; }
  void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
  void play(Note n) { print("Brass.play() " + n); }
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  void play(Note n) { print("Woodwind.play() " + n); }
  public String toString() { return "Woodwind"; }
}	

class InstrumentFactory{
	static Random gen = new Random(17);
	static Instrument next(){
		int i = gen.nextInt(5);
		switch (i) {
		default:
		case 0: return new Wind();
		case 1: return new Percussion();
		case 2: return new Stringed();
		case 3: return new Brass();
		case 4: return new Woodwind();
		}
	}
}
public class Music3 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune(i);
  }	
  public static void main(String[] args) {
    // Upcasting during addition to the array:
    Instrument[] orchestra = new Instrument[5];
    for(int i=0;i<orchestra.length;i++)
    	orchestra[i] = InstrumentFactory.next();
    tuneAll(orchestra);
    for(Instrument ins : orchestra)
    	System.out.println(ins.toString());
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
