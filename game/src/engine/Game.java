package engine;
import model.world.*;
import model.characters.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
public class Game {
	public static ArrayList<Hero> availableHeros;
	public static ArrayList<Hero> heros;
	public static ArrayList<Zombie> zombies;
	public static Cell [][] map;
	public Game() {
		
		
	}
	public static void loadHeros(String filePath) throws Exception  {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        availableHeros = new ArrayList<Hero>();
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            String name = data[0];
            String type = data[1];
            int maxHp = Integer.parseInt(data[2]);
            int maxActions = Integer.parseInt(data[3]);
            int attackDmg = Integer.parseInt(data[4]);
            switch(type) {
            case "FIGH": availableHeros.add(new Fighter(name,maxHp,attackDmg,maxActions));
            break;
            case "EXP" :availableHeros.add(new Explorer(name,maxHp,attackDmg,maxActions)); ; break;
            case "MED" : availableHeros.add(new Medic(name,maxHp,attackDmg,maxActions)); break;
            }
	}
    reader.close();	
	
}
}
