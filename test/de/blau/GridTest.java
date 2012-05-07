package de.blau;

import static junit.framework.Assert.assertNotNull;

import org.junit.Test;

public class GridTest {

	@Test
	public void create() {
		Grid grid = new Grid();
		assertNotNull(grid);
	}

}
