import java.util.Arrays; 
import java.util.Scanner;

public class Sort
{ 
	
	public static String sortString(String inputString) 
	{ 
		// converting to array using java function with we can also run a loop and use charAt() to store in addtional array
		char tempArray[] = inputString.toCharArray(); 
		
		// again using predefined Arrays function to sort but we can also create additionl say bubblesort
		Arrays.sort(tempArray); 
		
		// return new sorted string 
		return new String(tempArray); 
	} 
	
	// Driver method 
	public static void main(String[] args) 
	{ 
		var scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = scanner.nextLine();
		String outputString = sortString(inputString);
		System.out.println("Input String : " + inputString); 
		System.out.println("Output String : " + outputString);
		scanner.close(); 
	} 
} 
