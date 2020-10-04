
import java.util.Scanner;
public class Assignment4 {
	public static void main (String [] args) {
	
	Scanner scanner = new Scanner(System.in);
	 //Declaring the Variables
	boolean mark;
	double avg = 0.0,sum = 0;
	int inp = 0, count = 0;
	double max = 0;
	double min = 0;
	
	while(inp != -1)//Exit Statement 
	{
		
		//Initialized boolean in do while loop so it always reinitializes back to false
	mark = false; 
	//Input
	System.out.println("Enter a positive integer. Enter -1 to quit.");
	inp = scanner.nextInt();
	
	System.out.println(inp);
	

	if(inp != -1) {
		
		if(count == 0) {
		max = min = inp;
	}
		else
		{
			if(inp < min) min = inp;
			if(inp > max) max = inp;
		}
		
		//For loop
		for(int i = 2; i<=inp/2; i++)
		{

			if(inp % i == 0) {
				mark = true;
				break;
			}
		}
	
			//Boolean if statements (declaring the whether number is prime or not)
			if(!mark) {
				System.out.println("The number " + inp + " is a prime number.");
				
			}
			
			else {
				System.out.println("The number " + inp + " is not a prime number.");
			}
			//Counts the amount of times the user makes an input before exiting
			count = count+1;
			//Adds all the values of the inputs
			sum = (sum + inp);
			//Calculates the average by dividing the sum over the amount of inputs
			avg = sum/(count);
			
		
	}
	
		
	}
	
	//Outputs
	System.out.println("You have exited the loop, thank you for your time.\n");
	
	
	
	System.out.println("The max positive number is: " + max);
	System.out.println("The min positive number is: " + min);
	
	
	System.out.println("The sum of the numbers is: " + sum);	
	System.out.println("The count of number(s) is: " + count );
	System.out.println("The average is: " + avg);

	
	scanner.close();
	}

}
