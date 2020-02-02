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
		System.out.println(path1.length());
		System.out.println(path2.length());
		sc.close();

		ArrayList<String> coordinates = new ArrayList<String>();
		
		int x = 0;
		int y = 0;
		
		int x1=0;
		int y1=0;
		
		for(int i=0;i<path1.length();i++) {
			if(path1.charAt(i)=='R') {
				for(int k=0;k<Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i+1)));k++) {
					x++;
				}
			} else if(path1.charAt(i)=='L') {
				for(int k=0;k<Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i+1)));k++) {
					x--;
				}
			} else if(path1.charAt(i)=='U') {
				for(int k=0;k<Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i+1)));k++) {
					y++;
				}
			} else if(path1.charAt(i)=='D') {
				for(int k=0;k<Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i+1)));k++) {
					y--;
				}
			}
			for(int j=0;j<path2.length();j++) {
				if(path2.charAt(j)=='R') {
					for(int k=0;k<Integer.parseInt(path2.substring(j+1,path2.indexOf(",", j)));k++) {
						x1++;
						//j=path2.indexOf(",",j);
					}
				} else if(path2.charAt(j)=='L') {
					for(int k=0;k<Integer.parseInt(path2.substring(j+1,path2.indexOf(",", j)));k++) {
						x1--;
						//j=path2.indexOf(",",j);
					}
				} else if(path2.charAt(j)=='U') {
					for(int k=0;k<Integer.parseInt(path2.substring(j+1,path2.indexOf(",", j)));k++) {
						y1++;
						//j=path2.indexOf(",",j);
					}
				} else if(path2.charAt(j)=='D') {
					for(int k=0;k<Integer.parseInt(path2.substring(j+1,path2.indexOf(",", j)));k++) {
						y1--;
						//j=path2.indexOf(",",j);
					}
				}
			}
			if(x==x1 && y==y1) {
				coordinates.add("X"+String.valueOf(x)+"Y"+String.valueOf(y));
				System.out.println(x+" "+y);
			} else {
				x1=0;
				y1=0;
			}
			System.out.println("toimi");
		}
	}
		
		
	
	
	public static Point createCoordinates(StringBuilder path, ArrayList<Integer> x, ArrayList<Integer> y){
		for(int i=0;i<path.length();i++) {
			if(path.charAt(i)=='R') {
				for(int j=x.get(x.size()-1)+1;j<=x.get(x.size()-1)+Integer.parseInt(path.substring(i+1,path.indexOf(",", i)));j++) {
					x.add(j);
					y.add(y.get(y.size()-1));
				}
			} else if(path.charAt(i)=='L') {
				for(int j=x.get(x.size()-1)+1;j>=x.get(x.size()-1)-Integer.parseInt(path.substring(i+1, path.indexOf(",", i)));j--) {
					x.add(j);
					y.add(y.get(y.size()-1));
				}	
			} else if(path.charAt(i)=='U') {
				for(int j=y.get(y.size()-1)+1;j<=y.get(y.size()-1)+Integer.parseInt(path.substring(i+1, path.indexOf(",", i)));j++) {
					y.add(j);
					x.add(x.get(x.size()-1));
				}	
			} else if(path.charAt(i)=='D') {
				for(int j=y.get(y.size()-1)+1;j>=y.get(y.size()-1)+Integer.parseInt(path.substring(i+1, path.indexOf(",", i)));j++) {
					y.add(j);
					x.add(x.get(x.size()-1));
					//MIETI MATEMATIIKKAA
				}	
			}
		}
		return new Point(x, y);
	}

}
