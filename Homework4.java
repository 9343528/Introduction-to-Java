//אנה סספורטה(337664932), ויסאם אבו קוש(325325413). עבודה מס 4 

/**/
import java.util.Scanner;
public class Homework4 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 int option, number, n, m;//saves user's input
		 char ch; //saves user's input

		do  {
			
		option = getMenuChoice(); // print menu to user and get user's input
			 
		switch (option) {
			case 1 :
				System.out.println("Please enter positive integer: ");
				number = sc.nextInt();
				while (number < 0) {
					System.out.println("Wrong input! Please enter correct input ");
					number = sc.nextInt();
				}
 				System.out.println("The result is: " + addOneToAllDigits(number) + "\n");
			break;
			
			case 2 :
				System.out.println("Please enter a number of rows ");
				number = sc.nextInt();
				while (number < 0) {
					System.out.println("Wrong input! Please enter correct input ");
					number = sc.nextInt();
				}
			
				System.out.println("Please enter a character");
				number = sc.nextInt();
				ch = sc.next().charAt(0);
				printTriangleFrame(number, ch);
			break;		
			
			case 3:
				System.out.println("Please enter two positive integers: ");
				n = sc.nextInt();
				m = sc.nextInt();
				while (n < 0 || m < 0) {
					System.out.println("Wrong input! Please enter correct input ");
					n = sc.nextInt();
					m = sc.nextInt();}
				System.out.println("Prime numbers are : ");
				printPrimeNumbers(n, m);
				System.out.println();
			break;
				
			case 4:
				System.out.println("Please enter two positive integers: ");
				n = sc.nextInt();
				m = sc.nextInt();
				while (n > m) {
					System.out.println("Wrong input! Please enter correct input ");
					n = sc.nextInt();
					m = sc.nextInt();}
				printAllSortadNums(n, m);
			break;
				
				
		}	
		} while (option != 5);
		

	}
	
	private static int getMenuChoice ()
	{
		int option; //saves user's input
		System.out.print("1. Add one to all digits of the number\r\n"
				+ "2. Print triangle frame\r\n"
				+ "3. Print prime numbers\r\n"
				+ "4. Print sorted numbers\r\n"
				+ "5. Exit\r\n"
				+ "Please enter your choice:");
		option = sc.nextInt();
		while (option > 5 || option < 1) {
			System.out.println("Input incorrect! Please enter correct input: ");
			option = sc.nextInt();
			}
		if (option != 5)
			System.out.println("Your choice is " + option + " \n");
		
		return option;
	}
	
	private static int addOneToAllDigits (int num) {
		int result = 0;
		for (int i=1; num > 0; i=i*10) {
			if (num%10 != 9); 
				result += (num%10 + 1)*i;
			num /= 10;
		}
		
		return result;
	}
	
	private static void printTriangleFrame (int num, char ch) {
		for (int i = 0; i < num ; i ++)
			printRow(i, ch, num);		
	}

	private static void printRow (int rowNum, char ch, int num) { // פונקציית עזר

		for (int j = 0; j < num*2; j++) {
			if (j < (num - rowNum) || j >= (num + rowNum) )
				System.out.print(ch);
			else
				System.out.print(" ");	
		}
		System.out.print("\n");
				
	}
	
	private static void printPrimeNumbers (int n, int m) {
		if (n < m) {
			for (int i=n; i<m; i ++)
				if (isPrime(i))
					System.out.print(i + " "); 
			}
		else {
			for (int i=n; i>m; i --)
				if (isPrime(i))
					System.out.print(i + " "); }
		System.out.println();
	}

	private static boolean isPrime (int num) { //פונקציית עזר
	    if (num <= 1)     
	           return false;    
	       for (int i = 2; i <= Math.sqrt(num); i++)   
	           if (num % i == 0)   
	               return false;    
	       return true;   
	}
	
	private static boolean isSortedNum (int num) {
		
		while (num > 10) {
			if (num%10 < num/10%10) 
				return false;
			num/=10;}	
		return true;
	}
	
	private static void printAllSortadNums (int n, int m) {
		System.out.println ("The sorted numbers are :");
		for (int i = n; i < m; i ++) {
			if (isSortedNum (i))
				System.out.println(i);}
	}
}
