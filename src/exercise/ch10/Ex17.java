package exercise.ch10;

import java.util.Random;

public class Ex17 {

	public static void gamble(GambleFactory gf){
		gf.getGamble().play();
	}
	
	public static void main(String[] args) {
		gamble(Coin.factory);
		gamble(Dice.factory);
	}

}

interface Gamble{
	void play();
}
interface GambleFactory{
	Gamble getGamble();
}
class Coin implements Gamble{
	private Coin(){}
	public static GambleFactory factory = new GambleFactory() {
		
		@Override
		public Gamble getGamble() {
			return new Coin();
		}
	};
	@Override
	public void play() {
		Random random = new Random();
		int i = random.nextInt(10);
		System.out.print("------------>抛硬币：");
		if(i<5)
			System.out.println("正面");
		else
			System.out.println("反面");
	}
}

class Dice implements Gamble{
	private Dice(){}
	public static GambleFactory factory = new GambleFactory() {
		
		@Override
		public Gamble getGamble() {
			return new Dice();
		}
	};
	@Override
	public void play() {
		Random random = new Random();
		int i = random.nextInt(6);
		System.out.println("------------>掷骰子："+(i+1)+"点");
	}
}
