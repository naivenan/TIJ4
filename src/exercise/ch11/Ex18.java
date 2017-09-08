package exercise.ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex18 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Collections.addAll(set, 2,1,4,3);
		Integer[] arr= set.toArray(new Integer[0]);
		Arrays.sort(arr);
		Set<Integer> set2 = new LinkedHashSet<>();
		for(int i : arr){
			set2.add(i);
		}
		System.out.println(set2);
	}

}
