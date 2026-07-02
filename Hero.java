public class Hero {
	String name;
	int hp;  // 現在のHP
	int maxHp; //現在の最大値
	Sword sword;
	
	//コンストラクタ
	public Hero(String name, int hp) {
		this.name = name ;
		this.hp = hp;
		this.sword = new Sword();
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	
	public void installation(String swordName, int damage) {
		this.sword.name = swordName;
		this.sword.damage = damage;
	}
	
	public final void sleep() {
		this.hp = maxHp;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、"+ sec +"秒座った");
		System.out.println("HPが"+ sec +"ポイント回復した");
		
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
		
	}
	public void run() {
		this.hp -= 5;
		System.out.println(this.name + "は、逃げた");
		System.out.println("GameOver");
		System.out.println("最終HPは"+ this.hp + "でした");
		
	}
}
