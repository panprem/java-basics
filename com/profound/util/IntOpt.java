/**************************************************************
* Program : Performing various operation of arithmatic
* Author: Prem*
* Date :  
**************************************************************/

package com.profound.util;
import java.util.Scanner;
public class IntOpt

{
	
        /*variable for storing three inputs from user*/
 	static  int a,b,c;
        static  int choice;
        static  double result;

	public static void main(String [] args)
{
	Scanner  in=new Scanner(System.in);
	// initaializing variables
	System.out.println("Enter value of a:");
	a=in.nextInt();
	System.out.println("Enter value of b:");
        b=in.nextInt(); 
	System.out.println("Enter value of c:");
        c=in.nextInt();
	System.out.println("1:a+b*c");
	System.out.println("2:a*b+c");
	System.out.println("3:c+a/b");
	System.out.println("4:a%b+c");
	System.out.println("Enter your choice");
	choice=in.nextInt();
	/*operations*/
	switch(choice)
	{
	case 1:
	 result=a+b*c;
	System.out.println("Result="+result);	         
	break;
	case 2:
         result=a*b+c;
        System.out.println("Result="+result);            
        break;
        
	case 3:
         result=c+a/b;
        System.out.println("Result="+result);            
        break;
        case 4:
         result=a%b+c;
        System.out.println("Result="+result);            
        break;
	case 5:
	default:
  	System.out.println("Invalid");
	}
}
        
}

	
