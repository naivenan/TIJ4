package exercise.ch9;

public class Ex11{
	
	public String name(){
		return getClass().getSimpleName();
	}
	
	public String process(String input){
		return input;
	}
	
	public static void main(String[] args) {
		String s = "hello world";
		Apply.process(new Ex11Adapter(new Exchange()), s);
	}

}

class Exchange extends Ex11{
	@Override
	public String process(String input) {
		char[] array = input.toCharArray();
		for(int i=0;i<array.length-1;i+=2){
			char temp = array[i];
			array[i] = array[i+1];
			array[i+1] = temp;
		}
		return new String(array);
	}
}

class Ex11Adapter implements Processor{
	
	Ex11 ex11;
	public Ex11Adapter(Ex11 ex11) {
		this.ex11 = ex11;
	}
	
	@Override
	public String name() {
		return ex11.name();
	}

	@Override
	public Object process(Object input) {
		return ex11.process((String)input);
	}
	
}