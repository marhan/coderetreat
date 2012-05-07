package de.blau;

public class Grid {

	private final int size;

	private final Integer[] array = new Integer[16];

	public Grid(int i) {
		size = i;
	}

	public int getSize() {
		return array.length;
	}

}
