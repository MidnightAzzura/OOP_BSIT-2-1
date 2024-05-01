package JavaAssignment;
import java.util.Scanner;

public class squarecalculator {
    
    private int num; // declaration

    public squarecalculator(){

        this.num = 0;
    }


    public void inputnum(){

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while(true){ // will check if the number is greater than 0 if not it will do a error needing to put number than 0
            
            try{ 
            System.out.print("Enter a number: ");
            this.num = Integer.parseInt(scanner.nextLine());

            if (this.num <=0){

                System.out.println("Enter other numbers please");
            } else {

                break;
            } 
            } catch (NumberFormatException e){

                System.out.println("Invalid Try Again");

         
               }
      }   
   }


    public double calculatesquare(){

        double squareRoot = 0;

        if(this.num > 0){

            squareRoot = Math.exp(0.5 * Math.log(this.num));

            squareRoot = Math.round(squareRoot * 100.0)/100.0;
        }

        return squareRoot;
    }

    

    public static void main(String[] args){
        squarecalculator  calculator = new squarecalculator();

        calculator.inputnum();

        double squareRoot = calculator.calculatesquare();
        System.out.println("The square root of " + calculator.num + " is approximately: " + squareRoot);
    }
        
}
 

