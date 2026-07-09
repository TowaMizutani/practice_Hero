
public class ExeTest1 {

	public static void main(String[] args) {
		
		Wizard w = new Wizard("魔法使い", 100);
		
		Matango m = new Matango(100 , 'A');
		
		w.attack(m);
		w.fireball(m);
	}
}





