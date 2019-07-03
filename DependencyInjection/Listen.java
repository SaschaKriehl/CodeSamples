import java.util.ArrayList;
import java.util.*;

public class Listen {
	public static void main (String args[]) {
		
		//private static final int ZEILEN = 10;
		int ZEILEN = 10;
		ArrayList<String> arrLi = new ArrayList<String>();
		
		for(int i = 1; i <= ZEILEN; i++) {
			for(int j = i/2; j <= ZEILEN; j++) {
				System.out.printf("   ");
			}
			arrLi.add("" + i);
			System.out.println(arrLi);
		}
		
		for(int i = 0; i < 85; i++)
			System.out.printf("*");
		System.out.println();
		
		ArrayList<String> aList = new ArrayList<String>();
		
		for(int i = 1; i <= 10; i++) {
			aList.add("Test" + i);
		}
		
		Iterator<String> iter = aList.iterator();
		
		while(iter.hasNext()) {
			System.out.println("E: " + aList + " I: " + iter.next());
			iter.remove();
		}
	}
}
