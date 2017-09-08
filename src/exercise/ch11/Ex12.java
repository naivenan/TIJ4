package exercise.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex12 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = new ArrayList<>(list);
		ListIterator<Integer> it1 = list.listIterator(5), it2 = list2.listIterator();
		while(it1.hasPrevious()){
			int i = it1.previous();
			it2.next();
			it2.set(i);
		}
		System.out.println(list+"\n"+list2);
	}

}
