import java.util.ArrayList;

public class Path{
	private ArrayList<String> com;
	private int MAX;
	private int MIN;
	private ArrayList<ArrayList<String>> map;
	
	Path(int x, int y1, x1, int y1{
		for(int i=0;i<a.length();i++) {
			this.com.add(a.substring(i, a.indexOf(",", i)));
			i=a.indexOf(",",i);
		}		
	}
	
	public int max(Path p) {
		this.MAX = Integer.parseInt(p.com.get(0).substring(1));
		for(int i=0;i<p.com.size();i++) {
			Math.max(this.MAX, Integer.parseInt(p.com.get(i).substring(1)));
		}
		return this.MAX;
	}
	
	public int min(Path p) {
		this.MIN = Integer.parseInt(p.com.get(0).substring(1));
		for(int i=0;i<p.com.size();i++) {
			Math.min(this.MIN, Integer.parseInt(p.com.get(i).substring(1)));
		}
		return this.MIN;
	}
}
