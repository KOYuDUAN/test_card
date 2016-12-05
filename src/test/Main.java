package test;

public class Main {
	static public void main(String[] args){
	Desk desk = new Desk();
	//ini
	All e1 = new Elf("adam");
	All e2 = new Elf("adam1");
	All e3 = new Elf("adam2");
	All h1 = new Humain("yu");
	All h2 = new Humain("yu2");
	All h3 = new Humain("yu3");
	desk.add(e1);
	desk.add(e2);
	desk.add(e3);
	desk.add(h1);
	desk.add(h2);
	desk.add(h3);
	
	for (int i = 0 ; i < desk.alls.size(); i++ )
	{
		if (desk.alls.get(i).which == true)
			desk.humains.add(desk.alls.get(i));
		else 
			desk.elfs.add(desk.alls.get(i));
	}
	//
	
		while (desk.ifWin() == false)
		{	
			for (int i = 0 ; i < desk.alls.size(); i++ )
			{
				All a = desk.alls.get(i);
				System.out.println("============take action=============");
				a.ai(desk, a);
				System.out.println("============current situation=============");
				for (int j = 0 ; j < desk.alls.size(); j++ )
				{
				System.out.println(desk.alls.get(j).name + " : " +desk.alls.get(j).hp);
				}
			}
		}
		if (desk.alls.get(0).which == true)
			System.err.println("Humain win");
		else
			System.err.println("Elf win");
		
	}
	

	
}
