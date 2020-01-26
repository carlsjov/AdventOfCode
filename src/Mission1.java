import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Integer> mass = new ArrayList<Integer>();
		ArrayList<Integer> fuelMass = new ArrayList<Integer>();
		String massesTxt = "C:\\Users\\carls\\Documents\\AdventOfCode\\masses_of_modules.txt";
		File masses = new File(massesTxt);
		Scanner scanner = new Scanner(masses);
		int fuel = 0;
		int fuelFull = 0;
		
		while(scanner.hasNextLine()) {
			mass.add(Integer.parseInt(scanner.nextLine()));
		}
		for(int i=0;i<mass.size();i++) {
			fuel = mass.get(i)/3 - 2;
			fuelMass.add(fuel);
			mass.set(i,fuel);
		}
		fuel = 0;
		for(int i=0;i<mass.size();i++) {
			fuel = fuel + mass.get(i) + fuelConsumption.fuelConsumption(fuelMass.get(i));
		}
		System.out.println(fuel);
		scanner.close();
	}

}

class fuelConsumption{
	public static int fuelConsumption(int f) {
		int s = 0;
		int t = f;
		while(t>=6) {
			t = (t/3)-2;
			s = s+t;
		}
		return s;
	}
}