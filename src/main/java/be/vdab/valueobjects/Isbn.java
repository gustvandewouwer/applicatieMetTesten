package be.vdab.valueobjects;

import java.util.regex.Pattern;

public class Isbn {
	private static final Pattern REG_EXPR = Pattern.compile("^(978|979)\\d{10}$");

	private long nummer;

	public Isbn(long nummer) {
		String nummerStr = Long.toString(nummer);

		if (!REG_EXPR.matcher(nummerStr).matches()) {
			throw new IllegalArgumentException("Verkeerd formaat");
		}

		long som = 0, somEven = 0, somOneven = 0;

		char[] charArray = nummerStr.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i < 12) {
				if (i % 2 == 0) { // oneven omdat i met 0 begint
					somOneven += Character.getNumericValue(nummerStr.charAt(i));
				} else {
					somEven += Character.getNumericValue(nummerStr.charAt(i));
				}
			}
		}

		somEven *= 3;

		som = somEven + somOneven;

		long verschil = (som / 10 + 1) * 10 - som;

//		long somTmp = som / 10;
//		somTmp = somTmp + 1;
//		somTmp = somTmp * 10;

//		long verschil = somTmp - som;

		if (verschil == 10) {
			if (Character.getNumericValue(nummerStr.charAt(12)) != 0) {
				throw new IllegalArgumentException("Verkeerd laatste cijfer");
			}
		} else {
			if (Character.getNumericValue(nummerStr.charAt(12)) != verschil) {
				throw new IllegalArgumentException("Verkeerd laatste cijfer");
			}
		}
		this.nummer = nummer;
	}

	public String toString() {
		return Long.toString(nummer);
	}
}
