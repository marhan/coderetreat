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
		Grid grid = new Grid();
		assertEquals(16, grid.getSize());
	}

	@Test
	public void init() throws Exception {
		ticTacToe.init();
		assertEquals(2, ticTacToe.getPlayers().size());
		assertEquals(1, ticTacToe.getPlayerOne().getId());
		assertEquals(2, ticTacToe.getPlayerTwo().getId());

	}

	@Test
	public void getPlayerOne() throws Exception {
		ticTacToe.init();
		assertEquals(1, ticTacToe.getPlayerOne().getId());
	}

	@Test
	public void playerOneDoesAMove() throws Exception {
		ticTacToe.init();
		Player playerOne = ticTacToe.getPlayerOne();
		assertEquals("x", playerOne.move());
	}

	@Test
	public void playerOneNotWinner() throws Exception {
		ticTacToe.init();
		Player playerOne = ticTacToe.getPlayerOne();
		assertEquals(false, playerOne.won());
	}


}
