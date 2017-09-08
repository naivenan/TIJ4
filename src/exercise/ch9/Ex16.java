package exercise.ch9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Ex16 {
	private static Random random = new Random(13);
	
	public String next(){
		StringBuffer sb = new StringBuffer();
		char c;
		for(int i=0;i<5;i++){
			c = (char)('a'+random.nextInt(26));
			sb.append(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new AdaptedEx16(7));
		while(scanner.hasNext()){
			System.out.print(scanner.next());
		}
		scanner.close();
	}

}

class AdaptedEx16 extends Ex16 implements Readable{
	private int count;
	public AdaptedEx16(int c) {
		count = c;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0)
			return -1;
		String s = next()+"_";
		cb.append(s);
		return s.length();
	}
	
}