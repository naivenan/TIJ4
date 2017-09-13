//: typeinfo/Shapes.java
package exercise.ch14;

import java.util.*;

abstract class Shape {
	boolean flag = false;

	void draw() {
		if(this instanceof Circle)
			flag = true;
		System.out.println(this + ".draw() "+(flag==true?"marked":""));
	}

	void rotate() {
		if (!(this instanceof Circle))
			System.out.println(this + ".rotate()");
	}

	abstract public String toString();
}

class Circle extends Shape {
	private String s;
	public String toString() {
		return "Circle";
	}
}

class Square extends Shape {
	public String toString() {
		return "Square";
	}
}

class Triangle extends Shape {
	public String toString() {
		return "Triangle";
	}
}

class Rhomboid extends Shape {
	public String toString() {
		return "Rhomboid";
	}
}

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
		for (Shape shape : shapeList)
			shape.draw();
		Rhomboid r = null;
		if (shapeList.get(3) instanceof Rhomboid)
			r = (Rhomboid) shapeList.get(3);
		r.draw();
		for (Shape shape : shapeList)
			shape.rotate();
		// Circle c = (Circle)shapeList.get(3);
	}
} /*
	 * Output: Circle.draw() Square.draw() Triangle.draw()
	 */// :~
