//: innerclasses/Sequence.java
// Holds a sequence of Objects.
package exercise.ch10;

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}

		public Sequence outer() {
			return Sequence.this;
		}
	}

	private class ReverseSelector implements Selector{
		private int i = items.length-1;
		@Override
		public Object current() {
			return items[i];
		}
		@Override
		public boolean end() {
			return i == -1;
		}
		@Override
		public void next() {
			if (i >= 0)
				i--;
		}
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}

	public Selector reselector() {
		return new ReverseSelector();
	}
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		System.out.println();
		Selector reselector = sequence.reselector();
		while (!reselector.end()) {
			System.out.print(reselector.current() + " ");
			reselector.next();
		}
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~
