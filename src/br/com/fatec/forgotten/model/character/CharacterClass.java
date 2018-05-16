package br.com.fatec.forgotten.model.character;

import java.util.ArrayList;

import br.com.fatec.forgotten.model.grimoire.Skill;

public class CharacterClass {
	private String className;
	private ArrayList<Skill> skills;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public ArrayList<Skill> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
	}
	
	
}
