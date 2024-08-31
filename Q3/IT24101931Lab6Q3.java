import java.util.Scanner;
public class  IT24101931Lab6Q3
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter positive integers (terminate input with -99):");
	int sumOfSquares = 0;
        int count = 0;
	while(true)
	{
	System.out.print("Enter a number :");
	int number=input.nextInt();
	if(number==-99){break;}
	else if(number>0){sumOfSquares += number * number;
                count++;}
	else {System.out.println("Invalid input.Please enter a positive integer or -99 to terminate");}
	}
	double rootMeanSquare = Math.sqrt((double)sumOfSquares / count);
        System.out.println("The Root Mean Square (RMS) is: " + rootMeanSquare);


	}

}
