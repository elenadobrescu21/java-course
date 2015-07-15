package elena;

public abstract class Shape {
	
	
	protected int x;
	protected int y;
	protected int z;
	
	public Shape(int x, int y, int z) {
		this.x = x;
		this.y= y;
		this.z = z;	
	}
	
	public abstract double getArie();
	public abstract double getPerimetru();
	
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}
