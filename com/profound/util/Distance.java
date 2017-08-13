
/***************************************************************
* Program : Euclidean distance
* Author: Prem*
* Date :  
**************************************************************/

package com.profound.util;
import java.lang.Math;
public class Distance
{
	/*variable for storing three inputs from user*/
	static	 int x,y;
        static   int distance;
        static   double result;

        public static void main(String [] args)
        {
        x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[0]);
	distance=(int)Math.sqrt(x*x+y*y);
	System.out.println("distance="+distance);
	}
}

