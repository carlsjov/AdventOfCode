import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
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

		ArrayList<String> coordinates1 = makeCoordinates(path1);
		ArrayList<String> coordinates2 = makeCoordinates(path2);
		ArrayList<String> cross = new ArrayList<String>();
		
		int x=0;
		int y=0;
		int x1=0;
		int y1=0;

		
		for(int i=0;i<coordinates1.size();i++){
			if(coordinates1.get(i).charAt(0)=='R') {
				for(int j=0;j<Integer.parseInt(coordinates1.get(i).substring(1,coordinates1.get(i).length()));j++) {
					for(int h=0;h<coordinates2.size();h++){
						if(coordinates2.get(h).charAt(0)=='R') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								x1++;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='L') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								x1--;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='U') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								y1++;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='D') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								y1--;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
					}
					x++;
					System.out.println("x:"+x+" y:"+y+" x1:"+x1+" y1:"+y1);
					x1=0;
					y1=0;
				}
			}
			if(coordinates1.get(i).charAt(0)=='L') {
				for(int j=0;j<Integer.parseInt(coordinates1.get(i).substring(1,coordinates1.get(i).length()));j++) {
					for(int h=0;h<coordinates2.size();h++){
						if(coordinates2.get(h).charAt(0)=='R') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								x1++;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='L') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								x1--;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='U') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								y1++;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='D') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								y1--;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
					}
					x--;
					System.out.println("x:"+x+" y:"+y+" x1:"+x1+" y1:"+y1);
					x1=0;
					y1=0;
				}
			}
			if(coordinates1.get(i).charAt(0)=='U') {
				for(int j=0;j<Integer.parseInt(coordinates1.get(i).substring(1,coordinates1.get(i).length()));j++) {
					for(int h=0;h<coordinates2.size();h++){
						if(coordinates2.get(h).charAt(0)=='R') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								x1++;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='L') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								x1--;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='U') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								y1++;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						else if(coordinates2.get(h).charAt(0)=='D') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								y1--;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
					}
					y++;
					System.out.println("x:"+x+" y:"+y+" x1:"+x1+" y1:"+y1);
					x1=0;
					y1=0;
				}
			}
			if(coordinates1.get(i).charAt(0)=='D') {
				for(int j=0;j<Integer.parseInt(coordinates1.get(i).substring(1,coordinates1.get(i).length()));j++) {
					for(int h=0;h<coordinates2.size();h++){
						if(coordinates2.get(h).charAt(0)=='R') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								x1++;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						if(coordinates2.get(h).charAt(0)=='L') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								x1--;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						if(coordinates2.get(h).charAt(0)=='U') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								y1++;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
						if(coordinates2.get(h).charAt(0)=='D') {
							for(int k=0;k<Integer.parseInt(coordinates2.get(h).substring(1,coordinates2.get(h).length()));k++) {
								y1--;
								testIfCrosses(x,y,x1,y1,cross);
							}
						}
					}
					y--;
					System.out.println("x:"+x+" y:"+y+" x1:"+x1+" y1:"+y1);
					x1=0;
					y1=0;
					
				}
			}
		}
		System.out.println("toimii");
		System.out.println(cross.toString());
		System.out.println(measureLength(cross));
	}
		
	public static void testIfCrosses(int x, int y, int x1, int y1, ArrayList<String> cross) {
		if(x==x1 && y==y1) {
			cross.add("X"+String.valueOf(x)+"Y"+String.valueOf(y));
			System.out.println(x+" "+y);
		}
	}
	
	public static ArrayList<String> makeCoordinates(StringBuilder path){
		ArrayList<String> a = new ArrayList<String>();
		for(int i=0;i<path.length();i++) {
			if(path.charAt(i)=='L') {
				if(path.indexOf(",",i)!=-1) {
					a.add(path.substring(i,path.indexOf(",", i)));
					i=path.indexOf(",", i);
				} else {
					a.add(path.substring(i));
				}
			}
			if(path.charAt(i)=='R') {
				if(path.indexOf(",",i)!=-1) {
					a.add(path.substring(i,path.indexOf(",", i)));
					i=path.indexOf(",", i);
				} else {
					a.add(path.substring(i));
				}
			}
			if(path.charAt(i)=='U') {
				a.add(path.substring(i,path.indexOf(",", i)));
				i=path.indexOf(",", i);
			}
			if(path.charAt(i)=='D') {
				a.add(path.substring(i,path.indexOf(",", i)));
				i=path.indexOf(",", i);
			}
		}
		return a;
	}
	
	public static int measureLength(ArrayList<String> c) {
	  	int x = Integer.parseInt(c.get(0).substring(1,c.get(0).indexOf("Y")));
	  	int y = Integer.parseInt(c.get(0).substring(c.get(0).indexOf("Y")+1,c.get(0).length()));
		int measure = x+y;		
		
		for(int i=0;i<c.size();i++){
			x = Integer.parseInt(c.get(i).substring(1,c.get(i).indexOf("Y")));
			y = Integer.parseInt(c.get(i).substring(c.get(i).indexOf("Y")+1,c.get(i).length()));
			Math.min(measure,x+y);
		}
		return measure;
	}
}
