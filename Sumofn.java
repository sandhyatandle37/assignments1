package assignment1;
import java.util.Scanner;
public class Sumofn {
	public static void main(String[] args)
	{
	Scanner r=new Scanner(System.in);
	int a[]=new int[5];
	int sum=0;double avg;
	//creating an array
	System.out.println("enter elements in array: ");
	for(int i=0;i<a.length;i++)
	{
	a[i]=r.nextInt();
	}
	//prints array elements
	System.out.println("elements in array: ");
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]+" ");
	//adding a[i]to the sum variable
	sum=sum+a[i];
	}
	avg=sum/3;
	System.out.println("addition of elements in array:"+sum);
	System.out.println("avg of elements in array:"+avg);
	}}
