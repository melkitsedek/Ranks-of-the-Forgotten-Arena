package br.com.fatec.forgotten.model.character;

import br.com.fatec.forgotten.model.item.equipment.Armor;
import br.com.fatec.forgotten.model.item.equipment.Weapon;

public abstract class Character {
	private String name;
	
	/**about attributes:
	*	strength	->		physical damage and defense
	*	speed		->		chance to dodge and attack speed
	*	magic		->		magical damage and defense
	*	wisdom		->		physical and magical defense
	**/
	
	private int strength, speed, magic, wisdom, level, healthPoints, manaPoints;
	private Armor armor;
	private Weapon weapon;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getManaPoints() {
		return manaPoints;
	}

	public void setManaPoints(int manaPoints) {
		this.manaPoints = manaPoints;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
