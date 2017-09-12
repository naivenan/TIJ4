package exercise.ch13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exercise.util.TextFile;

public class Ex15_JGrep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String flags = in.next();
		int flag = 0;
		if("case_insensitive".equalsIgnoreCase(flags)){
			flag = Pattern.CASE_INSENSITIVE;
		}else if("multiline".equalsIgnoreCase(flags)){
			flag = Pattern.MULTILINE;
		}
		String regex = "\\b[SSCT]\\w+\\b";
		Pattern p = Pattern.compile(regex,flag);
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher("");
		for (String line : new TextFile("src/exercise/ch13/JGrep.java")) {
			m.reset(line);
			while (m.find())
				System.out.println(index++ + ": " + m.group() + ": " + m.start());
		}
		in.close();
	}

}
