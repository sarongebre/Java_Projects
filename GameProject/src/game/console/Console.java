package game.console;
import java.util.Collections;
import java.util.Scanner;

public class Console {
	protected static Scanner sc = new Scanner(System.in);

	protected static String singleDashLine =  String.join("", Collections.nCopies(80, "-"));
	protected static String doubleDashLine =  String.join("", Collections.nCopies(80, "-"));
	protected static String poundLine = String.join("", Collections.nCopies(80, "#"));


	protected static void singleDashLineGap(){ System.out.println("\n" + singleDashLine + "\n");};
	protected static void doubleDashLineGap(){ System.out.println("\n" + doubleDashLine + "\n");};
	protected static void poundLineGap(){ System.out.println("\n" + poundLine + "\n");};

	public static int numericInput(int fromNum, int toNum) {
		int intInputValue = 0;
		while (true) {
			String input = sc.nextLine();
			try {
				intInputValue = Integer.parseInt(input);

				if(intInputValue < fromNum) {
					System.out.println("Input is too low, try again");
				}
				else if (intInputValue > toNum)
					System.out.println("Input is too high,try again");
				else
					break;
			} catch (NumberFormatException ne) {
				System.out.println("Input is not a number,try again");
			}
			return intInputValue;
		}return intInputValue;
	}

public static boolean ynInputValue(String msg) {
	char cont = 'n';
	
	while (true) {
		System.out.println(msg + "(y/n): ");
		cont = sc.nextLine().charAt(0);
		Character.toLowerCase(cont);
		
		if(cont == 'y')
			return true;
		else if(cont == 'n')
			return false;
		else 
			System.out.println("Invalid input!");
	}
}
public static void pressEnterToContinue() {
	System.out.println("Press ENTER to continue...");
	
			Console.sc.nextLine();
}

}
