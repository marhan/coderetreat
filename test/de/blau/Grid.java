package de.blau;

public class Grid {


	private final Integer[] array = new Integer[16];

	public Grid() {
		for (int i = 0; i < array.length; i++) {
			array[i] = new Integer(0);
		}
	}

	public int getSize() {
		return array.length;
	}

}
