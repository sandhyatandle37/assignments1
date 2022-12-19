package assignment1;
import java.util.Scanner;
public class Positive {
		public static void main(String[] args)
	{
	int n;
	//reading input from the user 
	System.out.println("enter any number ");
	//object scanner class
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	//checks the number is greater than 0 or not  
	if(n>0)
	{
	System.out.print(n+" is positive number ");
	}
	else{
	System.out.print(n+" is not positive ");
	}
	}}
