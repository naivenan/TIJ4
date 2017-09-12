package exercise.ch12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex05 {
	static void f(){
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			LogException1.log(e);
		}
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			LogException2.log(e);
		}
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace(System.out);
		}
	}

}

class LogException1 extends Exception{
	private static Logger logger = Logger.getLogger("LogException1");
	public static void log(Exception e){
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
//		logger.severe(sw.toString());
		logger.warning(sw.toString());
	}
}

class LogException2 extends Exception{
	private static Logger logger = Logger.getLogger("LogException2");
	public static void log(Exception e){
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		logger.severe(sw.toString());
	}
}