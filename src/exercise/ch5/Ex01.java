package exercise.ch5;

public class Ex01 {

	String s1="initialized",s2;
	
	public Ex01() {}
	
	public Ex01(String string){
		s2 = string;
	}
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		System.out.println(ex01.s1+","+ex01.s2);
		Ex01 ex02 = new Ex01("initialized");
		System.out.println(ex02.s1+","+ex02.s2);
		
	}

}
