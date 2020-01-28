import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\carls\\Documents\\AdventOfCode");
		Scanner sc = new Scanner(f);
		int x = 0;
		int y = 0;
		StringBuilder path1 = new StringBuilder(sc.nextLine());
		StringBuilder path2 = new StringBuilder(sc.nextLine());
		
		ArrayList<Integer> path1X = new ArrayList<Integer>();
		ArrayList<Integer> path1Y = new ArrayList<Integer>();
		ArrayList<Integer> path2X = new ArrayList<Integer>();
		ArrayList<Integer> path2Y = new ArrayList<Integer>();
		
		
		for(int i=0;i<path1.length();i++) {
			if(path1.charAt(i)=='R') {
				for(int j=x;j<=Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i)))+x;j++) {
					path1X.add(j);
					path1Y.add(y);
					x=Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i)))+x;
				}
			} else if(path1.charAt(i)=='L') {
				for(int j=x;j<=Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i)))-x;j++) {
					path1X.add(-j);
					path1Y.add(y);
					x=x+Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i)));
				}	
			} else if(path1.charAt(i)=='U') {
				for(int j=y;j<=Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i)))+y;j++) {
					path1Y.add(j);
					path1X.add(x);
					y=y+Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i)));
				}	
			} else if(path1.charAt(i)=='D') {
				for(int j=x;j<=Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i)))-y;j++) {
					path1Y.add(-j);
					path1X.add(y);
					y=y-Integer.parseInt(path1.substring(i+1,path1.indexOf(",", i)));
					//MIETI MATEMATIIKKAA
				}	
			}
		}
		
		sc.close();
	}

}
