/****************************************
   program:car DayOfWeek
   Authur: Prem
   Version:1.0
  
  ******************************************/

//package com.profound.util;

/*importing math and scanner class for math and user input function*/
import java.lang.Math;
import java.util.Scanner;

public class DayOfWeek 
{
	//decalaring variables
	static int m,d,y;
	static int y0,x,m0,d0;

    public static void main(String [] args)
	{ 
         m = Integer.parseInt(args[0]);
         d = Integer.parseInt(args[1]);
         y = Integer.parseInt(args[2]);
	// calcuating 
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
         int d0 = (d + x + (31*m0)/12) % 7;

        switch(d0)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
                break;                

        }
    }

}