package exercise.ch5;

public class Ex05 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		int x = 1;
		String s = "s";
		dog.bark(x,s);
		dog.bark(s,x);
		dog.bark((float)x);
		dog.bark((double)x);
		
	}

}

class Dog{
	public void bark(int n,String s){
		System.out.println("barking_1");
	}
	public void bark(String s,int n){
		System.out.println("barking_2");
	}
	public void bark(float n){
		System.out.println("howling");
	}
	public void bark(double n){
		System.out.println("wurfing");
	}
}