package exercise.ch13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11 {

	public static void main(String[] args) {
		String input = "Arline ate eight apples and one orange while Anita hadn't any";
		String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		System.out.println("===========================\nregex : "+regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		while(m.find()){
			for(int i=0;i<=m.groupCount();i++){
				String g = m.group(i);
				System.out.print(g+" : "+m.start()+"-"+(m.end()-1)+",");
			}
			System.out.println();
		}
		System.out.println("===========================");
		input = "dsadqwD";
		regex = "\\w+?d\\b";
		p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		m = p.matcher(input);
		while(m.find())
			System.out.println(m.group()+" : "+m.start()+"-"+(m.end()-1));
		p = Pattern.compile(regex);
		m = p.matcher(input);
		while(m.find())
			System.out.println(m.group()+" : "+m.start()+"-"+(m.end()-1));
		
	}

}
