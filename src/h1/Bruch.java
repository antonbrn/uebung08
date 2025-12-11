package h1;

public class Bruch {

	public int zaehler;
	public int nenner;
	
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	private int ggT(int x, int y) {
		x = Math.abs(x);
		y= Math.abs(y);
		int tmpBig;
		int tmpSmall;
		if (x > y) {
			tmpBig = x;
			tmpSmall = y;
		} else {
			tmpBig = y;
			tmpSmall = x;
		}
		if (tmpSmall == 0) {
			return tmpBig;
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
			zaehler = zaehler / ggt;
			nenner = nenner / ggt;
		}
	}
	 
	public boolean hasSameValueAs(Bruch b) {
		shorten();
		b.shorten();
		if (nenner == 0 || b.nenner == 0) {
			return false;
		}
		if (zaehler == 0 && b.zaehler == 0 && nenner != 0 && b.nenner != 0) {
			return true;
		}
		
		if (Math.abs(this.zaehler) == Math.abs(b.zaehler) && Math.abs(this.nenner) == Math.abs(b.nenner)) {
			if (Math.signum(this.zaehler*this.nenner) ==  Math.signum(b.zaehler*b.nenner)) {
				return true;
			}
		} 
		return false;
	}
}
  