package test;

public class Strategie1 implements Strategie {
	
	public void deskRemove(Desk desk, All all){
			if (all.ifDead())
			desk.remove(desk, all);
		
	}
	@Override
	public void ai(Desk desk, All me) {
		// TODO Auto-generated method stub
		if (me.hp <= 10)
			me.repose();
			
		else if (me.which == true )
			{	double ran=Math.random();
				if (ran <= 0.5)
				{	All h = desk.getRandomE();
					me.attack(h);
					this.deskRemove(desk, h);}
				else
					{	All h = desk.getRandomH();
						me.attack(h);}
			}
		else 
			{	
			if (desk.humains.size() > 1)
				{	All h1= desk.getRandomH();
					All h2= desk.getRandomH();
					while (h1 == h2)
						h2 = desk.getRandomH();
					me.attack1(h1, h2);
					this.deskRemove(desk, h1);
					this.deskRemove(desk, h2);}
				else if (desk.humains.size() == 1)
				{	All h = desk.humains.get(0);
					me.attack(h);
					this.deskRemove(desk, h);}
				else 
				{	me.repose();}
			}
				
		}
		
//System.out.println("heelo");
			
	}

