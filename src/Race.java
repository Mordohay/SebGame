
public abstract class Race {
	 private int health;
	 private int attack;
	 
	 public Race(int health,int attack){
		 this.health=health;
		 this.attack=attack;
	 }
	 

	public int getAttack() {
		return attack;
	}


	public int getHealth() {
		return health;
	}

}
