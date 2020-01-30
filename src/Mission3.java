import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\carls\\Documents\\AdventOfCode\\wires.txt");
		Scanner sc = new Scanner(f);

		StringBuilder path1 = new StringBuilder(sc.nextLine());
		StringBuilder path2 = new StringBuilder(sc.nextLine());
		sc.close();
		
		System.out.println(path1);
		System.out.println(path2);
		
		ArrayList<Integer> path1x = new ArrayList<Integer>();
		ArrayList<Integer> path1y = new ArrayList<Integer>();
		path1x.add(0);
		path1y.add(0);
		ArrayList<Integer> path2x = new ArrayList<Integer>();
		ArrayList<Integer> path2y = new ArrayList<Integer>();
		path2x.add(0);
		path2y.add(0);
		System.out.println("ehkä");
		Point one1 = createCoordinates(path1,path1x,path1y);
		Point two1 = createCoordinates(path2,path2x,path2y);
		System.out.println("toimi");
		for(int i=0;i<Math.max(path1.length(), path2.length());i++) {
			if(one1.returnX(i)==two1.returnX(i)&&one1.returnY(i)==two1.returnY(i)) {
				System.out.println("joo");
			}
		}
		
		
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
