package model.characters;
import java.util.ArrayList;

import model.collectibles.*;
public class Hero extends Character {
	private int actionsAvailable;
	private int maxActions;
	private boolean specialAction;
	private ArrayList<Vaccine> vaccineInventory=this.vaccineInventory = new ArrayList<>();
	private ArrayList<Supply> supplyInventory=this.supplyInventory = new ArrayList<>();
	public Hero(String name, int maxHp, int attackDmg, int maxActions){
		super(name,maxHp,attackDmg);
		this.maxActions = maxActions;
		actionsAvailable = maxActions;
		
	}
	
	public int getActionsAvailable() {
		return actionsAvailable;
	}

	public void setActionsAvailable(int actionsAvailable) {
		this.actionsAvailable = actionsAvailable;
	}

	public int getMaxActions() {
		return maxActions;
	}

	public boolean isSpecialAction() {
		return specialAction;
	}

	public void setSpecialAction(boolean specialAction) {
		this.specialAction = specialAction;
	}

	public ArrayList<Vaccine> getVaccineInventory() {
		return vaccineInventory;
	}

	public ArrayList<Supply> getSupplyInventory() {
		return supplyInventory;
	}
}

