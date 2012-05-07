package de.blau;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

	private Grid grid;

	private int id = 0;

	public TicTacToe() {
		this.grid = new Grid(4);
	}

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

	public void init() {

	}

	public List<Player> getPlayers() {
		List<Player> list = new ArrayList<Player>();
		list.add(createPlayer());
		list.add(createPlayer());
		return list;
	}
}
