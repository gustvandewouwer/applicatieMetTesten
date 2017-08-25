package be.vdab.valueobjects;

public class Veiling {

	private int bod = 0;
	
	public void doeBod(int bedrag) {
		if (bedrag > bod) {
			bod = bedrag;
		}
	}
	
	public int getHoogsteBod() {
		return bod;
	}
	
	
}
