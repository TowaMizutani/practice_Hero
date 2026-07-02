
public class SuperHero extends Hero {

	boolean flying;
	
	public SuperHero(String name, int hp) {
		super(name, hp);
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
	
	
	@Override
	public void run() {
		if(flying) {
			System.out.println(this.name + "は飛び去って逃げた");
		}else {
			super.run();
		}
	}
	
}
