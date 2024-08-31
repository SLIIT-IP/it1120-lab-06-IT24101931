import java.util.Scanner;
public class It24101931Lab6Q1
{
	public static void main(String[] args)
	{
	int number;
	Scanner input= new Scanner(System.in); 
	System.out.print(" Enter a number :");
	number=input.nextInt();

	double square=number*number;
	double squareroot=Math.sqrt(number);
	System.out.println("the square of "+ number + " is :"+square);
	System.out.println("the square root of "+ number + " is :"+squareroot);
	}
}