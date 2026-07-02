
public class Wizard {
	String name;
	int hp;
	
	//コンストラクタ
	public Wizard(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}
