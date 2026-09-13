import java.util.Scanner;

public class IT26101701Lab6Q1 {
	
    public static void main(String[] args) {
		
		//Declaring the variables
		double number,square,squareRoot;
		
		//Creating a scanner object to read input
        Scanner input = new Scanner(System.in);

		//Prompting the user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextDouble();
		
		//Validating the input
		if (number <= 0){
			System.out.print("Error: The number must be greater than zero");
		}
		
		else {
			
			//Calculating the square of the number
			square = number * number;
			
			//Calculating the squareRoot of the number
			squareRoot = Math.sqrt(number);
		
		//Displaying the square and squareRoot
		System.out.println();
        System.out.println("The square of " + number + " is : " +square);
        System.out.println("The square root of " + number + " is : " +squareRoot);
		}
    }
}