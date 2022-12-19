package assignment1;
	import java.util.Scanner;
	class Switch{
	public static void main(String[] args)
	{
	//reading input from the user 
	System.out.println("enter your choice: ");
	//object scanner class
	Scanner r=new Scanner(System.in);
	int ch=r.nextInt();
	// switch expression  
	switch(ch){
	//case statements within the switch block  
	case 1:System.out.println("Sunday");
	break;
	case 2:System.out.println("monday");
	break;
	case 3:System.out.println("tuesday");
	break;
	case 4:System.out.println("wednesday");
	break;
	case 5:System.out.println("thursday");
	break;
	case 6:System.out.println("friday");
	break;
	case 7:System.out.println("Saturday");
	break;
	default:System.out.println("invalid choice");
	}
	}}
