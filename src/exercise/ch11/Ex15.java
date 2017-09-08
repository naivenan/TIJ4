package exercise.ch11;

import exercise.util.Stack;

public class Ex15 {

	public static void main(String[] args) {
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		char[] array = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<array.length;i++){
			switch (array[i]) {
			case '+':
				stack.push(array[i+1]);
				break;
			case '-':
				System.out.print(stack.pop());
			default:
				break;
			}
			
		}
		
	}

}
