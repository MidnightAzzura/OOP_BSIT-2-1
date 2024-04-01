package Numbertoword;
import java.util.Scanner;

public class NumbertoWord {

	private static final String[] units = {"One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen"};
	
	private static final String[] tens = { " ", " ", "Twenty", "Thirty", "Forty", "Fifty",
			"Sixty", "Seventy", "Eighty", "Ninety"};
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		long number = 234;
		System.out.println("Num: " + numstoword(number));
		
		//try {
			//number = Long.parseLong(args[0]);
		//} catch (NumberFormatException e) {
			
			//System.out.println("Invalid Try again!");
			//return;
		//}
		
		//if(number < 0 || number > 999999999) {
			//System.out.println("Out of range with the input of the number try again");
			//return;
		//}
		
		
	}
	
	public static String numstoword(long number) {
		
		if(number == 0) {
			
			return "zero";		
	 } return numtoword(number).trim();
		
	}
	
	private static String numtoword(long number) {
        if (number < 20) {
            return units[(int) number - 1];
        }
        if (number < 100) {
            return tens[(int) (number / 10)] + " " + numtoword(number % 10);
        }
        if (number < 1000) {
            return units[(int) (number / 100) - 1] + " Hundred " + numtoword(number % 100);
        }
        if (number < 1000000) {
            return numtoword(number / 1000) + " Thousand " + numtoword(number % 1000);
        }
        return numtoword(number / 1000000) + " Million " + numtoword(number % 1000000);
    }

}
