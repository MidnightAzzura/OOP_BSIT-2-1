package fibouser;
import java.util.Scanner;

interface fiboword{
	
	void print(int num);
}

//Class to print in numbers 

class numfibo implements fiboword{
	@Override
	
	public void print(int num) {
		
		int b1 = 0, b2 = 1;
		
		System.out.println("Fibonacci series upto " + num + " Element in num ");
		System.out.println(b1 + " " + b2 + " ");
		
		//for loop 
		for(int i = 3; i <= num; i++) {
			
			int next = b1 + b2;
			System.out.println(next + " ");
			b1 = b2;
			b2 = next;
		}
		
		System.out.println();
	}
	
}

class wordfibo implements fiboword{
	@Override
	public void print(int num) {
		
		String[]fibwords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "FIfteen",
				"Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
		int b1 = 0, b2 = 1;
		System.out.println("Fibonacci series upto " + num + "Element in num ");
		System.out.println(fibwords[b1]+ " " + fibwords[2]);
		
		// for loop
		for (int i = 3; i <= num; i++) {
			
			int next = b1 + b2;
			
				
				System.out.print(fibwords[next]+ " ");
				b1 = b2;
				b2 = next;
				
			
			System.out.println();
		}
		
		
   }
	
}

public class fibowordsornum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many elements?: " );
		int num = scanner.nextInt();
		
		//Ask the user
		System.out.println("1. Print in numbers");
		System.out.println("2. Print in words");
		System.out.println("Input your choice: ");
		int choice = scanner.nextInt();
		
		 fiboword printer;
	        if (choice == 1) {
	            printer = new numfibo();
	        } else {
	            printer = new wordfibo();
	        }
	        
	       
	        printer.print(num);
	        
	        scanner.close();

	}

}
