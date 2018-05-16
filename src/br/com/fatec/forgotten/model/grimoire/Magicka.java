package br.com.fatec.forgotten.model.grimoire;

public abstract class Magicka {
	private boolean water, holy, dark, wind, chaos, fire, earth, nature;

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isHoly() {
		return holy;
	}

	public void setHoly(boolean holy) {
		this.holy = holy;
	}

	public boolean isDark() {
		return dark;
	}

	public void setDark(boolean dark) {
		this.dark = dark;
	}

	public boolean isWind() {
		return wind;
	}

	public void setWind(boolean wind) {
		this.wind = wind;
	}

	public boolean isChaos() {
		return chaos;
	}

	public void setChaos(boolean chaos) {
		this.chaos = chaos;
	}

	public boolean isFire() {
		return fire;
	}

	public void setFire(boolean fire) {
		this.fire = fire;
	}

	public boolean isEarth() {
		return earth;
	}

	public void setEarth(boolean earth) {
		this.earth = earth;
	}

	public boolean isNature() {
		return nature;
	}

	public void setNature(boolean nature) {
		this.nature = nature;
	}
	
	
}
