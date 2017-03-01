import java.util.Scanner;
class Calculator2
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first number?");
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter your Second number?");
		int secondNumber = scan.nextInt();
		
		System.out.println("What would you like to do?\n"+
						" Choose one of operator ( 1. add 2. minus 3. multiply 4. divide )");
		int operator = scan.nextInt();
		
		
		int result = 0;
		char  operatorInChar =' ' ;
		switch(operator)
		{
			case 1:
				result = firstNumber + secondNumber;
				operatorInChar = '+';
				break;
			case 2:
				result = firstNumber - secondNumber;
				operatorInChar = '-';
				break;
			case 3:
				result = firstNumber * secondNumber;
				operatorInChar = '*';
				break;
			case 4 : 
				if( secondNumber == 0)
				{
					System.out.println("This calculaotr cannot divide with zero");
					System.exit(0);
					
				}
				operatorInChar = '/';
				result = firstNumber / secondNumber;
				break;
			default : 
				System.out.println("Do not understand your operator. ");
				System.exit(0);
			
		}
		
		System.out.println(firstNumber + " "+ operatorInChar + " "+ secondNumber +" = "+result);
		
		scan.close();
		
	}
}
