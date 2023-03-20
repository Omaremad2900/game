package model.characters;

public class Zombie extends Character {
	private static int ZOMBIE_COUNT;
	
	 Zombie(){
		super("Zombie"+ZOMBIE_COUNT,40,10);
		ZOMBIE_COUNT++;
	}
}