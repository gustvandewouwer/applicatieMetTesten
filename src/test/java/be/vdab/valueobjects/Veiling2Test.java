package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Veiling2Test {
	Veiling2 veiling2;
	
	@Before
	public void before() {
		veiling2 = new Veiling2();
	}

	@Test
	public void als_nog_geen_bod_gedaan_is_hoogste_bod_gelijk_aan_0() {
//		Veiling2 veiling2 = new Veiling2();
		assertEquals(0, veiling2.getHoogsteBod());
	}

	@Test
	public void na_eerste_bod_is_hoogste_bod_gelijk_aan_dit_bod() {
//		Veiling2 veiling2 = new Veiling2();
		veiling2.doeBod(100);
		assertEquals(100, veiling2.getHoogsteBod());
		
	}

	@Test
	public void na_meerdere_boden_is_hoogste_bod_gelijk_aan_hoogste_bod() {
//		Veiling2 veiling2 = new Veiling2();
		veiling2.doeBod(200);
		veiling2.doeBod(100);
		assertEquals(200, veiling2.getHoogsteBod());
		
	}
}
