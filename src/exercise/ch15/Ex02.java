package exercise.ch15;

import java.util.Arrays;

public class Ex02<T> {
	
	private T[] array;
	private int size;
	
	public Ex02(T[] array) {
		this.array = Arrays.copyOf(array, array.length);
		this.size = array.length;
	}
	
	public void set(int i,T a){
		if(i>=0&&i<size)
			array[i] = a;
	}
	
	public T get(int i){
		if(i>=0&&i<size)
			return array[i];
		return null;
	}

	public int size(){
		return size;
	}
	
	public static void main(String[] args) {
		String[] array = {"a","b","c"};
		Ex02<String> ex02 = new Ex02<>(array);
		for(int i=0;i<ex02.size();i++)
			System.out.print(ex02.get(i)+" ");
		System.out.println();
		ex02.set(1, "bb");
		for(int i=0;i<ex02.size();i++)
			System.out.print(ex02.get(i)+" ");
		
	}

}
