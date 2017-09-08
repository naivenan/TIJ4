//: interfaces/HorrorShow.java
// Extending an interface with inheritance.
package exercise.ch10;

interface Monster {
  void menace();
}

interface DangerousMonster extends Monster {
  void destroy();
}

interface Lethal {
  void kill();
}

class DragonZilla implements DangerousMonster {
  public void menace() {}
  public void destroy() {}
}	

interface Vampire extends DangerousMonster, Lethal {
  void drinkBlood();
}

class VeryBadVampire implements Vampire {
  public void menace() {}
  public void destroy() {}
  public void kill() {}
  public void drinkBlood() {}
}	

public class Ex14 {
  static void u(Monster b) { b.menace(); }
  static void v(DangerousMonster d) {
    d.menace();
    d.destroy();
  }
  static void w(Lethal l) { l.kill(); }
  public static void main(String[] args) {
    DangerousMonster barney = new DragonZilla();
    u(barney);
    v(barney);
    Vampire vlad = new VeryBadVampire();
    u(vlad);
    v(vlad);
    w(vlad);
    System.out.println("=================================");
    v(new DangerousMonster() {
		
		@Override
		public void menace() {
			System.out.println("匿名类DM.menace()");
		}
		
		@Override
		public void destroy() {
			System.out.println("匿名类DM.destroy()");
		}
	});
    System.out.println("=================================");
    v(new Vampire() {
		
		@Override
		public void kill() {
			System.out.println("匿名类V.kill()");
		}
		
		@Override
		public void menace() {
			System.out.println("匿名类V.menace()");			
		}
		
		@Override
		public void destroy() {
			System.out.println("匿名类V.destroy()");			
		}
		
		@Override
		public void drinkBlood() {
			System.out.println("匿名类V.drinkBlood()");			
		}
	});
  }
} ///:~
