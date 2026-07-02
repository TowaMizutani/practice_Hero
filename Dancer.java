public class Dancer extends Character {

	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵は3ポイントのダメージ");
		m.hp -= 3;
	}


	public void dance() {
		System.out.println(this.name + "は、情熱的に踊った！");
	}
}
