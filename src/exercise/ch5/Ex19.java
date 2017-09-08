package exercise.ch5;

public class Ex19 {

	public void print(String... args){
		for(String s : args)
			System.out.print(s+" ");
		System.out.println();
	}
	
	public void main(Object... objs){
		for(Object obj : objs)
			System.out.print(obj+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Ex19 ex19 = new Ex19();
		ex19.print(new String[]{"1","2","3"});
		ex19.print("4","5","6");
		ex19.main(1,2.0,'a',"hello world",new Ex19());
	}

}
