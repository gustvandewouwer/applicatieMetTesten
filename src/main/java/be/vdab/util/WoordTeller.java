package be.vdab.util;

import java.util.StringTokenizer;


public class WoordTeller {
	/**
	 * @param zin
	 * @return
	 */
	public int telWoorden(String zin) {
		return new StringTokenizer(zin, " ,").countTokens();
	}
}
