package be.vdab.valueobjects;

public class Woord {
	private String woord;

	public Woord(String woord) {
		this.woord = woord;
	}

	public boolean isPalindroom() {
		int n = woord.length();
		for (int i = 0; i < (n / 2); ++i) {
			if (woord.charAt(i) != woord.charAt(n - i - 1)) {
				return false;
			}
		}

		return true;
	}

}
