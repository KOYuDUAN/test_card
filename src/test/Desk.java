package test;
import java.util.ArrayList;


public class Desk {
	
	public ArrayList<All> alls=new ArrayList<All>();
	public ArrayList<All> humains=new ArrayList<All>();
	public ArrayList<All> elfs=new ArrayList<All>();
	
	public All getRandom() {
		double ran=Math.random();
		int rand = (int) (alls.size() * ran);
		return alls.get(rand);
	}
	
	public All getRandomH() {
//		All all = this.getRandom();
//		while (all.which != true)
//			all = this.getRandom();
//		return all;
		double ran=Math.random();
		int rand = (int) (humains.size() * ran);
		return humains.get(rand);
	}
	
	public All getRandomE() {
//		All all = this.getRandom();
//		while (all.which != false)
//			all = this.getRandom();
//		return all;
		double ran=Math.random();
		int rand = (int) (elfs.size() * ran);
		return elfs.get(rand);
	}
	
	public void add(All all){
		if(all==null) return;
		this.alls.add(all);
	}
	
	public void remove(Desk desk, All all)
	{
		desk.alls.remove(all);
		if (all.which == true)
			desk.humains.remove(all);
		else
			desk.elfs.remove(all);
	}
	public boolean ifWin(){
		
//			Boolean d = this.alls.get(0).which;
//			for (int j = 1; j <= this.alls.size();j++)
//				{if (this.alls.get(j).which != d)
//						return false;}
//			return true;
		if(this.elfs.size() == 0 || this.humains.size() == 0)
			return true;
		else
			return false;
		}

}
