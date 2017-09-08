package exercise.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Ex32 implements Iterable<String>{
	private static String[] array = {"1","2","3","4","5"};
	private static int count = 0;

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return count<5;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return array[count++];
			}
		};
	}

	public Iterable<String> reversed(){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {
					int current = array.length-1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current>-1;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return array[current--];
					}
				};
			}
		};
	}
	
	public Iterable<String> randomized(){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				List<String> list = new ArrayList<>(Arrays.asList(array));
				Collections.shuffle(list, new Random(47));
				return list.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		Ex32 ex32 = new Ex32();
		for(String string : ex32){
			System.out.print(string+" ");
		}
		System.out.println();
		for(String string : ex32.reversed()){
			System.out.print(string+" ");
		}
		System.out.println();
		for(String string : ex32.randomized()){
			System.out.print(string+" ");
		}
	}
}
