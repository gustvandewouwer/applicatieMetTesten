package be.vdab.valueobjects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsbnTest {
	@Test
	public void nummerMet13CijfersNaControleIsOk() {
		new Isbn(9789027439642L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void nummerMet14CijfersIsNietOk() {
		new Isbn(12345678901234L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void nummerMet12CijfersIsNietOk() {
		new Isbn(123456789012L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void nummerMetNulIsNietOk() {
		new Isbn(0L);
	}

	@Test
	public void toStringMoetHetNummerTerguggeven() {
		String nummer = "9789027439642";
		assertEquals(nummer, new Isbn(Long.parseLong(nummer)).toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void hetNummer0IsVerkeerd() {
		new Isbn(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void eenNummerDatNiet13PositiesInneemtIsVerkeerd() {
		new Isbn(123L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void eenNegatiefNummerIsVerkeerd() {
		new Isbn(-9789027439642L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void eenNummerMet12CijfersIsVerkeerd() {
		new Isbn(978902743964L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void eenNummerMet14CijfersIsVerkeerd() {
		new Isbn(97890274396421L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void deEerste3CijfersMoeten978of979Zijn() {
		new Isbn(9779227439643L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void eenNummerMet13CijfersMetVerkeerdControleGetal2() {
		new Isbn(8789027439642L);
	}

	@Test
	public void eenNummerMet13CijfersMetCorrectControleGetal2() {
		new Isbn(9789027439642L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void eenNummerMet13CijfersMetVerkeerdControleGetal3() {
		new Isbn(9789027439643L);
	}

	@Test
	public void eenNummerMet13CijfersMetCorrectControleGetal0() {
		new Isbn(9789227439640L);
	}

	@Test
	public void toStringMoetHetNummerTeruggeven() {
		long nummer = 9789027439642L;
		assertEquals(nummer, Long.parseLong(new Isbn(nummer).toString()));
	}

}
