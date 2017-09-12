package exercise.ch21;

public class Ex01 implements Runnable{

	private static int taskcount = 0;
	private final int taskid = taskcount++;
	
	public Ex01() {
		System.out.println("Ex01 task "+taskid+" starts.");
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			new Thread(new Ex01()).start();
		}
		System.out.println("waiting for task starts.");
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println("task "+taskid+",message "+i);
//			Thread.yield();
		}
		System.out.println("Ex01 task "+taskid+" finished.");
	}

}
