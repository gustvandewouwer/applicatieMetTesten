package be.vdab.valueobjects;

public class Palindroom {
	private String woord;

	public Palindroom(String woord) {
		if (woord == null || woord.trim().length() == 0) {
			throw new IllegalArgumentException();
		}
		this.woord = woord;
	}
	
	public boolean isPalindroom() {
		return new StringBuilder(woord).reverse().toString().equals(woord);
//		StringBuilder sb = new StringBuilder(woord);
//		System.out.println("woord= " + sb.toString());
//		System.out.println("woord reversed= " + sb.reverse().toString());
//		if (sb.toString().equals(sb.reverse().toString())) {
//			return true;
//		}
//		return false;
	}
	
	
}
