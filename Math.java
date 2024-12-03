import java.util.Scanner;
public class FirstProgram{
	public static void main(String[] args){
		Scanner scrn = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int number1 = scrn.nextInt();
		
		System.out.print("Enter number 2: ");
		int number2 = scrn.nextInt();
		
		System.out.println("You entered number 1: " + number1);
		System.out.println("You entered number 2: " + number2);
		
		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		double quotient = number1/number2;
		
		System.out.print("Sum is: " + sum + " Difference is: " + difference + " Product is: " + product + " Quotient is: " + quotient);
		}
	}
	
