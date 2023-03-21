package model.characters;

import java.util.ArrayList;

import model.collectibles.Supply;
import model.collectibles.Vaccine;

public class Medic extends Hero {
	private int currentHp;
	private ArrayList<Vaccine> vaccineInventory ;
	private ArrayList<Supply> supplyInventory;
	//this.vaccineInventory = new ArrayList<>();
	public Medic(String name,int maxHp,int attackDmg,int maxActions){
		super(name,maxHp,attackDmg,maxActions);
		currentHp=maxHp;
		this.vaccineInventory = new ArrayList<>();
		this.supplyInventory = new ArrayList<>();
	}
}