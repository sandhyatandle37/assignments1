package assignment1;
	import java.util.Scanner;
	public class Greatest {
	public static void main(String[] args)
	{
	int a,b,c;
	//object of Scanner class  
	Scanner r=new Scanner(System.in);
	//reading input from the user 
	System.out.println("enter three numbers: ");
	a=r.nextInt();
	b=r.nextInt();
	c=r.nextInt();
	if(a>b)
	{
	if(a>c)
	//prints a if the above two conditions are true 
	System.out.print(a+" is greatest number ");
	else
	//prints c, if the condition defined in inner if is true and the condition defined in inner if is false  
	//means a>b,a<c
	System.out.print(c+" is greatest number ");
	}
	else {
	if(b>c)
		//prints b, the condition defined in inner if is true and the condition defined in inner if is false     
	System.out.print(b+" is not positive ");
	else
	//prints c, if the condition defined in both inner and outer loop is false  
	System.out.print(c+" is greatest number ");
	}
	}
	}

