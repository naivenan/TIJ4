package exercise.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import exercise.util.TextFile;

public class Ex21 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		List<String> words = new ArrayList<String>(new TextFile("src/exercise/ch11/Ex21.java", "\\W+"));
		for(String s : words){
			Integer i = map.get(s);
			map.put(s, i==null?1:i+1);
		}
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
		Map<String, Integer> map2 = new LinkedHashMap<>();
		for(String s : list){
			map2.put(s, map.get(s));
		}
		System.out.println(map2);
	}

}
