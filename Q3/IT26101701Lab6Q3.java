import java.util.Scanner;

public class IT26101701Lab6Q3 {
	
    public static void main(String[] args) {
		
		//Declaring the variables
		int number;
		double meanOfSquares, rms;
		
		//Declaring and Initializing variables to hold the sum of squares and the count of numbers
		double sumOfSquares = 0;
		int count = 0;
		
		//Craeting a scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Prompting the user to enter numbers
		System.out.println("Enter positive integers (terminate input with -99): ");
		
		//Reading numbers until -99 is encountered  //(Sentinal control loop)
		while (true) {
			
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if (number == -99) {
				break;
			}
			
			if (number > 0) {
				
				//Update the sum of squares and count
				sumOfSquares += Math.pow(number, 2);
				
				count++;
			}
			else {
				
				//Notify the user of invalid input (Negative number other than -99)
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate" );
				
			}
		}
		
		//Checking if any valid numbers were entered
		if (count > 0) {
				
			//Calculating the Root Mean Square (RMS)
			meanOfSquares = sumOfSquares / count;
			rms = Math.sqrt(meanOfSquares);
				
			//Printing the rms result
			System.out.println();
			System.out.println("The Root Mean Square (RMS) is: " + rms);
		}
		else{
				
			//NOtify the user of invalid input (Negative number other than =99)
			System.out.println("No positive numbers were entered" );
		}
	}
}	
