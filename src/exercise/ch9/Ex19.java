package exercise.ch9;

import java.util.Random;

public class Ex19 {

	public static void gamble(GambleFactory gf){
		gf.getGamble().play();
	}
	
	public static void main(String[] args) {
		gamble(new CoinFactory());
		gamble(new DiceFactory());
	}

}

interface Gamble{
	void play();
}
interface GambleFactory{
	Gamble getGamble();
}
class Coin implements Gamble{
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
class CoinFactory implements GambleFactory{
	@Override
	public Gamble getGamble() {
		return new Coin();
	}
}
class Dice implements Gamble{
	@Override
	public void play() {
		Random random = new Random();
		int i = random.nextInt(6);
		System.out.println("------------>掷骰子："+(i+1)+"点");
	}
}
class DiceFactory implements GambleFactory{
	@Override
	public Gamble getGamble() {
		return new Dice();
	}
}