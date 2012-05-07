package de.blau;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void test() {
		TicTacToe ticTacToe = new TicTacToe();
		assertNotNull(ticTacToe);
	}

	@Test
	public void testGrid() throws Exception {
		Grid grid = new Grid(4);
		assertEquals(4, grid.getSize());
	}

}
