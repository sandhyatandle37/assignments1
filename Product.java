package assignment1;
import java.util.Scanner;
class Product
{
 public static void main(String atgs[]) {
	//declaring the variables
 int prod_id ,quantity; 
 float prod_price; 
 String prod_name,brand; 
 //object of scanner class
 Scanner b=new Scanner(System.in); 
 System.out.println("enter no of products u want to display:"); 
 int n=b.nextInt();
 for(int i=1;i<=n;i++) {
  System.out.println("enter product id"); 
  prod_id=b.nextInt(); 
  System.out.println("enter quantity"); 
  quantity=b.nextInt(); 
  System.out.println("enter product name"); 
  prod_name=b.next(); 
  System.out.println("enter brand name"); 
  brand=b.next(); 
  System.out.println("enter product price"); 
  prod_price=b.nextFloat(); 
//prints the product details
  System.out.println(prod_id); 
  System.out.println(quantity); 
  System.out.println(prod_name); 
  System.out.println(brand); 
  System.out.println(prod_price); 
 } 
}}
