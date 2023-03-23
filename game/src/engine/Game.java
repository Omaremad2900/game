package engine;
import model.world.*;
import model.characters.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
public class Game {
	public static ArrayList<Hero> availableHeroes;
	public static ArrayList<Zombie> zombies;
	public static Cell [][] map=new Cell[15][15];
	public static ArrayList<Hero> heroes;
	public Game() {
		
	}
	public static void loadHeroes(String filePath) throws Exception  {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = "";
        availableHeroes=new ArrayList<>();
        	while ((line = reader.readLine()) != null) {
        		String[] data = line.split(",");
        		String name = data[0];
        		String type = data[1];
        		int maxHp = Integer.parseInt(data[2]);
        		int maxActions = Integer.parseInt(data[3]);
        		int attackDmg = Integer.parseInt(data[4]);
        		switch(type) {
        		case "FIGH": availableHeroes.add(new Fighter(name,maxHp,attackDmg,maxActions));
        		break;
        		case "EXP" :availableHeroes.add(new Explorer(name,maxHp,attackDmg,maxActions)); break;
        		case "MED" : availableHeroes.add(new Medic(name,maxHp,attackDmg,maxActions)); break;
        		}
	}
        	 reader.close();	
        }
	
}

