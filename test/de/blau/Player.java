package de.blau;

public class Player {

	private final int name;

	private boolean won;

	public Player(int i) {
		name = i;
	}

	public Object getId() {
		return name;
	}

	public String move() {
		return "x";
	}

	public boolean won() {
		return won;
	}

}
