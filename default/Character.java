public abstract class Character {
	
	private String name;
	private int hp;
	
	public Character(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
	

	public void run() {
		System.out.println(this.name + "は、逃げ出した。");
	}
	
	public abstract void attack(Matango m);
	
	private void die () {
		System.out.println(this.name + "は死亡した");
		System.out.println("GameOver");
	}
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getName() {
		return this.hp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
