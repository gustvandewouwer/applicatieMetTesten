package be.vdab.valueobjects;

public class Veiling2 {

	private int bod = 0;
	
	public void doeBod(int bod) {
		if (bod > this.bod) {
			this.bod = bod;
		}
	}
	
	public int getHoogsteBod() {
		return bod;
	}
}
