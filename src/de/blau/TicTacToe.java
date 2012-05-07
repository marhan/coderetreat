package de.blau;

public class TicTacToe {

	private Grid grid;

	private int id = 0;

	public Player createPlayer() {
		id++;
		return new Player(id);
	}

	public void setGrid(Grid grid) {
		// TODO Auto-generated method stub
		this.grid = grid;
	}

	public Grid getGrid() {
		// TODO Auto-generated method stub
		return grid;
	}

}
