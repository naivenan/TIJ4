package exercise.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import exercise.util.TextFile;

public class Ex26 {

	public static void main(String[] args) {
		Map<String, MyList<Integer>> map = new HashMap<>();
		List<String> words = new ArrayList<String>(new TextFile("src/exercise/ch11/Ex25.java", "\\W+"));
		System.out.println(words);
		for(int i=0;i<words.size();i++){
			String s = words.get(i);
			map.put(s, map.get(s)==null?new MyList<Integer>(i):map.get(s).addReturn(i));
		}
		TreeMap<Integer, String> map2 = new TreeMap<>();
		for(Entry<String, MyList<Integer>> entry : map.entrySet()){
			for(int i : entry.getValue()){
				map2.put(i, entry.getKey());
			}
		}
		System.out.println(map2.values());
	}

}