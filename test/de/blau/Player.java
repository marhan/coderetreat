package de.blau;

public class Player {

	private final int name;

	public Player(int i) {
		name = i;
	}

	public Object getId() {
		return name;
	}

	public String move() {
		return "x";
	}

}
