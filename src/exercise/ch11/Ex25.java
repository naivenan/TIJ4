package exercise.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exercise.util.TextFile;

public class Ex25 {

	public static void main(String[] args) {
		Map<String, MyList<Integer>> map = new HashMap<>();
		List<String> words = new ArrayList<String>(new TextFile("src/exercise/ch11/Ex25.java", "\\W+"));
		for(int i=0;i<words.size();i++){
			String s = words.get(i);
			map.put(s, map.get(s)==null?new MyList<Integer>(i):map.get(s).addReturn(i));
//			MyList<Integer> a = map.get(s);
//			if(null==a){
//				MyList<Integer> list = new MyList<>();
//				map.put(s, list);
//			}
//			list.add(++i);
		}
		System.out.println(map);
	}

}

class MyList<E> extends ArrayList<E>{
	public MyList<E> addReturn(E e) {
		this.add(e);
		return this;
	}
	public MyList(E... i) {
		for(E e : i){
			this.add(e);
		}
	}
}