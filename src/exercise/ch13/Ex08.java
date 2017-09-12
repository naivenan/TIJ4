package exercise.ch13;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		String sentence = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";
		String[] sentences = sentence.split("the|you");
		System.out.println(Arrays.toString(sentences));
	}

}
