package exercise.ch10;

public class Ex07 {
	private String s;
	private void getS(){
		System.out.println(s);
	}
	public Sets anonymous(String s){
		return new Sets() {
			private String str = s;
			@Override
			public void setS() {
				Ex07.this.s = str;
			}
		};
	}
	class Inner{
		void setS(){
			s = "inner's changed.";
			getS();
		}
	}
	public static void main(String[] args) {
		Ex07 ex = new Ex07();
		Ex07.Inner in = ex.new Inner();
		in.setS();
		
		Sets s = ex.anonymous("change twice.");
		s.setS();
		System.out.println(ex.s);
	}

}

interface Sets{
	void setS();
}