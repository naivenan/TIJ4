package exercise.ch5;

public class Ex21 {
	Money money;

	public Ex21(Money money) {
		this.money = money;
	}

	public void describe() {
		System.out.print("the money is ");
		switch (money) {
		case one: 
		case five:	System.out.println("little.");
					break;
		case ten:
		case twenty:System.out.println("much more.");
					break;
		case fifty:
		case hundred:
		default:	System.out.println("much enough.");
					break;
		}
	}

	public static void main(String[] args) {
		for (Money m : Money.values())
			System.out.println(m + ", ordinal " + m.ordinal());
		Ex21
			ex1 = new Ex21(Money.five),
			ex2 = new Ex21(Money.ten),
			ex3 = new Ex21(Money.hundred);
		ex1.describe();
		ex2.describe();
		ex3.describe();
	}

}

enum Money {
	one, five, ten, twenty, fifty, hundred
}