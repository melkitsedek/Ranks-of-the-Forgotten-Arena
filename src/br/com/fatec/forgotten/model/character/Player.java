package br.com.fatec.forgotten.model.character;

import java.util.ArrayList;

import br.com.fatec.forgotten.model.item.Item;

public class Player extends Character {
	private String skinColor, hairColor, amorColor;
	private int rank;
	private ArrayList<Item> inventory;
	
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getAmorColor() {
		return amorColor;
	}
	public void setAmorColor(String amorColor) {
		this.amorColor = amorColor;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public ArrayList<Item> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
	
	
	
}
