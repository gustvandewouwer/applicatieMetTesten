package be.vdab.valueobjects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindroomTest {

	@Test
	public void tepel_is_geen_palindroom() {
		Palindroom pal = new Palindroom("tepel");
		assertFalse(pal.isPalindroom());
	}

	@Test
	public void lepel_is_een_palindroom() {
		Palindroom pal = new Palindroom("lepel");
		assertTrue(pal.isPalindroom());
	}

	@Test
	public void ll_is_een_palindroom() {
		Palindroom pal = new Palindroom("ll");
		assertTrue(pal.isPalindroom());
	}

	@Test
	public void l_is_een_palindroom() {
		Palindroom pal = new Palindroom("l");
		assertTrue(pal.isPalindroom());
	}

	@Test
	public void null_is_geen_palindroom() {
		Palindroom pal = new Palindroom(null);
		assertFalse(pal.isPalindroom());
	}

	@Test
	public void spatie_is_geen_palindroom() {
		Palindroom pal = new Palindroom(" ");
		assertTrue(pal.isPalindroom());
	}

}
