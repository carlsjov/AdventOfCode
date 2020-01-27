import java.io.*;
import java.util.*;

public class Mission2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Integer> intProg = new ArrayList<Integer>();
		File f = new File("C:\\Users\\carls\\Documents\\AdventOfCode\\int_program.txt");
		Scanner sc = new Scanner(f);
		int j=0;
		int s=0;
		StringBuffer h =new StringBuffer("0000");
		StringBuffer sb = new StringBuffer();
		
		while(sc.hasNextLine()) {
			sb.append(sc.next());
		}
		for(int i=0;i<sb.length();i++) {
			if(sb.indexOf(",",i)==-1) {
				intProg.add(Integer.parseInt(sb.substring(i, sb.length())));
				break;
			} else {
					intProg.add(Integer.parseInt(sb.substring(i, sb.indexOf(",",i))));
					i=sb.indexOf(",", i);
			}
		}
		while (intProg.get(0)!=19690720) {
			for(int i=0;i<sb.length();i++) {
				if(sb.indexOf(",",i)==-1) {
					intProg.add(Integer.parseInt(sb.substring(i, sb.length())));
					break;
				} else {
						intProg.add(Integer.parseInt(sb.substring(i, sb.indexOf(",",i))));
						i=sb.indexOf(",", i);
				}
			}
			h.replace(0, 3, Integer.toString((Integer.parseInt(h.substring(0, 4))+1)));
			while(h.length()!=4) {
				h.insert(0,0);
			}
			for(int i=0;i<4;i++) {
				intProg.set(i, Integer.parseInt(h.substring(i,i+1)));
			}
			System.out.println(h);
			for(int i=4;i<intProg.size();i=i+4) {
				if (intProg.get(i-4)==99) {
					break;
				} else {
					j=i-4;
					if(intProg.get(j)==1) {
						s=intProg.get(intProg.get(j+1))+intProg.get(intProg.get(j+2));
						intProg.set(intProg.get(i-1),s);
					} else if(intProg.get(j)==2) {
						s=intProg.get(intProg.get(j+1))*intProg.get(intProg.get(j+2));
						intProg.set(intProg.get(i-1),s);
					}
				}
			}
			System.out.println(intProg.get(0));
			System.out.println(h);
		}
		sc.close();
	}

}
