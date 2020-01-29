import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\carls\\Documents\\AdventOfCode");
		Scanner sc = new Scanner(f);

		StringBuilder path1 = new StringBuilder(sc.nextLine());
		StringBuilder path2 = new StringBuilder(sc.nextLine());
		sc.close();
		
		ArrayList<Integer> path1x = new ArrayList<Integer>();
		ArrayList<Integer> path1y = new ArrayList<Integer>();
		path1x.add(0);
		path1y.add(0);
		ArrayList<Integer> path2x = new ArrayList<Integer>();
		ArrayList<Integer> path2y = new ArrayList<Integer>();
		path2x.add(0);
		path2y.add(0);
		
	}
	
	public static Point createCoordinates(StringBuilder path, ArrayList<Integer> x, ArrayList<Integer> y){
		for(int i=0;i<path.length();i++) {
			if(path.charAt(i)=='R') {
				for(int j=x.get(x.size()-1);j<=x.get(x.size()-1)+Integer.parseInt(path.substring(i+1,path.indexOf(",", i)));j++) {
					x.add(j);
					y.add(y.get(y.size()-1));
				}
			} else if(path.charAt(i)=='L') {
				for(int j=x.get(x.size()-1);j>=x.get(x.size()-1)-Integer.parseInt(path.substring(i+1, path.indexOf(",", i)));j--) {
					x.add(j);
					y.add(y.get(y.size()-1));
				}	
			} else if(path.charAt(i)=='U') {
				for(int j=y.get(y.size()-1);j<=y.get(y.size()-1)+Integer.parseInt(path.substring(i+1, path.indexOf(",", i)));j++) {
					y.add(j);
					x.add(x.get(x.size()-1));
				}	
			} else if(path.charAt(i)=='D') {
				for(int j=y.get(y.size()-1);j>=y.get(y.size()-1)+Integer.parseInt(path.substring(i+1, path.indexOf(",", i)));j++) {
					y.add(j);
					x.add(x.get(x.size()-1));
					//MIETI MATEMATIIKKAA
				}	
			}
		}
		return new Point(x, y);
	}

}
