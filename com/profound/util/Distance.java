**************************************************************
* Program : Euclidean distance
* Author: Prem*
* Date :  
**************************************************************/

package com.profound.util;
import java.lang.Math;
public class Distance
{
        public static void main(String [] args)
        {
        /*variable for storing three inputs from user*/
        int x,y;
        int distance;
        double result;
        x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[0]);
	distance=Math.sqrt(x*x+y*y);
	System.out.println("distance="+distance);
	}
}

}

