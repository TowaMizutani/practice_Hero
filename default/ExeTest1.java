
public class ExeTest1 {

	public static void main(String[] args) {
		
		Wizard w = new Wizard("魔法使い", 100);
		
		Matango m = new Matango(100 , 'A');
		
		w.attack(m);
		w.fireball(m);
		
		
		// 少し改良　アップキャスト
		

		Character c = w;
		
		c.attack(m);
		
		//Characterに実装が無いFireBallは呼び出せない
		// c.fireball(m);
		
		
		//Step2
		
		Slime s = new Slime();
		
		Monster mon = new Slime();
		
		s.run();
		
		mon.run();
		
		// Character[]を使い多様性のメリットを実践
		
		
		Character[] party = new Character[5];

		party[0] = new Hero("勇者1", 100);
		party[1] = new Wizard("勇者2", 100);
		party[2] = new Hero("勇者3", 100);
		party[3] = new Wizard("勇者4", 100);
		party[4] = new Wizard("勇者5", 100);
		
		for (Character ch : party) {
			//ch.hp += 50;
		}
	}
}





