package h1;

public class Bruch {

	public int zaehler;
	public int nenner;
	
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	private int ggT(int x, int y) {
		int tmpBig;
		int tmpSmall;
		if (x > y) {
			tmpBig = x;
			tmpSmall = y;
		} else {
			tmpBig = y;
			tmpSmall = x;
		}
		if (x == 0 || y == 0) {
			return Math.abs(tmpBig) > Math.abs(tmpSmall) ? tmpBig : tmpSmall ;
		}
		
		while (tmpSmall != 0) {
	        int rest = tmpBig % tmpSmall;
	        tmpBig = tmpSmall;
	        tmpSmall = rest;
	    }
	    return tmpBig;
	}
	
	public void shorten() {
		if (nenner != 0) {
			int ggt = ggT(zaehler, nenner);
			zaehler = Math.abs(zaehler) / ggt;
			nenner = Math.abs(nenner) / ggt;
		}
	}
	
	public boolean hasSameValueAs(Bruch b) {
		shorten();
		b.shorten();
		return (this.zaehler == b.zaehler && this.nenner == b.nenner);
	}
}
  