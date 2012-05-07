package de.blau;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

	private Grid grid;

	private int id = 0;

	private List<Player> players;

	public TicTacToe() {
		this.grid = new Grid();
	}

	public Player createPlayer() {
		id++;
		return new Player(id);
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public void init() {
		players = new ArrayList<Player>();
		players.add(createPlayer());
		players.add(createPlayer());
	}

	public List<Player> getPlayers() {
		return players;
	}

	public Player getPlayerOne() {
		return players.get(0);
	}

	public void setField(int i, int j, String string) {

	}

	public String getField(int i, int j) {
		return "x";
	}
}
