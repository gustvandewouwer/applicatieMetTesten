package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class WoordTest {

	@Test
	public void lepelIsEenPalindroom() {
		assertTrue(new Woord("lepel").isPalindroom());
	}

	@Test
	public void dagIsGeenPalindroom() {
		assertFalse(new Woord("dag").isPalindroom());
	}

	@Test
	public void veeeevIsEenPalindroom() {
		assertTrue(new Woord("veeeev").isPalindroom());
	}

}
