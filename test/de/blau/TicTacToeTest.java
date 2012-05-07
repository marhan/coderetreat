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
	public void createPlayer() throws Exception {
		Player player = ticTacToe.createPlayer();
		assertNotNull(player);
		assertEquals(1, player.getId());
	}

	@Test
	public void createPlayers() throws Exception {
		Player playerOne = ticTacToe.createPlayer();
		assertNotNull(playerOne);
		assertEquals(1, playerOne.getId());
		Player playerTwo = ticTacToe.createPlayer();
		assertNotNull(playerTwo);
		assertEquals(2, playerTwo.getId());
	}

	@Test
	public void testGridCreation() throws Exception {
		assertNotNull(ticTacToe.getGrid());
	}

	@Test
	public void init() throws Exception {
		ticTacToe.init();
		assertEquals(2, ticTacToe.getPlayers().size());

	}

	@Test
	public void testGridSize() throws Exception {
		assertEquals(16, ticTacToe.getGrid().getSize());
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
}
