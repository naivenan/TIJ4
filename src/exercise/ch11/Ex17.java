package exercise.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex17 {

	public static void main(String[] args) {
		Map<String, Gerbil> map = new HashMap<>();
		map.put("Fuzzy", new Gerbil(1));
		map.put("Spot", new Gerbil(2));
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			String s = it.next();
			Gerbil g = map.get(s);
			System.out.print(s+" ");
			g.hop();
		}
		
		
	}

}
