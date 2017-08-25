package be.vdab.valueobjects;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VeilingTest {

	private Veiling veiling;

	@Before
	public void before() {
		veiling = new Veiling();
	}

	@Test
	public void alsNogGeenBodGedaanIsHoogsteBodNul() {
		// Veiling veiling = new Veiling();
		assertEquals(0, veiling.getHoogsteBod());
	}

	@Test
	public void naEersteBodIsHoogsteBodEersteBod() {
		// Veiling veiling = new Veiling();
		veiling.doeBod(100);
		assertEquals(100, veiling.getHoogsteBod());
	}

	@Test
	public void naMeerderBodenIsHoogsteBodHoogsteBod() {
		// Veiling veiling = new Veiling();
		veiling.doeBod(100);
		veiling.doeBod(10);
		veiling.doeBod(25);
		veiling.doeBod(101);
		veiling.doeBod(99);
		assertEquals(101, veiling.getHoogsteBod());
	}

}
