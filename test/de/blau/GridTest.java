package de.blau;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridTest {
	Grid grid = new Grid();

	@Test
	public void create() {
		assertNotNull(grid);
	}

	@Test
	public void testSize() throws Exception {

		assertEquals(16, grid.getSize());
	}


}
