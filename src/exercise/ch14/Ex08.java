package exercise.ch14;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex08 {

	public static void printh(Object o){
		Class c = null;
		c = o.getClass();
		while(!"Object".equals(c.getSimpleName())){
			System.out.print(c.getSimpleName()+" ");
			c = c.getSuperclass();
		}
		System.out.println("Object");
	}
	
	public static void printdf(Object o){
		Class c = null;
		c = o.getClass();
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields){
			Class fc = fields[0].getType();
			System.out.print(fc.getName()+":"+f.getName()+" ");
		}
	}
	
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>(
				Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid()));
		for(Shape s : list)
			printh(s);
		for(Shape s : list)
			printdf(s);
		
	}

}
