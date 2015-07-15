package elena;
import java.math.*;
import java.lang.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Circle extends Shape {
	
	private double raza;
	
	public Circle( double raza , int x, int y, int z) throws RazaNegativaException {
		
		super(x,y,z);
		this.raza = raza;
		
		if( raza < 0 ) {
			throw new RazaNegativaException();
		}	
	}
	
	public double getArie() {
		
		return (Math.PI *this.raza*this.raza);
	}
	
	public double getPerimetru() {
		
		return 2*Math.PI*this.raza;
	}
	
	public String toString() {
		
		//return " Arie cerc: " + this.getArie() + " Perimetru cerc: " + this.getPerimetru();
		return  ToStringBuilder.reflectionToString(this);
		
	}
	
	public double getRaza() {
		return this.raza;
	}
	

	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(raza);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result; 
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Circle == false) {
			return false;
		}
		
		Circle circle = (Circle) obj;
		return new EqualsBuilder().append(this.raza, circle.raza).append(this.x, circle.x).append(this.y, this.y).build();
		
		/*if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Circle)) {
			return false;
		}
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(raza) != Double
				.doubleToLongBits(other.raza)) {
			return false;
		}
		return true; */
	}
	

}
