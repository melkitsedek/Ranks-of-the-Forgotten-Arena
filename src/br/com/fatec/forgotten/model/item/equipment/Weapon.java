package br.com.fatec.forgotten.model.item.equipment;

public class Weapon extends Equipment {
	private int attackSpeed, baseDamage;
	private String type;
	
	public int getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	public int getBaseDamage() {
		return baseDamage;
	}
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
