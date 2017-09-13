package exercise.ch14;

import static exercise.util.Print.*;

import java.util.Scanner;

class Candy {
	static {
		print("Loading Candy");
	}
}

class Gum {
	static {
		print("Loading Gum");
	}
}

class Cookie {
	static {
		print("Loading Cookie");
	}
}

public class SweetShop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		Class<?> c = null;
		try {
			c = Class.forName("exercise.ch14."+name);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Object o = null;
		try {
			o = c.newInstance();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		in.close();
	}
}
