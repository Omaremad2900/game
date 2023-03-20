package model.world;
import java.util.Random;
public class Trapcell extends Cell {
	private int trapDamage;
	public Trapcell() {
		Random rand = new Random();
		trapDamage=(1+rand.nextInt(3))*10;
	}
	public int getTrapDamage() {
		return trapDamage;
	}
}
