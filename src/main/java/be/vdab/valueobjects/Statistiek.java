package be.vdab.valueobjects;

import java.math.BigDecimal;

public class Statistiek {
	public static BigDecimal getGemiddelde(BigDecimal[] getallen) {
		if (getallen.length == 0) {
			throw new IllegalArgumentException("Lege array");
		}

		BigDecimal gemiddelde = BigDecimal.ZERO;
		for (BigDecimal getal : getallen) {
			gemiddelde = gemiddelde.add(getal);
		}
		return gemiddelde.divide(BigDecimal.valueOf(getallen.length));
		
//		return Arrays.stream(getallen).reduce(BigDecimal.ZERO, (vorigTotaal, getal) -> vorigTotaal.add(getal))
//				.divide(BigDecimal.valueOf(getallen.length));
	}
}