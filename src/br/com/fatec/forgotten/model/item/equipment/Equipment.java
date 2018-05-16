package br.com.fatec.forgotten.model.item.equipment;

import java.util.ArrayList;

import br.com.fatec.forgotten.model.grimoire.Enchantment;

public abstract class Equipment {
	private ArrayList<Enchantment> enchantments;
	private String composition;
	
	public ArrayList<Enchantment> getEnchantments() {
		return enchantments;
	}
	public void setEnchantments(ArrayList<Enchantment> enchantments) {
		this.enchantments = enchantments;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	
	
}
