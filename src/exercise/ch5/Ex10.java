package exercise.ch5;

public class Ex10 {

	public static void main(String[] args) {
		new Light(true).checkOff();
		new Light(true);
		new Light(true);
		
		try{
			System.gc();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}

class Light{
	boolean checkedOn = false;
	public Light(boolean b) {
		checkedOn = b;
	}
	public void checkOff(){
		checkedOn = false;
	}
	@Override
	protected void finalize() throws Throwable {
		if(checkedOn)
			System.out.println("Error: checked on");
		super.finalize();
	}
}