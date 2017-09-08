package exercise.ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex1 {

	public static void display(Iterator<Gerbil> it){
		while(it.hasNext()){
			Gerbil g = it.next();
			g.hop();
		}
	}
	
	public static void main(String[] args) {
		List<Gerbil> list = new ArrayList<Gerbil>();
		list.add(new Gerbil(1));
		list.add(new Gerbil(2));
		list.add(new Gerbil(3));
		display(list.iterator());
	}

}

class Gerbil{
	private int gerbilNumber;
	public Gerbil(int n) {
		gerbilNumber = n;
	}
	public void hop(){
		System.out.println("Gerbil "+gerbilNumber+" is jumping.");
	}
}