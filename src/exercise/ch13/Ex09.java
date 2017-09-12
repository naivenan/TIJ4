package exercise.ch13;

public class Ex09 {

	public static void main(String[] args) {
		String sentence = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";
		String sentence1 = sentence.replaceAll("[aeiou]","_");
		System.out.println(sentence1);
	}

}
