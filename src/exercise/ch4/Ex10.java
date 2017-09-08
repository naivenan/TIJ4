package exercise.ch4;

public class Ex10 {

	public static void main(String[] args) {
		for(int n=1001;n<10000;n++){
			if(n%100==0)
				continue;
			int nn = n;
			int a = nn/1000;
			nn%=1000;
			int b = nn/100;
			nn%=100;
			int c = nn/10;
			nn%=10;
			int d = nn;
			if((a*10+b)*(c*10+d)==n){
				System.out.println(n+" = "+a+b+" * "+c+d);
			}else if ((a*10+b)*(d*10+c)==n) {
				System.out.println(n+" = "+a+b+" * "+d+c);
			}else if ((b*10+a)*(c*10+d)==n) {
				System.out.println(n+" = "+b+a+" * "+c+d);
			}else if ((b*10+a)*(d*10+c)==n) {
				System.out.println(n+" = "+b+a+" * "+d+c);
			}else if ((a*10+c)*(b*10+d)==n) {
				System.out.println(n+" = "+a+c+" * "+b+d);
			}else if ((a*10+c)*(d*10+b)==n) {
				System.out.println(n+" = "+a+c+" * "+d+b);
			}else if ((c*10+a)*(b*10+d)==n) {
				System.out.println(n+" = "+c+a+" * "+b+d);
			}else if ((c*10+a)*(d*10+b)==n) {
				System.out.println(n+" = "+c+a+" * "+d+b);
			}else if ((a*10+d)*(b*10+c)==n) {
				System.out.println(n+" = "+a+d+" * "+b+c);
			}else if ((a*10+d)*(c*10+b)==n) {
				System.out.println(n+" = "+a+d+" * "+c+b);
			}else if ((d*10+a)*(b*10+c)==n) {
				System.out.println(n+" = "+d+a+" * "+b+c);
			}else if ((d*10+a)*(c*10+b)==n) {
				System.out.println(n+" = "+d+a+" * "+c+b);
			}
		}
	}

}
