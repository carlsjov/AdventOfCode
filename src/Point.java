import java.util.ArrayList;

public class Point {
	private ArrayList<Integer> x;
	private ArrayList<Integer> y;

	/* 
	 * #Creates a point that holds an list of points that it crosses.
	 * 
	 * a and b are the starting coordinates.
	 * 
	 * x and y are the finishing coordinates.
	 */
	
	Point(ArrayList<Integer> x, ArrayList<Integer> y){
		for(int i=0;i<x.size();i++) {
			this.x.add(x.get(i));
			this.y.add(y.get(i));
		}
	}
	
	public int returnX(int a) {
		return this.x.get(a);
	}
	
	public int returnY(int a) {
		return this.y.get(a);
	}
}
