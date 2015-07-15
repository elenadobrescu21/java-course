package elena;

public class Rectangle extends Shape{
	
	private double lungime;
	private double latime;
	
	
	public Rectangle(double lungime, double latime, int x, int y, int z) throws LungimeNegativaException, LatimeNegativaException {
		
		super(x,y,z);
		
		this.lungime = lungime;
		this.latime = latime;
		
		if ( lungime < 0) {
			throw new LungimeNegativaException();
		}
		
		if( latime < 0 ) {
			throw new LatimeNegativaException();
		}
	}
		
	
	public double getArie() {
		return this.lungime* this.latime;
	}
	
	public double getPerimetru() {
		return 2*this.lungime + 2*this.latime;
	}
	
	public String toString() {
	
		return " Arie dreptunghi:" + this.getArie() + " Perimetru dreptunghi :" + this.getPerimetru();
	}
	
	public double getLungime() {
		return this.lungime;
	}
	
	public double getLatime() {
		return this.latime;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(latime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lungime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(latime) != Double
				.doubleToLongBits(other.latime)) {
			return false;
		}
		if (Double.doubleToLongBits(lungime) != Double
				.doubleToLongBits(other.lungime)) {
			return false;
		}
		return true;
	}

}
