package de.blau;

public class TicTacToe {

	private Grid grid;

	public Player createPlayer() {
		return new Player(1);
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
