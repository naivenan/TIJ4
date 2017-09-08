package exercise.ch10;

public class Ex02 {
	private String name;
	public Ex02(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		Sequence s = new Sequence(5);
		for(int i=0;i<5;i++)
			s.add(new Ex02("object_"+i));
		Selector selector = s.selector();
		while(!selector.end()){
			Ex02 ex = (Ex02)selector.current();
			System.out.println(ex.toString());
			selector.next();
		}
	
	}

}