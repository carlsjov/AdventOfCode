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
		StringBuffer sb = new StringBuffer();
		while(sc.hasNextLine()) {
			sb.append(sc.next());
		}
		for(int i=0;i<sb.length();i++) {
			/*if(sb.charAt(i)==',') {
				continue;
			}else {*/
				if(sb.indexOf(",",i)==-1) {
					intProg.add(Integer.parseInt(sb.substring(i, sb.length())));
					break;
				} else {
						intProg.add(Integer.parseInt(sb.substring(i, sb.indexOf(",",i))));
						i=sb.indexOf(",", i);
						System.out.println("toimii" + sb.indexOf(",",i) + i);
				}
		}
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
		sc.close();
		System.out.println(intProg.get(0));
	}

}
