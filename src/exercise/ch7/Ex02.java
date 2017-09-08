package exercise.ch7;

import static exercise.util.Print.*;

public class Ex02 extends Detergent {

	public void scrub() {
		append(" Ex02.scrub()");
		super.scrub();
	}

	public void sterilize() {
		append(" sterilize()");
	}

	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		ex02.dilute();
		ex02.apply();
		ex02.scrub();
		ex02.foam();
		ex02.sterilize();
		print(ex02);
		print("test base class...");
		Detergent.main(args);
	}

}

class Cleanser {
	public Cleanser() {
		print("Cleanser constructor");
	}

	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

class Detergent extends Cleanser {
	public Detergent() {
		print("Detergent constructor");
	}
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}

// 代理
class Detergent2{
	private Cleanser c = new Cleanser();
	public void append(String s) {
		c.append(s);
	}
	public void dilute() {
		c.dilute();
	}

	public void apply() {
		c.apply();
	}

	public void scrub() {
		c.scrub();
	}
	public String toString(){
		return c.toString();
	}
	public static void main(String[] args) {
		Detergent2 d2 = new Detergent2();
		d2.append(" d2...");
		d2.dilute();
		d2.apply();
		d2.scrub();
		print(d2);
	}
}