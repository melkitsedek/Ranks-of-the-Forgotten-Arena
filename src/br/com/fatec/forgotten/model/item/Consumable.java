package br.com.fatec.forgotten.model.item;

public class Consumable extends Item {
	private int duration, lifeGain, manaGain,
		strengthBonus, speedBonus, magicBonus, wisdomBonus, 
		defenseBonus, damageBonus;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getLifeGain() {
		return lifeGain;
	}

	public void setLifeGain(int lifeGain) {
		this.lifeGain = lifeGain;
	}

	public int getManaGain() {
		return manaGain;
	}

	public void setManaGain(int manaGain) {
		this.manaGain = manaGain;
	}

	public int getStrengthBonus() {
		return strengthBonus;
	}

	public void setStrengthBonus(int strengthBonus) {
		this.strengthBonus = strengthBonus;
	}

	public int getSpeedBonus() {
		return speedBonus;
	}

	public void setSpeedBonus(int speedBonus) {
		this.speedBonus = speedBonus;
	}

	public int getMagicBonus() {
		return magicBonus;
	}

	public void setMagicBonus(int magicBonus) {
		this.magicBonus = magicBonus;
	}

	public int getWisdomBonus() {
		return wisdomBonus;
	}

	public void setWisdomBonus(int wisdomBonus) {
		this.wisdomBonus = wisdomBonus;
	}

	public int getDefenseBonus() {
		return defenseBonus;
	}

	public void setDefenseBonus(int defenseBonus) {
		this.defenseBonus = defenseBonus;
	}

	public int getDamageBonus() {
		return damageBonus;
	}

	public void setDamageBonus(int damageBonus) {
		this.damageBonus = damageBonus;
	}
	
	
}
