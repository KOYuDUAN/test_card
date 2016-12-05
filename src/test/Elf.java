package test;

public class Elf extends All implements Strategie{

	public Elf(String name) {
		super(name, false);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack1(All target1, All target2){
		if (target1.which == true && target2.which == true)
		{
			target1.hp -= this.att ;
			target2.hp -= this.att ;
			this.hp -= 4;
			System.out.println(this.name + " attacked " + target1.name + " and " + target2.name + " and lose 4 hp");
		}
		else
			System.out.println("error");
	}

	@Override
	public void ai(Desk desk, All me) {
		// TODO Auto-generated method stub
		Strategie1 str = new Strategie1();
		str.ai(desk, me);
	}
}
