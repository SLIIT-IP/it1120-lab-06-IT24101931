import java.util.Scanner;
public class IT24101931Lab6Q2C
{
	public static void main(String[] args)
	{
	int number1,number2,number3,number4,number5,number6,number7,number8,number9,number10;
	int sum;
	double average;
	Scanner input= new Scanner(System.in); 
	System.out.println("Please enter 10 numbers :");
	System.out.print("Please enter number 1 :");
	number1=input.nextInt();
	
	System.out.print("Please enter number 2 :");
	number2=input.nextInt();
 
	System.out.print("Please enter number 3 :");
	number3=input.nextInt();

	System.out.print("Please enter number 4 :");
	number4=input.nextInt();

	System.out.print("Please enter number 5 :");
	number5=input.nextInt();

	System.out.print("Please enter number 6 :");
	number6=input.nextInt();

	System.out.print("Please enter number 7 :");
	number7=input.nextInt();

	System.out.print("Please enter number 8 :");
	number8=input.nextInt();

	System.out.print("Please enter number 9 :");
	number9=input.nextInt();

	System.out.print("Please enter number 10 :");
	number10=input.nextInt();

	System.out.println("the number you entered are :");
	System.out.println(+number1+" "+number2+" "+number3+" "+number4+" "+number5+" "+number6+" "+number7+" "+number8+" "+number9+" "+number10);
	sum=number1+number2+number3+number4+number5+number6+number7+number8+number9+number10;
	average=sum/10;
	System.out.println("Sum of the numbers:"+sum);	
	System.out.println("Average of the numbers:"+average);
	
	
	}

}