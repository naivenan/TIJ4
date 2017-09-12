package exercise.ch13;

public class Ex07 {

	public static void main(String[] args) {
		String sentence = "Wdjvjifi`3i2u4238429.";
		String sentence1 = "a3847438fhreuhf8932urf9feru.";
		String sentence2 = "Q32r9fe98gjrjur8";
		System.out.println(sentence.matches("^[A-Z].+\\.$"));
		System.out.println(sentence1.matches("^[A-Z].+\\.$"));
		System.out.println(sentence2.matches("^[A-Z].+\\.$"));
	}

}
