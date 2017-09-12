package exercise.ch13;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exercise.util.TextFile;

public class Ex16_JGrep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String filepath = in.next();	// ÊäÈësrc/exercise/ch13
		File file = new File(filepath);
		File[] files = file.listFiles();
		String regex = "\\b[Ssct]\\w+\\b";
		Pattern p = Pattern.compile(regex);
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher("");
		for(File f : files){
			System.out.println("------------------> file: "+f.getPath());
			for (String line : new TextFile(f.getPath())) {
				m.reset(line);
				while (m.find())
					System.out.println(index++ + ": " + m.group() + ": " + m.start());
			}
		}
		in.close();
	}

}
