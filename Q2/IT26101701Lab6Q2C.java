import java.util.Scanner;

public class IT26101701Lab6Q2C {
	
    public static void main(String[] args) {
		
		//Declaring and Initializing the variables
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		int sum = 0;
		double average;
		
		//Creating a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Prompting the user to enter 10 numbers
		System.out.println("Please enter 10 numbers: ");
		
		//Reading 10 numbers from the user   //Calculating the sum 
		System.out.print("Enter number 1: ");
		num1 = input.nextInt();
		sum += num1;
		
		System.out.print("Enter number 2: ");
		num2 = input.nextInt();
		sum += num2;
		
		System.out.print("Enter number 3: ");
		num3 = input.nextInt();
		sum += num3;
		
		System.out.print("Enter number 4: ");
		num4 = input.nextInt();
		sum += num4;
		
		System.out.print("Enter number 5: ");
		num5 = input.nextInt();
		sum += num5;
		
		System.out.print("Enter number 6: ");
		num6 = input.nextInt();
		sum += num6;
		
		System.out.print("Enter number 7: ");
		num7 = input.nextInt();
		sum += num7;
		
		System.out.print("Enter number 8: ");
		num8 = input.nextInt();
		sum += num8;
		
		System.out.print("Enter number 9: ");
		num9 = input.nextInt();
		sum += num9;
		
		System.out.print("Enter number 10: ");
		num10 = input.nextInt();
		sum += num10;
		
		//Calculating the average
		average = sum / 10.0;
		
		//Printing the numbers
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		System.out.print(num3 + " ");
		System.out.print(num4 + " ");
		System.out.print(num5 + " ");
		System.out.print(num6 + " ");
		System.out.print(num7 + " ");
		System.out.print(num8 + " ");
		System.out.print(num9 + " ");
		System.out.print(num10 + " ");
		
		//Printing the sum and average
		System.out.println();
		System.out.println();
		
		System.out.println("Sum of the numbers:" + sum);
		System.out.println("Average of the numbers:" + average);
		
    }
}
