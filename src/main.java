import java.util.Scanner;

import race.Dwarf;
import race.Elf;
import race.Human;
import race.Orc;
import race.Race;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b=true;
		int n;
		Game game = new Game();
		
		System.out.printf(" \n Please enter a name:");
		String name = sc.nextLine();
		
		
		
		while(b){
			System.out.printf(" \n Please enter your Race:");
			System.out.printf("[Dwarf] [Elf]  [Human] [Orc]");
			String race = sc.nextLine();
			switch (race){
				case "Dwarf":
					b=false;
					Race Dwarf1 = new Dwarf();
					break;
			
				case "Oasis of peace":
					b=false;
					n=1;
					System.out.printf("You will face :" + game.TabLocation[n].getLocationMonster());
					break;
				case "DarkCastle":
					b=false;
					n=2;
					System.out.printf("You will face :" + game.TabLocation[n].getLocationMonster());
					break;
				default:
					b=true;
					break;
			
			}
	
		}	
		
		b=true;
		
		while(b){
			System.out.printf("\n Game created successfully ! \n Please choose a place to fight : \n");
			System.out.printf("[TowerOfPain] [Oasis of peace]  [DarkCastle]");
			String place = sc.nextLine();
			
			switch (place){
				case "TowerOfPain":
					b=false;
					n=0;
					System.out.printf("You will face :" + game.TabLocation[n].getLocationMonster());
					break;
			
				case "Oasis of peace":
					b=false;
					n=1;
					System.out.printf("You will face :" + game.TabLocation[n].getLocationMonster());
					break;
				case "DarkCastle":
					b=false;
					n=2;
					System.out.printf("You will face :" + game.TabLocation[n].getLocationMonster());
					break;
				default:
					b=true;
					break;
			
			}
	
		}		
		// TODO Auto-generated method stub


	}

}
