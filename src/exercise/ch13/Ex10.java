package exercise.ch13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {

	public static void main(String[] args) {
		String input = "Java now has regular expressions";
		String[] regex = {"^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}.","s{0,3}"};
		for(int i=0;i<regex.length;i++){
			System.out.println("===========================\nregex : "+regex[i]);
			Pattern p = Pattern.compile(regex[i]);
			Matcher m = p.matcher(input);
			while(m.find())
				System.out.println(m.group()+" : "+m.start()+"-"+(m.end()-1));
		}
	}

}
