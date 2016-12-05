package test;

public class Humain extends All implements Strategie {

	public Humain(String name) {
		super(name, true);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public void attack(All target){
		if (target.which == true)
		{
			target.hp += 4 ;
			System.out.println(this.name + " healed " + target.name);
		}
		else if (target.which == false)
		{
			target.hp -= this.att ;
			System.out.println(this.name + " attacked " + target.name);
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
