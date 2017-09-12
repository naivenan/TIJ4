package exercise.ch12;

public class Ex03 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(array[i]);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
