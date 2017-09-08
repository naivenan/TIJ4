package exercise.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exercise.util.TextFile;

public class Ex16 {

	public static void main(String[] args) {
		Set<Character> set = new HashSet<>();
		Collections.addAll(set, 'a','e','i','o','u','A','E','I','O','U');
		List<String> list = new ArrayList<String>(new TextFile(".\\src\\exercise\\ch11\\UniqueWords.java","\\W+"));
		int total = 0;
		for(String s : list){
			int count = 0;
			char[] array = s.toCharArray();
			for(char c : array){
				if(set.contains(c))
					count++;
			}
			total += count;
			System.out.println(s+":"+count);
		}
		System.out.println("total:"+total);
		
	}

}
