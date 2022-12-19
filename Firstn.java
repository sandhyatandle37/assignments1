package assignment1;
import java.util.Scanner;
public class Firstn {
	public static void main(String[] args)
	{
	//intializing the variables
	int i, n;
	System.out.println("enter n value: ");
	//object of Scanner class  
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	//executes until the condition returns true  
	for(i=1;i<=n;i++)
	{
	//prints the natural numbers
	System.out.print(i+" " );
	}
	}}