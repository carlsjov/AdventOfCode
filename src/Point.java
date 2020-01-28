
public class Point {
	private int y;
	private ArrayList<Integer> x;
	/* 
	 * #Creates a point that holds an list of points that it crosses.
	 * 
	 * a and b are the starting coordinates.
	 * 
	 * x and y are the finishing coordinates.
	 */
	
	Point(int x, int y, int a, int b){
		this.y = y;
		for(int i=a; i<=x;i++) {
			this.x.add(a);
		}
	}
	
	public int returnX() {
		return x;
	}
	
	public int returnY() {
		return y;
	}
}
