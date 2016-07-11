import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import monster.Monster;
import monster.RedDragon;
import monster.WhiteDragon;
import monster.Vampire;
import race.Dwarf;
import race.Elf;
import race.Human;
import race.Orc;
import race.Race;

// trois choix par tour : attaquer, esquiver, fuir
public class Game {
	
	private List<Monster> MonsterList = new ArrayList<Monster>();
	Location TabLocation[] = new Location[4];
	
	
	public void CreateMonster(){
		MonsterList.add(new RedDragon());
		MonsterList.add(new Vampire());
		MonsterList.add(new WhiteDragon());
		
		TabLocation[0]=new Location("TowerOfPain");
		TabLocation[1]=new Location("Oasis of peace");
		TabLocation[2]=new Location("DarkCastle");
		
		int n=0;
		for(int i=0;i<3;i++){
			Random r =  new Random();
			n = r.nextInt(3);
			TabLocation[i].setLocationMonster(MonsterList.get(n));
		}
		
	}
	
	public Game(){
		CreateMonster();
	}
	
	

	

}
