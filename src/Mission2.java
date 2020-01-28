import java.io.*;
import java.util.*;

public class Mission2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Integer> intProg = new ArrayList<Integer>();
		File f = new File("C:\\Users\\carls\\Documents\\AdventOfCode\\int_program.txt");
		int j=0;
		int s=0;
		StringBuffer h =new StringBuffer();
		StringBuffer sb = new StringBuffer();
		for(int b=0;b<100;b++) {
			for(int d=0;d<100;d++) {
				Scanner sc = new Scanner(f);
				sb.delete(0, sb.length());
				intProg.clear();
	
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
				for(int i=0;i<sb.length();i++) {
					if(sb.indexOf(",",i)==-1) {
						intProg.add(Integer.parseInt(sb.substring(i, sb.length())));
						break;
					} else {
						intProg.add(Integer.parseInt(sb.substring(i, sb.indexOf(",",i))));
						i=sb.indexOf(",", i);
					}
				}
				intProg.set(1,b);
				intProg.set(2,d);
				for(int i=4;i<intProg.size();i=i+4) {
					if (intProg.get(i-4)==99) {
						break;
					} else {
						j=i-4;
						if(intProg.get(j)==1) {
							if(intProg.get(j+1)>=intProg.size()||intProg.get(j+2)>=intProg.size()||intProg.get(i-1)>=intProg.size()){
								continue;
							}else {
								s=intProg.get(intProg.get(j+1))+intProg.get(intProg.get(j+2));
								intProg.set(intProg.get(i-1),s);
							}
						} else if(intProg.get(j)==2) {
							if(intProg.get(j+1)>=intProg.size()||intProg.get(j+2)>=intProg.size()||intProg.get(i-1)>=intProg.size()){
								continue;
							}else {
								s=intProg.get(intProg.get(j+1))*intProg.get(intProg.get(j+2));
								intProg.set(intProg.get(i-1),s);
							}
						}
					}
				}
				if(intProg.get(0)==19690720) {
					System.out.println("VOITTAJA: "+intProg.get(0)+" "+b+" "+d);
				}
				sc.close();
			}
		}
	}

}
