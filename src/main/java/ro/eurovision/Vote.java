package ro.eurovision;

import java.util.Random;

public interface Vote {
	
	public static final int[] points = new int[] {1, 2,3, 4,5,6,7,8,10,12};
	public static final Random rand = new Random();
	public int getPoints();

}
