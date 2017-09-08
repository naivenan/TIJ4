package exercise.ch11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex19 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "2");
		map.put(1, "1");
		map.put(4, "4");
		map.put(3, "3");
		Integer[] arr= map.keySet().toArray(new Integer[0]);
		Arrays.sort(arr);
		Map<Integer, String> map2 = new LinkedHashMap<>();
		for(int i : arr){
			map2.put(i, map.get(i));
		}
		System.out.println(map2);
	}

}
