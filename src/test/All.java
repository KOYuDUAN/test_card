package test;

public abstract class All implements Strategie{
	String name;
	int hp;
	int att;
	boolean which; // true for humain
	
	public All(String name, boolean which){
		this.name = name;
		this.which = which;
		this.hp = 30;
		this.att = 5;
	}

	public void repose(){
		this.hp += 5;
		System.out.println(this.name + " rest and heal himself" );
	}
	
	public boolean ifDead(){
		if (this.hp <= 0)
		return true;
		else
			return false;
	}
	public void attack(All target){
		target.hp -= this.att;
		System.out.println(this.name + " attacked1 " + target.name);
	}
	public void attack1(All target1,All target2){}
	public void ai(Desk desk, All all) {}
}
