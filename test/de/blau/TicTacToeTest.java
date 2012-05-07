package de.blau;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {
	TicTacToe ticTacToe = new TicTacToe();

	@Test
	public void test() {
		assertNotNull(ticTacToe);
	}

	@Test
	public void testGrid() throws Exception {
		Grid grid = new Grid(4);
		assertEquals(4, grid.getSize());
	}

	@Test
	public void createPlayer() throws Exception {
		Player player = ticTacToe.createPlayer();
		assertNotNull(player);
		assertEquals(1, player.getId());
	}

	@Test
	public void addGrid() throws Exception {
		ticTacToe.setGrid(new Grid(4));
		assertNotNull(ticTacToe.getGrid());
	}

}
