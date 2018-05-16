package br.com.fatec.forgotten.model.grimoire;

public class Enchantment extends Magicka {
	
	// about: equipment bonuses
	 
	private int damageBonus, defenseBonus, 
		strengthBonus, magicBonus, speedBonus, wisdomBonus;

	public int getDamageBonus() {
		return damageBonus;
	}

	public void setDamageBonus(int damageBonus) {
		this.damageBonus = damageBonus;
	}

	public int getDefenseBonus() {
		return defenseBonus;
	}

	public void setDefenseBonus(int defenseBonus) {
		this.defenseBonus = defenseBonus;
	}

	public int getStrengthBonus() {
		return strengthBonus;
	}

	public void setStrengthBonus(int strengthBonus) {
		this.strengthBonus = strengthBonus;
	}

	public int getMagicBonus() {
		return magicBonus;
	}

	public void setMagicBonus(int magicBonus) {
		this.magicBonus = magicBonus;
	}

	public int getSpeedBonus() {
		return speedBonus;
	}

	public void setSpeedBonus(int speedBonus) {
		this.speedBonus = speedBonus;
	}

	public int getWisdomBonus() {
		return wisdomBonus;
	}

	public void setWisdomBonus(int wisdomBonus) {
		this.wisdomBonus = wisdomBonus;
	}
	
	
}
