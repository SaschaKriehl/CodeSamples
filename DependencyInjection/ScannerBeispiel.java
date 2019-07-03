import java.util.Scanner;
public class ScannerBeispiel {
	public static void main (String args[]) {
		
		boolean go = true;
		Scanner scanner = new Scanner(System.in);
		while(go) {
			System.out.printf("\nGeben Sie bitte einen STRING oder \'A\'bbruch ein: ");
			String myString = scanner.next();
			System.out.printf("Der eingegebene STRING lautet:\t\t\t %s",myString);
			if (myString.equals("A")) {
				go = false;
				System.out.printf("\n\tBye-Bye!");
			}
		}
		scanner.close();
		
		Scanner scn = new Scanner(System.in);
		int count = 0;
		
		while(scn.hasNext()) {
			if (scn.hasNextDouble()) {
				System.out.println(scn.nextDouble()); 
				count++;
			}
			if(count == 3){
				System.exit(0);
        
			}
		}
		scn.close();
		
	}
}
