package exercise.ch7;

import static exercise.util.Print.*;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Component1{
	public Component1(int i) {
		print("Component1 constructor");
	}
	public void dispose(){
		print("Component1 dispose");
	}
}
class Component2{
	public Component2(int i) {
		print("Component2 constructor");
	}
	public void dispose(){
		print("Component2 dispose");
	}
}
class Component3{
	public Component3(int i) {
		print("Component3 constructor");
	}
	public void dispose(){
		print("Component3 dispose");
	}
}

class Root{
	private Component1 c1;
	private Component2 c2;
	private Component3 c3;
	public Root(int i) {
		c1 = new Component1(i);
		c2 = new Component2(i);
		c3 = new Component3(i);
		print("Root constructor");
	}
	public void dispose(){
		c3.dispose();
		c2.dispose();
		c1.dispose();
		print("Root dispose");
	}
}

class Stem extends Root{
	public Stem(int i) {
		super(i);
		print("Stem constructor");
	}
	public void dispose(){
		print("Stem dispose");
		super.dispose();
	}
	public static void main(String[] args) {
		Stem s = new Stem(1);
		s.dispose();
	}
}