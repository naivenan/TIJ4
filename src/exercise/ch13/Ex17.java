package exercise.ch13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exercise.util.TextFile;

public class Ex17 {

	public static void main(String[] args) {
		String regex1 = "//(.*)$";
		String regex2 = "/\\*(.*)\\*/";
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = Pattern.compile(regex1).matcher("");
		for (String line : new TextFile("src/exercise/ch13/JGrep.java")) {
			m.reset(line);
			while (m.find())
				System.out.println(index++ + ": " + m.group() + ": " + m.start());
		}
		m = Pattern.compile(regex2).matcher("");
		System.out.println("=============================");
		File file = new File("src/exercise/ch13/JGrep.java");
		StringBuilder sb = new StringBuilder();
	    try {
	      BufferedReader in= new BufferedReader(new FileReader(file));
	      try {
	        String s;
	        while((s = in.readLine()) != null) {
	          sb.append(s);
	          sb.append("\n");
	        }
	      } finally {
	        in.close();
	      }
	    } catch(IOException e) {
	      throw new RuntimeException(e);
	    }
	    m = Pattern.compile(regex2,Pattern.DOTALL).matcher(sb.toString());
		while (m.find())
			System.out.println(index++ + ": " + m.group() + ": " + m.start());
		
	}

}
